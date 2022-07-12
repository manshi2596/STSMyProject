package com.example.webapp.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

import com.example.webapp.bean.TalukaBean;


//public interface TalukaRepo extends JpaRepository<TalukaBean, Long>{
public interface TalukaRepo extends JpaRepository<TalukaBean, Long>{	
	//from ShippingDocumentsJsonEntity e where e.fulfillmentId in ?1
	
	@Query("from TalukaBean t where t.did in ?1")
	List<TalukaBean> findBydid(@Param("did") long did);
	
}
