import java.util.LinkedList;
import java.util.Queue;

class BookingRequestQueue {

    private Queue<Reservation> queue;

    public BookingRequestQueue() {
        queue = new LinkedList<>();
    }

    // Add request (enqueue)
    public void addRequest(Reservation reservation) {
        queue.offer(reservation);
        System.out.println("Request added for " + reservation.getGuestName());
    }

    // View all requests (without removing)
    public void displayQueue() {
        System.out.println("\n===== BOOKING REQUEST QUEUE =====");

        if (queue.isEmpty()) {
            System.out.println("No pending requests.");
            return;
        }

        for (Reservation r : queue) {
            r.displayRequest();
        }
    }

    // Peek next request (FIFO)
    public Reservation peekNextRequest() {
        return queue.peek();
    }

    // Remove next request (for future use case)
    public Reservation processNextRequest() {
        return queue.poll();
    }
}


