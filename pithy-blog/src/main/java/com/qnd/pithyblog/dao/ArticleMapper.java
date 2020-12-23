package com.qnd.pithyblog.dao;

import com.qnd.pithyblog.domain.Article;
import org.apache.ibatis.annotations.Mapper;
import org.springframework.stereotype.Repository;

import java.util.Date;
import java.util.List;

@Mapper
@Repository
public interface ArticleMapper {
    List<Article> selectAllArticles();
    int selectArticleNum();
    List selectArticle(int index);
    int selectCategoryArticleNum(String category);
    List selectArticleByCategory(String category, int index, int n);
    int selectLabelArticleNum(String label);
    List selectArticleByLabel(String label, int index);
    int selectTitleArticleNum(String title);
    List selectArticleByTitle(String title, int index, int n);
    void insertArticle(int id,String title,Date create_time,Date modify_time,String origin_content,
            String processed_content,int visits,String category, String img_link);
    void updateArticle(int id,String title,Date create_time,Date modify_time,String origin_content,
                       String processed_content,int visits,String category, String img_link);
    void deleteArticle(int id);

}
