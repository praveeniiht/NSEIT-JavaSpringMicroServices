package com.examples.commentservice.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.examples.commentservice.model.Comments;
import com.examples.commentservice.service.CommentService;


@RestController
@RequestMapping("/comments")
public class CommentsController {
	
	@Autowired
	CommentService service;
	
	@GetMapping("/all")
	public List<Comments> showAll(){
		return service.displayAllComments();
	}
	
	@PostMapping("/add")
	public String addComment(@RequestBody Comments comment) {
		return service.insertComment(comment);
	}
	
	@DeleteMapping("/delete/{cid}")
	public String deletepost(@PathVariable("cid") int cid) {
		return service.deleteComment(cid);
	}
	
	@GetMapping("/commenter/{name}")
	public List<Comments> searchByCommenter(@PathVariable("name") String commenter) {
			return service.searchCommentsByCommenter(commenter);
	}
	
	@GetMapping("/pid/{pid}")
	public List<Comments> searchByPid(@PathVariable("pid") int pid) {
			return service.searchCommentsByPostId(pid);
	}


}
