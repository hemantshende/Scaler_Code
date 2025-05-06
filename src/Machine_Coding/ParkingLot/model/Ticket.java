package Machine_Coding.ParkingLot.model;

import java.util.Date;

public class Ticket extends Base_Entity{
    private Date entryTime;
    private Gate gate;
    private Parking_Slot parkingSlot;
    private Operator operator;
    private Vehicle vehicle;

    public Date getEntryTime() {
        return entryTime;
    }

    public void setEntryTime(Date entryTime) {
        this.entryTime = entryTime;
    }

    public Gate getGate() {
        return gate;
    }

    public void setGate(Gate gate) {
        this.gate = gate;
    }

    public Parking_Slot getParkingSlot() {
        return parkingSlot;
    }

    public void setParkingSlot(Parking_Slot parkingSlot) {
        this.parkingSlot = parkingSlot;
    }

    public Operator getOperator() {
        return operator;
    }

    public void setOperator(Operator operator) {
        this.operator = operator;
    }

    public Vehicle getVehicle() {
        return vehicle;
    }

    public void setVehicle(Vehicle vehicle) {
        this.vehicle = vehicle;
    }
}
