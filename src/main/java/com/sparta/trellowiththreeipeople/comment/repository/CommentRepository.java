package com.sparta.trellowiththreeipeople.comment.repository;

import com.sparta.trellowiththreeipeople.comment.entity.Comment;
import org.springframework.data.jpa.repository.JpaRepository;

public interface CommentRepository extends JpaRepository<Comment,Long> {

}
