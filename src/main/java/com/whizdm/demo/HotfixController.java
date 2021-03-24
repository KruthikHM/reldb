package com.whizdm.demo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import java.util.Optional;

@RestController
public class HotfixController {

    @Autowired
    HotfixRepository repoh;

    @PostMapping("/hotfix/populate")
    public Optional popu(@RequestBody hotfix_entity hot){
        repoh.save(hot);
        return repoh.findById(hot.getSl_no());
    }

}
