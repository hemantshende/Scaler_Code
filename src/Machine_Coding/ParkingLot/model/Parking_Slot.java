package Machine_Coding.ParkingLot.model;

public class Parking_Slot extends Base_Entity{
    private String slotNumber;
    private Parking_Slot_Status parkingSlotStatus;
    private Vehicle_Type vehicleType;
    private ParkingFloor parkingFloor;

    public String getSlotNumber() {
        return slotNumber;
    }

    public void setSlotNumber(String slotNumber) {
        this.slotNumber = slotNumber;
    }

    public Parking_Slot_Status getParkingSlotStatus() {
        return parkingSlotStatus;
    }

    public void setParkingSlotStatus(Parking_Slot_Status parkingSlotStatus) {
        this.parkingSlotStatus = parkingSlotStatus;
    }

    public Vehicle_Type getVehicleType() {
        return vehicleType;
    }

    public void setVehicleType(Vehicle_Type vehicleType) {
        this.vehicleType = vehicleType;
    }

    public ParkingFloor getParkingFloor() {
        return parkingFloor;
    }

    public void setParkingFloor(ParkingFloor parkingFloor) {
        this.parkingFloor = parkingFloor;
    }
}
