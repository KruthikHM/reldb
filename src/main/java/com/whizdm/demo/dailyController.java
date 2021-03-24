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
    @GetMapping("/daily/getfulldata")
    @CrossOrigin
    public List<daily_table> queryTable(){
        List<daily_table> m = repod.findfulldata();
        System.out.println(m.toString());
        return m;

    }

    @GetMapping("/daily/getpoddata")
    @CrossOrigin
    public List<Object> querypod(){
        List<Object> l = repod.findpod();
        System.out.println(l.toString());
        return l;
    }

    @GetMapping("/daily/getimpactdata")
    @CrossOrigin
    public List<Object> queryimpact(){
        List<Object> l = repod.findimpact();
        System.out.println(l.toString());
        return l;
    }

    @GetMapping("/daily/getimpactareasdata")
    @CrossOrigin
    public List<Object> queryimpactarea(){
        List<Object> l = repod.findimpactareas();
        System.out.println(l.toString());
        return l;
    }

    @GetMapping("/daily/getrelease_typedata")
    @CrossOrigin
    public List<Object> queryrelease_type(){
        List<Object> l = repod.findrelease_type();
        System.out.println(l.toString());
        return l;
    }

    @GetMapping("/daily/getgenericdata")
    @CrossOrigin
    public List<Object> querygeneric(){
        List<Object> l = repod.findgenerics();
        System.out.println(l.toString());
        return l;
    }

    @GetMapping("/daily/getbranch_namedata")
    @CrossOrigin
    public List<Object> querybranch_name(){
        List<Object> l = repod.findbranch_name();
        System.out.println(l.toString());
        return l;
    }

    @GetMapping("/daily/getsqlqueriesapproval")
    @CrossOrigin
    public List<Object> querysql_queries_approval(){
        List<Object> l = repod.findsql_queries_approval();
        System.out.println(l.toString());
        return l;
    }

}
