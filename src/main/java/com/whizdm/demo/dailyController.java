package com.whizdm.demo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
public class dailyController {

    @Autowired
    daily_repository repod;

    @PostMapping("/daily/populate")
    @CrossOrigin
    public Optional popu(@RequestBody daily_table dai){
        repod.save(dai);
        return repod.findById(dai.getSl_no());
    }

    @GetMapping(value = "/release_status")
    public List<Object> finddata() {
        List<Object> g = repod.finddata();
        return g;
    }
}