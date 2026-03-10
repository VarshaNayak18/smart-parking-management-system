import java.time.LocalDateTime;
import java.time.Instant;
import java.time.ZoneId;
import java.time.ZonedDateTime;
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
        
        Instant instant = Instant.ofEpochMilli(entryTime);
        ZonedDateTime istTime = instant.atZone(ZoneId.of("Asia/Kolkata"));
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("yyyy-MM-dd HH:mm:ss 'IST'");
        
        return istTime.format(formatter);
    }
}