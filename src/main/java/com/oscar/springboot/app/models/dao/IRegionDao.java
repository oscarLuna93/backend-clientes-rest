package com.oscar.springboot.app.models.dao;

import java.util.List;

import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;

import com.oscar.springboot.app.models.entity.Region;

public interface IRegionDao extends CrudRepository<Region, Long> {
	
	@Query("from Region")
	public List<Region> findAllRegiones();
}
