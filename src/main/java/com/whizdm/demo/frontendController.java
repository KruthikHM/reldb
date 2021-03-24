package com.whizdm.demo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import java.util.Optional;

@RestController
public class frontendController {
    @Autowired
    FrontendRepository repof;

    @PostMapping("/frontend/populate")
    public Optional popu(@RequestBody frontend_dropdown front){
        repof.save(front);
        return repof.findById(front.getSl_no());
    }

}
