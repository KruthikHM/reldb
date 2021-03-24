package com.whizdm.demo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;
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


        /*
    private Long sl_no;
    private String pod;
    private String impact_areas;
    private String impact;
    private String release_status;
    private String approved_by;
    private String type_of_release;
     */

    @PostMapping("/hotfix/getpoddata")
    @CrossOrigin
    public List<Object> poddata(){
        List<Object> l = repoh.pod();
        System.out.println(l.toString());
        return l;
    }

    @PostMapping("/hotfix/getimpact_areasdata")
    @CrossOrigin
    public List<Object> impact_areas(){
        List<Object> l = repoh.impact_areas();
        System.out.println(l.toString());
        return l;
    }

    @PostMapping("/hotfix/getimpactdata")
    @CrossOrigin
    public List<Object> impact(){
        List<Object> l = repoh.impact();
        System.out.println(l.toString());
        return l;
    }

    @PostMapping("/hotfix/getrelease_statusdata")
    @CrossOrigin
    public List<Object> release_status(){
        List<Object> l = repoh.release_status();
        System.out.println(l.toString());
        return l;
    }

    @PostMapping("/hotfix/getapproved_bydata")
    @CrossOrigin
    public List<Object> approved_by(){
        List<Object> l = repoh.approved_by();
        System.out.println(l.toString());
        return l;
    }

    @PostMapping("/hotfix/gettype_of_releasedata")
    @CrossOrigin
    public List<Object> type_of_release(){
        List<Object> l = repoh.type_of_release();
        System.out.println(l.toString());
        return l;
    }

}
