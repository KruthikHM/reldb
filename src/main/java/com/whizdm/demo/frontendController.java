package com.whizdm.demo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;
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

    @GetMapping("/frontend/getplatform")
    @CrossOrigin
    public List<Object> queryplatform(){
        List<Object> l = repof.getplatform();
        System.out.println(l.toString());
        return l;
    }

    @GetMapping("/frontend/getimpactdata")
    @CrossOrigin
    public List<Object> queryimpact(){
        List<Object> l = repof.getimpact();
        System.out.println(l.toString());
        return l;
    }

    @GetMapping("/frontend/getimpact_areasdata")
    @CrossOrigin
    public List<Object> queryimpact_areas(){
        List<Object> l = repof.getimpact_areas();
        System.out.println(l.toString());
        return l;
    }

    @GetMapping("/frontend/getrelease_typedata")
    @CrossOrigin
    public List<Object> queryrelease_type(){
        List<Object> l = repof.getrelease_type();
        System.out.println(l.toString());
        return l;
    }

}
