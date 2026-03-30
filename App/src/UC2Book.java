public class UC2Book {

    public static void main(String[] args) {

        // Create Room Objects (Polymorphism)
        Room single = new SingleRoom();
        Room doubleRoom = new DoubleRoom();
        Room suite = new SuiteRoom();

        // Static availability variables
        int singleAvailable = 5;
        int doubleAvailable = 3;
        int suiteAvailable = 2;

        System.out.println("===== HOTEL ROOM DETAILS =====\n");

        // Display details
        single.displayRoomDetails();
        System.out.println("Available: " + singleAvailable);
        System.out.println("-----------------------------");

        doubleRoom.displayRoomDetails();
        System.out.println("Available: " + doubleAvailable);
        System.out.println("-----------------------------");

        suite.displayRoomDetails();
        System.out.println("Available: " + suiteAvailable);
        System.out.println("-----------------------------");

        System.out.println("\nApplication Terminated.");
    }
}