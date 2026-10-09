import java.util.Scanner;

class MovieTicketBooking {
    public static void main(String[] a) {
        Scanner input = new Scanner(System.in);

        System.out.println("Available Movies:");
        System.out.println("1. Leo");
        System.out.println("2. Jailer");
        System.out.println("3. Vikram");
        System.out.println("4. Master");
        System.out.println("5. Kaithi");
        System.out.print("Choose a movie from 1 to 5: ");

        int movieChoice = input.nextInt();

        System.out.println("Screen 1 is 4K and Screen 2 is IMAX");
        System.out.print("Choose screen (1 or 2): ");
        int screen = input.nextInt();

        System.out.print("Choose ticket price (60 for lower and 200 for top): ");
        int ticketPrice = input.nextInt();

        String movie = "";

        switch (movieChoice) {
            case 1: movie = "Leo"; break;
            case 2: movie = "Jailer"; break;
            case 3: movie = "Vikram"; break;
            case 4: movie = "Master"; break;
            case 5: movie = "Kaithi"; break;
            default: movie = "Unknown";
        }

        if (screen == 1) {
            if (ticketPrice == 60) {
                System.out.println("Screen 1 4K: Lower Seat Selected");
            } else {
                System.out.println("Screen 1 4K: Top Seat Selected");
            }
        } else {
            if (ticketPrice == 60) {
                System.out.println("Screen 2 IMAX: Lower Seat Selected");
            } else {
                System.out.println("Screen 2 IMAX: Top Seat Selected");
            }
        }

        System.out.println("Movie: " + movie);
        System.out.println("movie ticket has been successfully booked");
    }
}
