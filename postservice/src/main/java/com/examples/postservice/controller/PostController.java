package com.examples.postservice.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.examples.postservice.model.CommentsDto;
import com.examples.postservice.model.Posts;
import com.examples.postservice.service.PostService;

@RestController
@RequestMapping("/posts")
public class PostController {
	
	@Autowired
	PostService service;
	
	@GetMapping("/all")
	public List<Posts> showAll(){
		return service.displayAllPosts();
	}
	
	@PostMapping("/add")
	public String addPost(@RequestBody Posts post) {
		return service.insertPost(post);
	}
	
	@DeleteMapping("/delete/{pid}")
	public String deletepost(@PathVariable("pid") int pid) {
		return service.deletePost(pid);
	}
	
	@GetMapping("/author/{author}")
	public List<Posts> searchByAuthor(@PathVariable("author") String author) {
			return service.searchPostsByAuthor(author);
	}
	
	@GetMapping("/title/{title}")
	public List<Posts> searchByTitle(@PathVariable("title") String title) {
			return service.searchPostsByTitle(title);
	}
	
	@GetMapping("/comments/{pid}")
	public List<CommentsDto> findByPid(@PathVariable("pid")int pid){
		
		return service.searchCommentsByPid(pid);
	}

}
