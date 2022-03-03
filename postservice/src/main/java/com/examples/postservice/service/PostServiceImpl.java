package com.examples.postservice.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

import com.examples.postservice.model.CommentsDto;
import com.examples.postservice.model.Posts;
import com.examples.postservice.repo.PostRepo;


@Service
public class PostServiceImpl implements PostService{
	
	@Autowired
	PostRepo repo;
	
	@Autowired
	RestTemplate template;
	
	@Autowired
	PostFeignProxy proxy;
	
	

	@Override
	public String insertPost(Posts post) {
		// TODO Auto-generated method stub
		repo.save(post);
		
		return "Post added ";
	}

	@Override
	public List<Posts> displayAllPosts() {
		// TODO Auto-generated method stub
		return repo.findAll();
	}

	@Override
	public String deletePost(int postId) {
		// TODO Auto-generated method stub
		repo.deleteById(postId);
		return "Post deleted";
	}

	@Override
	public List<Posts> searchPostsByAuthor(String author) {
		// TODO Auto-generated method stub
		return repo.searchPostsByAuthor(author);
	}

	@Override
	public List<Posts> searchPostsByTitle(String title) {
		// TODO Auto-generated method stub
		return repo.searchPostsByTitle(title);
	}

	@Override
	public List<CommentsDto> searchCommentsByPid(int pid) {
		// TODO Auto-generated method stub
		List<CommentsDto> comments = template.getForObject("http://COMMENT-SERVICE/comments/pid/"+pid,List.class);
		//List<CommentsDto> comments = proxy.findCommentsByPid(pid);
		return comments;
	}

}
