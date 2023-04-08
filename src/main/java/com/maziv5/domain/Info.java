package com.maziv5.domain;
/*
 * @author maziV5
 * @version 1.0
 */

public class Info {
    private Integer info_id;
    private String info_name;
    private String info_content;

    @Override
    public String toString() {
        return "Info{" +
                "info_id=" + info_id +
                ", info_name='" + info_name + '\'' +
                ", info_content='" + info_content + '\'' +
                '}';
    }

    public Integer getInfo_id() {
        return info_id;
    }

    public void setInfo_id(Integer info_id) {
        this.info_id = info_id;
    }

    public String getInfo_name() {
        return info_name;
    }

    public void setInfo_name(String info_name) {
        this.info_name = info_name;
    }

    public String getInfo_content() {
        return info_content;
    }

    public void setInfo_content(String info_content) {
        this.info_content = info_content;
    }
}
