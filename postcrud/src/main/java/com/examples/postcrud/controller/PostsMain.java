package com.examples.postcrud.controller;

import java.sql.SQLException;
import java.util.List;

import com.examples.postcrud.model.Posts;
import com.examples.postcrud.service.PostService;
import com.examples.postcrud.service.PostServiceImpl;

public class PostsMain {

	public static void main(String[] args) throws SQLException {
		// TODO Auto-generated method stub
		
		PostService service= new PostServiceImpl();
		List<Posts> posts = service.getAllPosts();
		for(Posts p:posts) {
			System.out.println(p.getPid()+" "+p.getTitle()+" "+p.getAuthor()+" "+p.getDescription());
		}
		

	}

}
