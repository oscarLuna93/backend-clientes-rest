package com.oscar.springboot.app.models.services;

import java.util.List;

import com.oscar.springboot.app.models.entity.Region;

public interface IRegionService {
	public List<Region> findAllRegiones();
}
