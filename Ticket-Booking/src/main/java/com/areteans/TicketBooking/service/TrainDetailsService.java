package com.areteans.TicketBooking.service;

import lombok.RequiredArgsConstructor;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Service;

import java.util.Map;

@Service
@RequiredArgsConstructor

public class TrainDetailsService {

    private final JdbcTemplate jdbctemplateTrainDet;

    public Map<String, Object> TrainAttributes(String trainID) {
        return jdbctemplateTrainDet.queryForMap("select * from ticket where trainid=?", trainID);
    }
}
