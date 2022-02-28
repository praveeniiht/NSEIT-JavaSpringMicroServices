package com.examples.postcrud.dao;

import java.sql.SQLException;
import java.util.List;

import com.examples.postcrud.model.Posts;

public interface PostDao {
	public List<Posts> getAllPosts() throws SQLException;
	public String inserPost(Posts posts) throws SQLException;
}
