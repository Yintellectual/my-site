package com.i2d23.saloon.dao;

import java.util.List;

import com.i2d23.saloon.beans.Post;

public interface PostDao {
	
	public void save(Post post);
	public List<Post> list();

}
