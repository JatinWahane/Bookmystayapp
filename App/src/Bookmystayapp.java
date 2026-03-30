// Version: 2.1

abstract class Room {
    private String roomType;
    private int beds;
    private double price;
    private double size;

    // Constructor
    public Room(String roomType, int beds, double price, double size) {
        this.roomType = roomType;
        this.beds = beds;
        this.price = price;
        this.size = size;
    }

    // Getters (Encapsulation)
    public String getRoomType() {
        return roomType;
    }

    public int getBeds() {
        return beds;
    }

    public double getPrice() {
        return price;
    }

    public double getSize() {
        return size;
    }

    // Abstract method
    public abstract void displayRoomDetails();
}

// Single Room Class
class SingleRoom extends Room {
    public SingleRoom() {
        super("Single Room", 1, 2000.0, 150.0);
    }

    @Override
    public void displayRoomDetails() {
        System.out.println("Room Type: " + getRoomType());
        System.out.println("Beds: " + getBeds());
        System.out.println("Price: ₹" + getPrice());
        System.out.println("Size: " + getSize() + " sq.ft");
    }
}

// Double Room Class
class DoubleRoom extends Room {
    public DoubleRoom() {
        super("Double Room", 2, 3500.0, 250.0);
    }

    @Override
    public void displayRoomDetails() {
        System.out.println("Room Type: " + getRoomType());
        System.out.println("Beds: " + getBeds());
        System.out.println("Price: ₹" + getPrice());
        System.out.println("Size: " + getSize() + " sq.ft");
    }
}

// Suite Room Class
class SuiteRoom extends Room {
    public SuiteRoom() {
        super("Suite Room", 3, 6000.0, 400.0);
    }

    @Override
    public void displayRoomDetails() {
        System.out.println("Room Type: " + getRoomType());
        System.out.println("Beds: " + getBeds());
        System.out.println("Price: ₹" + getPrice());
        System.out.println("Size: " + getSize() + " sq.ft");
    }
}

// Main Class
public class Bookmystayapp {

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