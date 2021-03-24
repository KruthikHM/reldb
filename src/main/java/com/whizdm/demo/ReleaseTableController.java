package com.whizdm.demo;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
public class ReleaseTableController {

    @Autowired
    ReleaseRepository repo;

    @PostMapping("/reg")
    public Optional reg(@RequestBody ReleaseTableEntity rel){
        repo.save(rel);
        Optional o = repo.findById(rel.getEmpID());
        return o;
    }

    

}
