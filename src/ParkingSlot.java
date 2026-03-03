public class ParkingSlot {

    private int slotNumber;
    private boolean isOccupied;
    private Vehicle parkedVehicle;

    public ParkingSlot(int slotNumber) {
        this.slotNumber = slotNumber;
        this.isOccupied = false;
        this.parkedVehicle = null;
    }

    public int getSlotNumber() {
        return slotNumber;
    }

    // Check if slot is occupied
    public boolean isOccupied() {
        return isOccupied;
    }

    // Get parked vehicle
    public Vehicle getParkedVehicle() {
        return parkedVehicle;
    }

    // Park a vehicle
    public void parkVehicle(Vehicle vehicle) {
        this.parkedVehicle = vehicle;
        this.isOccupied = true;
    }

    // Remove vehicle
    public void removeVehicle() {
        this.parkedVehicle = null;
        this.isOccupied = false;
    }
}
