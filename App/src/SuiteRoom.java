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