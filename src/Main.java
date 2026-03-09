import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.println("Smart Parking System");

        System.out.print("Enter number of parking slots: ");
        int totalSlots = scanner.nextInt();

        ParkingLot parkingLot = new ParkingLot(totalSlots);

        while (true) {

            System.out.println("\n----- PARKING MENU -----");
            System.out.println("1. Park Vehicle");
            System.out.println("2. Remove Vehicle");
            System.out.println("3. Show Parking Status");
            System.out.println("4. Find Vehicle");
            System.out.println("5. Show Total Revenue");
            System.out.println("6. Exit");

            System.out.print("Enter choice: ");
            int choice = scanner.nextInt();

            if (choice == 1) {

                System.out.print("Enter vehicle number: ");
                String number = scanner.next();

                System.out.print("Enter vehicle type (Car/Bike): ");
                String type = scanner.next();

                if (!type.equalsIgnoreCase("Car") && !type.equalsIgnoreCase("Bike")) {
                    System.out.println("Invalid vehicle type. Only Car or Bike allowed.");
                    continue;
                }

                Vehicle vehicle = new Vehicle(number, type);
                parkingLot.parkVehicle(vehicle);

            }
            else if (choice == 2) {

                System.out.print("Enter slot number to remove vehicle: ");
                int slotNumber = scanner.nextInt();

                parkingLot.removeVehicle(slotNumber);

            }
            else if (choice == 3) {

                parkingLot.displayStatus();

            }
            else if (choice == 4) {
                
                System.out.print("Enter vehicle number to search: ");
                String number = scanner.next();
                parkingLot.findVehicle(number);
            }
            else if (choice == 5) {

                parkingLot.showTotalRevenue();
            }
            else if (choice == 6) {

                System.out.println("Exiting program");
                break;
            }
            else {

                System.out.println("Invalid choice. Please enter valid choice");
            }
        }
        scanner.close();
    }
}