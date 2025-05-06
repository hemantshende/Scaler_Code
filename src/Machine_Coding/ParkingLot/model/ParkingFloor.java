package Machine_Coding.ParkingLot.model;

import java.util.List;

public class ParkingFloor extends Base_Entity{
    private String floorNumber;
    private List<Parking_Slot> parkingSlots;
    private ParkingFloor_Status parkingFloorStatus;
    private List<SupportedVehicleType> supportedVehicleTypes;

    public String getFloorNumber() {
        return floorNumber;
    }

    public void setFloorNumber(String floorNumber) {
        this.floorNumber = floorNumber;
    }

    public List<Parking_Slot> getParkingSlots() {
        return parkingSlots;
    }

    public void setParkingSlots(List<Parking_Slot> parkingSlots) {
        this.parkingSlots = parkingSlots;
    }

    public ParkingFloor_Status getParkingFloorStatus() {
        return parkingFloorStatus;
    }

    public void setParkingFloorStatus(ParkingFloor_Status parkingFloorStatus) {
        this.parkingFloorStatus = parkingFloorStatus;
    }

    public List<SupportedVehicleType> getSupportedVehicleTypes() {
        return supportedVehicleTypes;
    }

    public void setSupportedVehicleTypes(List<SupportedVehicleType> supportedVehicleTypes) {
        this.supportedVehicleTypes = supportedVehicleTypes;
    }
}
