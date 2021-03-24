package com.whizdm.demo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;
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
    @GetMapping("/daily/getfulldata")
    public List<daily_table> queryTable(){
        List<daily_table> m = repod.findfulldata();
        System.out.println(m.toString());
        return m;

    }

    @GetMapping("/daily/getpoddata")
    public List<Object> querypod(){
        List<Object> l = repod.findpod();
        System.out.println("Hello guys");
        System.out.println(l.toString());
        return l;
    }


}
