package com.whizdm.demo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.context.event.ApplicationReadyEvent;
import org.springframework.context.event.EventListener;
import org.springframework.scheduling.annotation.Async;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

@RestController
public class mailController{

    @Autowired
    ReleaseRepository repo;

    @Autowired
    EmployeeRepository repoe;

    @Autowired
    private mailsenderservice service;

    @PostMapping("/mail/send")
    private String mail(@RequestBody ReleaseTableEntity rel){

        System.out.println(rel.toString());
        Long eid = rel.getEmpID();
        System.out.println(eid);
        Optional<Employees> resp = repoe.findById(eid);
        System.out.println("Hello");
        if(!resp.isPresent()){}
        Employees e = resp.get();

        String eemail = e.getEmployeeemail();
        String memail = rel.getManagerEmail();
        String qemail = rel.getQaEmail();

        ArrayList<String> mails = new ArrayList<String>();

        mails.add(eemail);
        mails.add(memail);
        mails.add(qemail);
        triggermail(mails);


        return "Hello";
    }


    public String triggermail(ArrayList<String> k){

        for (int i = 0; i < k.size(); i ++){
            service.sendSimpleEmail(k.get(i), "This is email", "hello guys");
        }
        return "sent";
    }

}
