package com.maziv5.domain;
/*
 * @author maziV5
 * @version 1.0
 */

import com.fasterxml.jackson.annotation.JsonFormat;

import java.util.Date;

public class Article {
    private Integer art_id;
    private Integer art_sid;
    private String art_title;
    private String art_type;
    private String art_content;
    private String art_author;
    @JsonFormat(pattern = "yyyy-MM-dd")
    private Date art_addtime = new Date();
    private String art_source;

    @Override
    public String toString() {
        return "Article{" +
                "art_id=" + art_id +
                ", art_sid=" + art_sid +
                ", art_title='" + art_title + '\'' +
                ", art_type='" + art_type + '\'' +
                ", art_content='" + art_content + '\'' +
                ", art_author='" + art_author + '\'' +
                ", art_addtime=" + art_addtime +
                ", art_source='" + art_source + '\'' +
                '}';
    }

    public int getArt_id() {
        return art_id;
    }

    public void setArt_id(int art_id) {
        this.art_id = art_id;
    }

    public int getArt_sid() {
        return art_sid;
    }

    public void setArt_sid(int art_sid) {
        this.art_sid = art_sid;
    }

    public String getArt_title() {
        return art_title;
    }

    public void setArt_title(String art_title) {
        this.art_title = art_title;
    }

    public String getArt_type() {
        return art_type;
    }

    public void setArt_type(String art_type) {
        this.art_type = art_type;
    }

    public String getArt_content() {
        return art_content;
    }

    public void setArt_content(String art_content) {
        this.art_content = art_content;
    }

    public String getArt_author() {
        return art_author;
    }

    public void setArt_author(String art_author) {
        this.art_author = art_author;
    }

    public Date getArt_addtime() {
        return art_addtime;
    }

    public void setArt_addtime(Date art_addtime) {
        this.art_addtime = art_addtime;
    }

    public String getArt_source() {
        return art_source;
    }

    public void setArt_source(String art_source) {
        this.art_source = art_source;
    }
}
