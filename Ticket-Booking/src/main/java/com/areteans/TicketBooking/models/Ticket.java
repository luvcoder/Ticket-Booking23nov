package com.areteans.TicketBooking.models;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;
@Getter
@Setter
@AllArgsConstructor
public class Ticket {
    private int ticketID;
    private  String status;
    private int trainID;
    private int stationID_D;
    private int stationID_A;
    private int berthnumber;
    private int DepartureTime;
}
