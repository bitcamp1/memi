package com.memi.web.dto;

import java.io.Serializable;

public class ZipDto implements Serializable {
	private static final long serialVersionUID = 1L;
	private String zip; //우편번호
	private String sido; // 시도 (특별시,광역시,도)
	private String city; // 일반시
	private String gugun; // 시구군
	private String sector; // 우편번호가 다른 지역
	public ZipDto() {
		super();
		// TODO Auto-generated constructor stub
	}
	public String getZip() {
		return zip;
	}
	public void setZip(String zip) {
		this.zip = zip;
	}
	public String getSido() {
		return sido;
	}
	public void setSido(String sido) {
		this.sido = sido;
	}
	public String getCity() {
		return city;
	}
	public void setCity(String city) {
		this.city = city;
	}
	public String getGugun() {
		return gugun;
	}
	public void setGugun(String gugun) {
		this.gugun = gugun;
	}
	public String getSector() {
		return sector;
	}
	public void setSector(String sector) {
		this.sector = sector;
	}
	
	
	
}
