package com.pxie.example.user.vo;

import java.io.Serializable;

/**
 * @author pxie
 * @version 1.0
 * @data 2018/8/8 0008 47
 */
public class UserInfo implements Serializable {

    private Long id;
    private String name;
    private String icon;
    private String desc;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getIcon() {
        return icon;
    }

    public void setIcon(String icon) {
        this.icon = icon;
    }

    public String getDesc() {
        return desc;
    }

    public void setDesc(String desc) {
        this.desc = desc;
    }

    @Override
    public String toString() {
        return "UserInfo{" + "id=" + id + ", name='" + name + '\'' + ", icon='" + icon + '\'' + ", desc='" + desc + '\'' + '}';
    }
}
