package com.maziv5.domain;
/*
 * @author maziV5
 * @version 1.0
 */

public class Link {
    private int link_id;
    private String link_name;
    private String link_url;
    private String link_desc;

    @Override
    public String toString() {
        return "Link{" +
                "link_id=" + link_id +
                ", link_name='" + link_name + '\'' +
                ", link_url='" + link_url + '\'' +
                ", link_desc='" + link_desc + '\'' +
                '}';
    }

    public int getLink_id() {
        return link_id;
    }

    public void setLink_id(int link_id) {
        this.link_id = link_id;
    }

    public String getLink_name() {
        return link_name;
    }

    public void setLink_name(String link_name) {
        this.link_name = link_name;
    }

    public String getLink_url() {
        return link_url;
    }

    public void setLink_url(String link_url) {
        this.link_url = link_url;
    }

    public String getLink_desc() {
        return link_desc;
    }

    public void setLink_desc(String link_desc) {
        this.link_desc = link_desc;
    }
}
