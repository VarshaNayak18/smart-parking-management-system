import java.util.ArrayList;

public class ParkingLot {

    private ArrayList<ParkingSlot> slots;

    // Constructor
    public ParkingLot(int totalSlots) {
        slots = new ArrayList<>();

        for (int i = 1; i <= totalSlots; i++) {
            slots.add(new ParkingSlot(i));
        }
    }

    // Park vehicle in first available slot
    public void parkVehicle(Vehicle vehicle) {
        for (ParkingSlot slot : slots) {
            if (!slot.isOccupied()) {
                slot.parkVehicle(vehicle);
                System.out.println("Vehicle parked in slot: " + slot.getSlotNumber());
                return;
            }
        }
        System.out.println("Parking Lot Full!");
    }

    // Remove vehicle by slot number
    public void removeVehicle(int slotNumber) {
        if (slotNumber <= 0 || slotNumber > slots.size()) {
            System.out.println("Invalid Slot Number!");
            return;
        }

        ParkingSlot slot = slots.get(slotNumber - 1);

        if (slot.isOccupied()) {
            slot.removeVehicle();
            System.out.println("Vehicle removed from slot: " + slotNumber);
        } else {
            System.out.println("Slot already empty!");
        }
    }

    // Display available slots
    public void displayStatus() {
        for (ParkingSlot slot : slots) {
            System.out.println("Slot " + slot.getSlotNumber() +
                    " | Occupied: " + slot.isOccupied());
        }
    }
}
