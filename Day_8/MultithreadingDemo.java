/**
 * Multithreading in Java using the Runnable Interface:
 * - Thread A implements Runnable and sleeps for 1000ms.
 * - Thread B implements Runnable and executes immediately.
 * Demonstrates thread creation, start(), sleep(), and concurrent execution.
 */
class A implements Runnable {
    @Override
    public void run() {
        try {
            System.out.println("Thread A has started and will sleep for 1000ms...");
            Thread.sleep(1000); // Sleep for 1 second (1000 ms)
        } catch (InterruptedException e) {
            System.out.println("Thread A was interrupted: " + e.getMessage());
        }
        System.out.println("Thread A is running (finished sleeping)");
    }
}

class B implements Runnable {
    @Override
    public void run() {
        System.out.println("Thread B is running immediately");
    }
}

public class MultithreadingDemo {
    public static void main(String[] args) {
        System.out.println("--- Main Thread Starting ---");

        // Creating Runnable instances and wrapping them into Thread objects
        Thread threadA = new Thread(new A(), "Worker-A");
        Thread threadB = new Thread(new B(), "Worker-B");

        // Starting both threads concurrently
        threadA.start();
        threadB.start();

        System.out.println("--- Main Thread Continuing Concurrent Execution ---");
    }
}
