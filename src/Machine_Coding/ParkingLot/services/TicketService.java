package Machine_Coding.ParkingLot.services;

import Machine_Coding.ParkingLot.model.Ticket;
import Machine_Coding.ParkingLot.model.Vehicle_Type;

public class TicketService {
    public Ticket issueTicket(int gateId,
                              String vehicleNumber,
                              String ownerName,
                              Vehicle_Type vehicleType){
        Ticket ticket=new Ticket();
        return ticket;
    }
}
