package com.example.webapp.service;

public class ImageSave {

	private long id;
	private String name;
	private ImageDetails imageDetails;
	
	public long getId() {
		return id;
	}
	public void setId(long id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	
	public ImageSave(long id, String name) {
		super();
		this.id = id;
		this.name = name;
	}
	public ImageSave() {
		super();
		// TODO Auto-generated constructor stub
	}
	
	
	
	
}
