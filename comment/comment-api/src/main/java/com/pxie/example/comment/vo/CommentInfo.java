package com.pxie.example.comment.vo;

import java.io.Serializable;

/**
 * @author Administrator
 * @version 1.0
 * @data 2018/8/8 0008 18
 */
public class CommentInfo implements Serializable {
    private Long id;
    private String content;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getContent() {
        return content;
    }

    public void setContent(String content) {
        this.content = content;
    }

    @Override
    public String toString() {
        return "CommentInfo{" + "id=" + id + ", content='" + content + '\'' + '}';
    }
}
