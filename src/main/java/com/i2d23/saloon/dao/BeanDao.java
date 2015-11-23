package com.i2d23.saloon.dao;

import java.util.List;

import com.i2d23.saloon.beans.Article;
import com.i2d23.saloon.beans.Post;

public interface BeanDao<T> {
	
	public void save(T t);
	public List<T> list(T t);
}
