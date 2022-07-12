package com.example.webapp.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.webapp.bean.DistrictBean;
import com.example.webapp.repository.DistrictRepo;

@Service
public class DistrictServiceImpl implements DistrictService {

	@Autowired
	DistrictRepo districtRepo;
	
	@Override
	public List<DistrictBean> districtlist() {
		// TODO Auto-generated method stub
		return districtRepo.findAll();
	}

}
