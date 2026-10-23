class TicketCounter {
    private int tickets = 10;

    public synchronized void bookTicket(String customerName, int count) {
        System.out.println(customerName + " requested " + count + " ticket(s)...");

        if (tickets >= count) {
            tickets = tickets - count;
            System.out.println("SUCCESS: " + customerName + " booked " + count + " ticket(s). Remaining tickets: " + tickets);
        } else {
            System.out.println("FAILED: Sorry " + customerName + ", not enough tickets! Requested: " + count + ", Available: " + tickets);
        }
        System.out.println();
    }
}

class CustomerThread extends Thread {
    private TicketCounter counter;
    private String customerName;
    private int requestedTickets;

    CustomerThread(TicketCounter counter, String customerName, int requestedTickets) {
        this.counter = counter;
        this.customerName = customerName;
        this.requestedTickets = requestedTickets;
    }

    @Override
    public void run() {
        counter.bookTicket(customerName, requestedTickets);
    }
}

public class TicketBooking {
    public static void main(String[] args) {
        TicketCounter counter = new TicketCounter();

        CustomerThread c1 = new CustomerThread(counter, "Customer-1", 4);
        CustomerThread c2 = new CustomerThread(counter, "Customer-2", 4);
        CustomerThread c3 = new CustomerThread(counter, "Customer-3", 4);

        System.out.println("=== Ticket Booking Simulation Started (Initial Tickets: 10) ===\n");
        c1.start();
        c2.start();
        c3.start();
    }
}
