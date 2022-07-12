package com.example.webapp.bean;

import com.example.webapp.service.ImageDetails;
import com.fasterxml.jackson.annotation.JsonTypeName;

@JsonTypeName("image")
public class Image extends ImageDetails{

	private String name;
	private String type;
	private byte img;
	
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getType() {
		return type;
	}
	public void setType(String type) {
		this.type = type;
	}
	public byte getImg() {
		return img;
	}
	public void setImg(byte img) {
		this.img = img;
	}
	
	@Override
	public String toString() {
		return "Image [name=" + name + ", type=" + type + ", img=" + img + "]";
	}
	public Image() {
		super();
		// TODO Auto-generated constructor stub
	}
	public Image(String name, String type, byte img) {
		super();
		this.name = name;
		this.type = type;
		this.img = img;
	}
	
	
}
