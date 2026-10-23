class SharedQueue {
    private int data;
    private boolean available = false;

    public synchronized void produce(int value) {
        while (available) {
            try {
                wait();
            } catch (InterruptedException e) {
                System.out.println(e.getMessage());
            }
        }
        data = value;
        available = true;
        System.out.println("Produced: " + data);
        notify();
    }

    public synchronized int consume() {
        while (!available) {
            try {
                wait();
            } catch (InterruptedException e) {
                System.out.println(e.getMessage());
            }
        }
        int value = data;
        available = false;
        System.out.println("Consumed: " + value);
        notify();
        return value;
    }
}

class ProducerThread extends Thread {
    private SharedQueue queue;

    ProducerThread(SharedQueue queue) {
        this.queue = queue;
    }

    @Override
    public void run() {
        for (int i = 1; i <= 5; i++) {
            queue.produce(i);
            try {
                Thread.sleep(150);
            } catch (InterruptedException e) {
                System.out.println(e.getMessage());
            }
        }
        System.out.println("Producer finished generating numbers.");
    }
}

class ConsumerThread extends Thread {
    private SharedQueue queue;

    ConsumerThread(SharedQueue queue) {
        this.queue = queue;
    }

    @Override
    public void run() {
        for (int i = 1; i <= 5; i++) {
            queue.consume();
            try {
                Thread.sleep(200);
            } catch (InterruptedException e) {
                System.out.println(e.getMessage());
            }
        }
        System.out.println("Consumer finished reading numbers.");
    }
}

public class ProducerConsumer {
    public static void main(String[] args) {
        SharedQueue queue = new SharedQueue();

        ProducerThread producer = new ProducerThread(queue);
        ConsumerThread consumer = new ConsumerThread(queue);

        System.out.println("=== Producer-Consumer Thread Communication ===");
        producer.start();
        consumer.start();
    }
}
