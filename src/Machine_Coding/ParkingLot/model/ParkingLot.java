package Machine_Coding.ParkingLot.model;

import java.util.List;

public class ParkingLot extends Base_Entity{
    private String name;
    private List<ParkingFloor> parkingFloors;
    private List<Gate> entryGate;
    private List<Gate> exitGate;
    private ParkingLot_Status parkingLotStatus;
    private List<SupportedVehicleType> supportedVehicleType;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public List<ParkingFloor> getParkingFloors() {
        return parkingFloors;
    }

    public void setParkingFloors(List<ParkingFloor> parkingFloors) {
        this.parkingFloors = parkingFloors;
    }

    public List<Gate> getEntryGate() {
        return entryGate;
    }

    public void setEntryGate(List<Gate> entryGate) {
        this.entryGate = entryGate;
    }

    public List<Gate> getExitGate() {
        return exitGate;
    }

    public void setExitGate(List<Gate> exitGate) {
        this.exitGate = exitGate;
    }

    public ParkingLot_Status getParkingLotStatus() {
        return parkingLotStatus;
    }

    public void setParkingLotStatus(ParkingLot_Status parkingLotStatus) {
        this.parkingLotStatus = parkingLotStatus;
    }

    public List<SupportedVehicleType> getSupportedVehicleType() {
        return supportedVehicleType;
    }

    public void setSupportedVehicleType(List<SupportedVehicleType> supportedVehicleType) {
        this.supportedVehicleType = supportedVehicleType;
    }
}
