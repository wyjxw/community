package com.nowcoder.community.dao;

import com.nowcoder.community.entity.Comment;
import org.apache.ibatis.annotations.Mapper;

import java.util.List;

@Mapper
public interface CommentMapper {

    // 显示帖子险详情
    List<Comment> selectCommentByEntity(int entityType, int entityId, int offset, int limit);

    // 分页
    int selectCountByEntity(int entityType, int entityId);

    int insertComment(Comment comment);

    Comment selectCommentById(int id);

}
