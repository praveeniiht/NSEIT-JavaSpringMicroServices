package com.examples.postcrud.service;

import java.sql.SQLException;
import java.util.List;

import com.examples.postcrud.model.Posts;

public interface PostService {
	
	public List<Posts> getAllPosts() throws SQLException;
	public String inserPost(Posts posts) throws SQLException;

}
