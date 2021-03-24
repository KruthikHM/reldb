package com.whizdm.demo;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import java.util.Optional;

@RestController
public class EmployeeController {

    @Autowired
    EmployeeRepository repose;

    @PostMapping("/employees/populate")
    public Optional popu(@RequestBody Employees emp){
        repose.save(emp);
        Optional o = repose.findById(emp.getEmp_id());
        return o;
    }
}
