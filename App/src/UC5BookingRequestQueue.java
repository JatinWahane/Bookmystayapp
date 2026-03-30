import java.util.*;

public class UC5BookingRequestQueue {

    public static void main(String[] args) {

        BookingRequestQueue bookingQueue = new BookingRequestQueue();

        // Simulating incoming booking requests
        bookingQueue.addRequest(new Reservation("Alice", "Single Room"));
        bookingQueue.addRequest(new Reservation("Bob", "Suite Room"));
        bookingQueue.addRequest(new Reservation("Charlie", "Double Room"));
        bookingQueue.addRequest(new Reservation("David", "Single Room"));

        // Display queue (order must be preserved)
        bookingQueue.displayQueue();

        // Show next request (without removing)
        System.out.println("\nNext request to process:");
        Reservation next = bookingQueue.peekNextRequest();
        if (next != null) {
            next.displayRequest();
        }

        System.out.println("\nNote: No inventory changes performed.");
        System.out.println("Application Terminated.");
    }
}