package com.areteans.TicketBooking.controller;
import lombok.RequiredArgsConstructor;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import com.areteans.TicketBooking.service.CommonService;
import com.areteans.TicketBooking.service.StationService;
import com.areteans.TicketBooking.service.TicketService;
import com.areteans.TicketBooking.service.TrainService;
import java.util.Map;
@RestController
@RequiredArgsConstructor
@RequestMapping(path = "book")
public class TicketBookController {
    private final CommonService commonService;
    private final TicketService ticketService;
    private final TrainService trainService;
    private final StationService stationService;
    @PostMapping(path = "train", consumes = MediaType.APPLICATION_JSON_VALUE)
    public Map<String, Object> createDetail(@RequestBody Map<String, Object> train) {
        return train; }
    @PostMapping(path = "ticket", consumes = MediaType.APPLICATION_JSON_VALUE)
    public Map<String, Object> ticketDetail(@RequestBody Map<String, Object> ticket) {
        return ticket;}
        @PostMapping(path = "passenger", consumes = MediaType.APPLICATION_JSON_VALUE)
        public Map<String, Object> passengerDetail (@RequestBody Map < String, Object > Passenger){
            return Passenger;}
        @PostMapping(path = "station", consumes = MediaType.APPLICATION_JSON_VALUE)
        public Map<String, Object> stationDetail (@RequestBody Map < String, Object > Station){
            return Station;}
    }