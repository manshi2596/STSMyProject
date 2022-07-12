package com.example.webapp.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.webapp.bean.DistrictBean;

public interface DistrictRepo extends JpaRepository<DistrictBean, Long>{

}
