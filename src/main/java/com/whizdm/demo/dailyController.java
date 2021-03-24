package com.whizdm.demo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import java.util.Optional;

@RestController
public class dailyController {

    @Autowired
    daily_repository repod;

    @PostMapping("/daily/populate")
    public Optional popu(@RequestBody daily_table dai){
        repod.save(dai);
        return repod.findById(dai.getSl_no());
    }

}
