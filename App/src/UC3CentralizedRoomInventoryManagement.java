public class UC3CentralizedRoomInventoryManagement {

    public static void main(String[] args) {

        // Initialize inventory
        RoomInventory inventory = new RoomInventory();

        // Display initial inventory
        inventory.displayInventory();

        System.out.println("\n--- Updating Inventory ---");

        // Simulate booking (decrease availability)
        inventory.updateAvailability("Single Room", -1);
        inventory.updateAvailability("Suite Room", -1);

        // Simulate cancellation (increase availability)
        inventory.updateAvailability("Double Room", +1);

        System.out.println("\n--- Updated Inventory ---");

        // Display updated inventory
        inventory.displayInventory();

        System.out.println("\nApplication Terminated.");
    }
}