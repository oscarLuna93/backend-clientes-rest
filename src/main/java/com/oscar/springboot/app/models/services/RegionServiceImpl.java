package com.oscar.springboot.app.models.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.oscar.springboot.app.models.dao.IRegionDao;
import com.oscar.springboot.app.models.entity.Region;

@Service
public class RegionServiceImpl implements IRegionService{
	@Autowired
	IRegionDao regionDao;

	@Override
	public List<Region> findAllRegiones() {
		return regionDao.findAllRegiones();
	}

}
