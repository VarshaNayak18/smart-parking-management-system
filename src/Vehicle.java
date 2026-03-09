import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

public class Vehicle {

    private String vehicleNumber;
    private String vehicleType;
    private long entryTime;

    public Vehicle(String vehicleNumber, String vehicleType){
        this.vehicleNumber = vehicleNumber;
        this.vehicleType = vehicleType;
        this.entryTime = System.currentTimeMillis();
    }

    public String getVehicleNumber(){
        return vehicleNumber;
    }

    public String getVehicleType(){
        return vehicleType;
    }

    public long getEntryTime() {
        return entryTime;
    }

    public String getFormattedEntryTime() {
        
        LocalDateTime time = LocalDateTime.ofEpochSecond(
            entryTime / 1000,
            0,
            java.time.ZoneOffset.UTC
        );
        
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("yyyy-MM-dd HH:mm:ss");
        
        return time.format(formatter);
    }
}