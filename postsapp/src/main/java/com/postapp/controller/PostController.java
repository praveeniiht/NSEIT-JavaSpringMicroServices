package com.postapp.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import com.postapp.model.Posts;
import com.postapp.service.PostService;

@RestController
public class PostController {
	
	@Autowired
	PostService service;
	
	@GetMapping("/all")
	public List<Posts> showAllPosts(){
		return service.getAllPosts();
	}
	
	@GetMapping("/test")
	public String test(){
		return "hello";
	}

}
