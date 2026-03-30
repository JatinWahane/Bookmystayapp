
import java.util.*;

public class UC4RoomSearch {

    public static void main(String[] args) {

        // Initialize inventory
        RoomInventory inventory = new RoomInventory();

        // Initialize room objects (domain)
        List<Room> rooms = new ArrayList<>();
        rooms.add(new SingleRoom());
        rooms.add(new DoubleRoom());
        rooms.add(new SuiteRoom());

        // Search service
        RoomSearchService searchService = new RoomSearchService(inventory, rooms);

        // Perform search (READ ONLY)
        searchService.searchAvailableRooms();

        System.out.println("\nSystem state remains unchanged.");
    }
}