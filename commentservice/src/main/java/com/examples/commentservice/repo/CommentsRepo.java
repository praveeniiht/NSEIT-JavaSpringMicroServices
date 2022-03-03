package com.examples.commentservice.repo;

import java.util.List;

import javax.transaction.Transactional;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import com.examples.commentservice.model.Comments;

@Repository
@Transactional

public interface CommentsRepo extends JpaRepository<Comments,Integer>{
	
	
	@Query("select c from Comments c where c.commenter=?1")
	public List<Comments> searchCommentsByCommenter(String commenter);
	
	@Query("select c from Comments c where c.pid=?1")
	public List<Comments> searchCommentsByPostId(int pid);

}
