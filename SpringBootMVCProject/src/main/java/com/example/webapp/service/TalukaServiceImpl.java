package com.example.webapp.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.example.webapp.bean.TalukaBean;
import com.example.webapp.repository.TalukaRepo;

@Service
public class TalukaServiceImpl implements TalukaService {

	@Autowired
	private TalukaRepo talukaRepo;
	
	@Override
	public List<TalukaBean> talukaList(long did) {
		// TODO Auto-generated method stub
		System.out.println(did);
		return talukaRepo.findBydid(did);
	}

}
