package com.tera.codingtest.model;

import javax.persistence.Embeddable;

@Embeddable
public class Geo {
	private String lat;
	private String lng;
	
	public Geo() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Geo(String lat, String lng) {
		super();
		this.lat = lat;
		this.lng = lng;
	}

	public String getLat() {
		return lat;
	}

	public void setLat(String lat) {
		this.lat = lat;
	}

	public String getLng() {
		return lng;
	}

	public void setLng(String lng) {
		this.lng = lng;
	}
	
	

}
