package Machine_Coding.ParkingLot.model;

public class Gate extends Base_Entity{
    private String gateNUmber;
    private Gate_Status gateStatus;
    private ParkingLot parkingLot;
    private Gate_Type gateType;
    private Operator operator;

    public String getGateNUmber() {
        return gateNUmber;
    }

    public void setGateNUmber(String gateNUmber) {
        this.gateNUmber = gateNUmber;
    }

    public Gate_Status getGateStatus() {
        return gateStatus;
    }

    public void setGateStatus(Gate_Status gateStatus) {
        this.gateStatus = gateStatus;
    }

    public ParkingLot getParkingLot() {
        return parkingLot;
    }

    public void setParkingLot(ParkingLot parkingLot) {
        this.parkingLot = parkingLot;
    }

    public Gate_Type getGateType() {
        return gateType;
    }

    public void setGateType(Gate_Type gateType) {
        this.gateType = gateType;
    }

    public Operator getOperator() {
        return operator;
    }

    public void setOperator(Operator operator) {
        this.operator = operator;
    }
}
