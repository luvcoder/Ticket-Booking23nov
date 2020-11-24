package com.areteans.TicketBooking.service;

import lombok.RequiredArgsConstructor;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Service;



@Service
@RequiredArgsConstructor
public class TicketDeleteService {
    private final JdbcTemplate jdbcTemplatedeletion;

    public  void deleteTicket(Integer ticketID) {
       jdbcTemplatedeletion.update("Delete from ticket where ticketID=?", ticketID);
    }
    public void deleteCommonService(Integer passenger_id) {
         jdbcTemplatedeletion.update("Delete from passengers where passenger_id=?", passenger_id);
    }


}
