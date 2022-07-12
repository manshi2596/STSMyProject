package com.example.webapp.bean;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "taluka")
public class TalukaBean {

	@Id
	private long tid;
	@Column
	private long did;
	@Column
	private String tname;
	
	
	public long getId() {
		return tid;
	}
	public void setId(long tid) {
		this.tid =tid;
	}
	
	public long getDid() {
		return did;
	}
	public void setDid(long did) {
		this.did = did;
	}
	
	public String getName() {
		return tname;
	}
	public void setName(String tname) {
		this.tname = tname;
	}
	@Override
	public String toString() {
		return "TalukaBean [tid=" + tid + ", did=" + did + ", tname=" + tname + "]";
	}
	public TalukaBean(long tid, long did, String tname) {
		super();
		this.tid = tid;
		this.did = did;
		this.tname = tname;
	}
	public TalukaBean() {
		super();
		// TODO Auto-generated constructor stub
	}
	
	
}
