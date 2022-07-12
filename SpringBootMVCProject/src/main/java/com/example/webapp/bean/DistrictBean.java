package com.example.webapp.bean;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.Table;



@Entity
@Table(name = "district")
public class DistrictBean {

	@Id
	private long id;
	@Column
	private String name;
	
	
	public long getId() {
		return id;
	}
	public void setId(long id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	
	@Override
	public String toString() {
		return "DistrictBean [id=" + id + ", name=" + name + "]";
	}
	
	public DistrictBean(long id, String name) {
		super();
		this.id = id;
		this.name = name;
	}
	public DistrictBean() {
		super();
		// TODO Auto-generated constructor stub
	}
	
	
}
