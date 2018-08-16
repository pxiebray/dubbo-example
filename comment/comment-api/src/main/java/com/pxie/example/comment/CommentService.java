package com.pxie.example.comment;

import com.pxie.example.comment.vo.CommentInfo;

import java.util.List;

/**
 * @author Administrator
 * @version 1.0
 * @data 2018/8/8 0008 18
 */
public interface CommentService {

    void add(CommentInfo commentInfo);

    List<CommentInfo> get();

    void delete(CommentInfo commentInfo);
}
