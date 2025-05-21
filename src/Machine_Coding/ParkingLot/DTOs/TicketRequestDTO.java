package Machine_Coding.ParkingLot.DTOs;

import Machine_Coding.ParkingLot.model.Vehicle;
import Machine_Coding.ParkingLot.model.Vehicle_Type;

public class TicketRequestDTO {
    private String vehicleNumber;
    private String ownerName;
    private int gateID;
    private Vehicle_Type vehicleType;

    public String getVehicleNumber() {
        return vehicleNumber;
    }

    public void setVehicleNumber(String vehicleNumber) {
        this.vehicleNumber = vehicleNumber;
    }

    public String getOwnerName() {
        return ownerName;
    }

    public void setOwnerName(String ownerName) {
        this.ownerName = ownerName;
    }

    public int getGateID() {
        return gateID;
    }

    public void setGetID(int getID) {
        this.gateID = getID;
    }

    public Vehicle_Type getVehicleType() {
        return vehicleType;
    }

    public void setVehicleType(Vehicle_Type vehicleType) {
        this.vehicleType = vehicleType;
    }
}
