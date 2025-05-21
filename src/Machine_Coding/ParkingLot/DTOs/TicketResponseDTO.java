package Machine_Coding.ParkingLot.DTOs;

public class TicketResponseDTO {
    private int ticketID;
    private String slotNumber;
    private Response_Status responseStatus;
    private String failureMessage;

    public int getTicketID() {
        return ticketID;
    }

    public void setTicketID(int ticketID) {
        this.ticketID = ticketID;
    }

    public String getSlotNumber() {
        return slotNumber;
    }

    public void setSlotNumber(String slotNumber) {
        this.slotNumber = slotNumber;
    }

    public Response_Status getResponseStatus() {
        return responseStatus;
    }

    public void setResponseStatus(Response_Status responseStatus) {
        this.responseStatus = responseStatus;
    }

    public String getFailureMessage() {
        return failureMessage;
    }

    public void setFailureMessage(String failureMessage) {
        this.failureMessage = failureMessage;
    }
}
