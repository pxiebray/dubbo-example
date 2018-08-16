package com.pxie.example.comment.service;

import com.alibaba.dubbo.config.annotation.Service;
import com.pxie.example.comment.CommentService;
import com.pxie.example.comment.vo.CommentInfo;

import java.util.List;

/**
 * @author pxie
 * @version 1.0
 * @data 2018/8/8 0008 25
 */
@Service
public class CommentServiceImpl implements CommentService {
    @Override
    public void add(CommentInfo commentInfo) {
        System.out.println(commentInfo.toString());
    }

    @Override
    public List<CommentInfo> get() {
        return null;
    }

    @Override
    public void delete(CommentInfo commentInfo) {
        System.out.println(commentInfo.toString());
    }
}
