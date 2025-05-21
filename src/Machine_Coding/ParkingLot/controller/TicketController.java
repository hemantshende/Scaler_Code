package Machine_Coding.ParkingLot.controller;

import Machine_Coding.ParkingLot.DTOs.TicketRequestDTO;
import Machine_Coding.ParkingLot.DTOs.TicketResponseDTO;
import Machine_Coding.ParkingLot.model.Ticket;
import Machine_Coding.ParkingLot.services.TicketService;

public class TicketController {
    private TicketService ticketService;

    TicketController(TicketService ticketService){
        this.ticketService=ticketService;
    }
    public TicketResponseDTO issueTicket(TicketRequestDTO request){
        TicketResponseDTO response=new TicketResponseDTO();
                Ticket ticket=ticketService.issueTicket(
                        request.getGateID(),
                        request.getVehicleNumber(),
                        request.getOwnerName(),
                        request.getVehicleType());

//                response.setTicketID(ticket);
        return response;
    }

}
