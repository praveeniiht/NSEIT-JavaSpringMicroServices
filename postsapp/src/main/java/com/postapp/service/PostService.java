package com.postapp.service;

import java.sql.SQLException;
import java.util.List;

import org.springframework.stereotype.Service;

import com.postapp.model.Posts;



public interface PostService {
	public List<Posts> getAllPosts();
	
}
