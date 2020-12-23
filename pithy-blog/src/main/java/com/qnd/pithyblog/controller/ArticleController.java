package com.qnd.pithyblog.controller;


import com.qnd.pithyblog.domain.Article;
import com.qnd.pithyblog.service.ArticleService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.util.Date;
import java.util.List;
import java.util.Map;

@RestController
@CrossOrigin(origins = "*",maxAge = 3600)
public class ArticleController {
    @Autowired
    ArticleService service;

    @RequestMapping("getArticles")
    public List getUserByName(){
        return service.getAllArticles();
    }
    @RequestMapping("getArticleNum")
    public int getArticleNum(){
        return service.getArticleNum();
    }
    @RequestMapping("getArticle")
    public List getArticle(@RequestParam int index){
        return service.getArticle(index-1);
    }
    @RequestMapping("getCategoryArticleNum")
    public int getCategoryArticleNum(@RequestParam String category){
        return service.getCategoryArticleNum(category);
    }
    @RequestMapping("getCategoryArticleNumTen")
    public int getCategoryArticleNumTen(@RequestParam String category){
        return service.getCategoryArticleNumTen(category);
    }
    @RequestMapping("getCategoryArticle")
    public List getCategoryArticle(@RequestParam String category, @RequestParam int index){
        return service.getCategoryArticle(category, index-1);
    }

    @RequestMapping("getCategoryArticleTen")
    public List getCategoryArticleTen(@RequestParam String category, @RequestParam int index){
        return service.getCategoryArticleTen(category, index-1);
    }

    @RequestMapping("getLabelArticleNum")
    public int getLabelArticleNum(@RequestParam String label){
        return service.getLabelArticleNum(label);
    }
    @RequestMapping("getLabelArticle")
    public List getLabelArticle(@RequestParam String label, @RequestParam int index){
        return service.getLabelArticle(label, index-1);
    }
    @RequestMapping("getTitleArticleNum")
    public int getTitleArtileNum(@RequestParam String title){
        return service.getTitleArticleNum(title);
    }
    @RequestMapping("getTitleArticle")
    public List getTitleArtile(@RequestParam String title, @RequestParam int index){
        return service.getTitleArticle(title, index-1);
    }
    @RequestMapping("getinsertArticle")
    public void getinsertArticle(@RequestParam int id,String title,Date create_time,Date modify_time,String origin_content,
                              String processed_content,int visits,String category, String img_link){
        service.getinsertArticle(id,title,create_time,modify_time,origin_content,
                processed_content,visits,category,img_link);

    }
    @RequestMapping("getupdateArticle")
    public  void getupdateArticle(@RequestParam int id,String title,Date create_time,Date modify_time,String origin_content,
                                  String processed_content,int visits,String category, String img_link){
        service.getupdateArticle(id,title,create_time,modify_time,origin_content,
                processed_content,visits,category,img_link);

    }
    @RequestMapping("getdeleteArticle")
    public void getdeleteArticle(@RequestParam int id){
        service.getdeleteArticle(id);
    }
}