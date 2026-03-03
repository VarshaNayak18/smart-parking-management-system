public class Main {
    public static void main(String[] args) {
        System.out.println("Smart Parking System");
        
        // Creating a vehicle object
        Vehicle v1 = new Vehicle("KA01AB1234", "Car");

        // Creating a parking slot
        ParkingSlot slot1 = new ParkingSlot(1);

        // Park vehicle
        slot1.parkVehicle(v1);
        
        System.out.println("Vehicle parked in slot: " + slot1.getSlotNumber());
        System.out.println("Is the slot occupied? " + slot1.isOccupied());

        // Remove vehicle
        slot1.removeVehicle();

        System.out.println("Vehicle removed from slot: " + slot1.getSlotNumber());
        System.out.println("Is the slot occupied? " + slot1.isOccupied());
    }
}
