package com.qnd.pithyblog.controller;

import com.qnd.pithyblog.service.CategoryService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@CrossOrigin(origins = "*",maxAge = 3600)
public class CategoryController {
    @Autowired
    CategoryService service;

    @RequestMapping("getCategoryNum")
    public int getCategoryNum(){
        return service.getCategoryNum();
    }

    @RequestMapping("getCategory")
    public List getCategory(@RequestParam int index){
        return service.getCategory((index-1)*10);
    }

    @RequestMapping("getinsertCategory")
    public void getinsertCategory(@RequestParam String name){ service.getinsertCategory(name);}

    @RequestMapping("getupdateCategory")
    public void getupdateCategory(@RequestParam String name){ service.getupdateCategory(name);}

    @RequestMapping("getdeleteCategory")
    public void getdeleteCategory(@RequestParam String name){ service.getdeleteCategory(name);}
}
