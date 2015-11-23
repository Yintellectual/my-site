package com.i2d23.saloon.dao;

import java.util.List;

import com.i2d23.saloon.beans.Technology;

public interface TechnologyDao {
	
	public void save(Technology technology);
	public List<Technology> list();
}
