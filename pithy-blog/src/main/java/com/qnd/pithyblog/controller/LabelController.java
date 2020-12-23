package com.qnd.pithyblog.controller;

import com.qnd.pithyblog.service.LabelService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@CrossOrigin(origins = "*",maxAge = 3600)
public class LabelController {
    @Autowired
    LabelService service;

    @RequestMapping("getAllLabel")
    public List getAllLabel(){
        return service.getAllLabel();
    }

    @RequestMapping("getinsertLabel")
    public void getinsertLabel(@RequestParam String name){ service.getinsertLabel(name);}

    @RequestMapping("getupdateLabel")
    public void getupdateLabel(@RequestParam String name){ service.getupdateLabel(name);}

    @RequestMapping("getdeleteLabel")
    public void getdeleteLabel(@RequestParam String name){ service.getdeleteLabel(name);}
}
