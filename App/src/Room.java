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
