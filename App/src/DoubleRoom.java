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