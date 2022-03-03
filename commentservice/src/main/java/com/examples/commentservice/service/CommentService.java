package com.examples.commentservice.service;

import java.util.List;

import com.examples.commentservice.model.Comments;

public interface CommentService {
	
	public String insertComment(Comments comment);
    public List<Comments> displayAllComments();
    public String deleteComment(int cid);
    public List<Comments> searchCommentsByCommenter(String commenter);
	public List<Comments> searchCommentsByPostId(int pid);

}
