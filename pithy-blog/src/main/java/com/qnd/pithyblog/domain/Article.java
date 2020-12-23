package com.qnd.pithyblog.domain;

import java.util.Date;

public class Article {
    private int id;
    private String title;
    private Date create_time;
    private Date modify_time;
    private String origin_content;
    private String processed_content;
    private int visits;
    private String category;
    private String img_link;

    @Override
    public String toString() {
        return "Article{" +
                "id=" + id +
                ", title='" + title + '\'' +
                ", create_time=" + create_time +
                ", modify_time=" + modify_time +
                ", origin_content='" + origin_content + '\'' +
                ", processed_content='" + processed_content + '\'' +
                ", visits=" + visits +
                ", category='" + category + '\'' +
                ", img_link='" + img_link + '\'' +
                '}';
    }

    public int getId() {
        return id;
    }

    public String getTitle() {
        return title;
    }

    public Date getCreate_time() {
        return create_time;
    }

    public Date getModify_time() {
        return modify_time;
    }

    public String getOrigin_content() {
        return origin_content;
    }

    public String getProcessed_content() {
        return processed_content;
    }

    public int getVisits() {
        return visits;
    }

    public String getCategory() {
        return category;
    }

    public String getImg_link() {
        return img_link;
    }

    public void setId(int id) {
        this.id = id;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public void setCreate_time(Date create_time) {
        this.create_time = create_time;
    }

    public void setModify_time(Date modify_time) {
        this.modify_time = modify_time;
    }

    public void setOrigin_content(String origin_content) {
        this.origin_content = origin_content;
    }

    public void setProcessed_content(String processed_content) {
        this.processed_content = processed_content;
    }

    public void setVisits(int visits) {
        this.visits = visits;
    }

    public void setCategory(String category) {
        this.category = category;
    }

    public void setImg_link(String img_link) {
        this.img_link = img_link;
    }
}
