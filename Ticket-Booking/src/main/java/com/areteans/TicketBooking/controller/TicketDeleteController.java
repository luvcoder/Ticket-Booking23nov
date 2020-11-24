package com.areteans.TicketBooking.controller;
import com.areteans.TicketBooking.service.TicketDeleteService;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.*;

@RestController
@RequiredArgsConstructor
@RequestMapping(path = "Delete")

public class TicketDeleteController {
    private final TicketDeleteService ticketDeleteService;

    @DeleteMapping(value = "ticket/{ticketID}")
    public void TicketDelete(@PathVariable("ticketID") Integer ticketID){
        ticketDeleteService.deleteTicket(ticketID);
    }

    @DeleteMapping(path = "passenger")
    public void PassengerDelete(@RequestParam(value = "passenger_id")Integer passenger_id){
         this.ticketDeleteService.deleteCommonService(passenger_id);
    }
}
