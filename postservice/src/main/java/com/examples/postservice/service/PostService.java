package com.examples.postservice.service;

import java.util.List;

import com.examples.postservice.model.CommentsDto;
import com.examples.postservice.model.Posts;

public interface PostService {
	
	 public String insertPost(Posts post);
	 public List<Posts> displayAllPosts();
	 public String deletePost(int postId);
	 public List<Posts> searchPostsByAuthor(String author);
	public List<Posts> searchPostsByTitle(String title);
	
	public List<CommentsDto> searchCommentsByPid(int pid);
	

}
