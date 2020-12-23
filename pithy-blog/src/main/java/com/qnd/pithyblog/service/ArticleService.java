package com.qnd.pithyblog.service;

import com.qnd.pithyblog.dao.ArticleMapper;
import com.qnd.pithyblog.domain.Article;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Date;
import java.util.List;

@Service
public class ArticleService {
    @Autowired
    ArticleMapper articleMapper;
    private Article article;

    public List<Article> getAllArticles(){
        return articleMapper.selectAllArticles();
    }
    public int getArticleNum(){
        return articleMapper.selectArticleNum()/3+1;
    }
    public List getArticle(int index){
        return articleMapper.selectArticle(index*3);
    }
    public int getCategoryArticleNum(String category){
        return articleMapper.selectCategoryArticleNum(category)/3+1;
    }
    public int getCategoryArticleNumTen(String category){
        return articleMapper.selectCategoryArticleNum(category)/10+1;
    }
    public List getCategoryArticle(String category, int index){
        return articleMapper.selectArticleByCategory(category, index*3, 3);
    }

    public List getCategoryArticleTen(String category, int index){
        return articleMapper.selectArticleByCategory(category, index*10, 10);
    }

    public int getLabelArticleNum(String label){
        return articleMapper.selectLabelArticleNum(label)/3+1;
    }
    public List getLabelArticle(String label, int index){
        return articleMapper.selectArticleByLabel(label, index*3);
    }
    public int getTitleArticleNum(String title){
        return articleMapper.selectTitleArticleNum(title)/3+1;
    }
    public List getTitleArticle(String title, int index){
        return articleMapper.selectArticleByTitle(title, index*3, 3);
    }
    public void getinsertArticle(int id, String title, Date create_time, Date modify_time, String origin_content,
                              String processed_content, int visits, String category, String img_link){
        articleMapper.insertArticle(id,title,create_time,modify_time,origin_content,
                processed_content,visits,category, img_link);}
    public void getupdateArticle(int id, String title, Date create_time, Date modify_time, String origin_content,
                                  String processed_content, int visits, String category, String img_link){
        articleMapper.updateArticle(id,title,create_time,modify_time,origin_content,
                processed_content,visits,category, img_link);}
    public void getdeleteArticle(int id){
        articleMapper.deleteArticle(id);
    }
}
