package com.examples.commentservice.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.examples.commentservice.model.Comments;
import com.examples.commentservice.repo.CommentsRepo;


@Service
public class CommentServiceImpl implements CommentService{
	
	@Autowired
	CommentsRepo repo;

	@Override
	public String insertComment(Comments comment) {
		// TODO Auto-generated method stub
		repo.save(comment);
		return "Comment Added";
	}

	@Override
	public List<Comments> displayAllComments() {
		// TODO Auto-generated method stub
		return repo.findAll();
	}

	@Override
	public String deleteComment(int cid) {
		// TODO Auto-generated method stub
		repo.deleteById(cid);
		return "Comment Deleted";
	}

	@Override
	public List<Comments> searchCommentsByCommenter(String commenter) {
		// TODO Auto-generated method stub
		return repo.searchCommentsByCommenter(commenter);
	}

	@Override
	public List<Comments> searchCommentsByPostId(int pid) {
		// TODO Auto-generated method stub
		return repo.searchCommentsByPostId(pid);
	}

}
