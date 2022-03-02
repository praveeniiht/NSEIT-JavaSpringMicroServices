package com.postapp.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.postapp.model.Posts;
import com.postapp.repo.PostsRepo;


@Service
public class PostServiceImpl implements PostService{
	
	@Autowired
	PostsRepo dao;

	@Override
	public List<Posts> getAllPosts() {
		// TODO Auto-generated method stub
		return (List<Posts>) dao.findAll();
	}

}
