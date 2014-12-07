package com.memi.web.dto;

import java.io.Serializable;

public class Dte implements Serializable{
	private static final long serialVersionUID = 1L;
	private String dteNm;
	private String dteMdl;
	private String dteWon;
	private String maker;
	private String telecom;
	
	public String getDteNm() {
		return dteNm;
	}
	public void setDteNm(String dteNm) {
		this.dteNm = dteNm;
	}
	public String getDteMdl() {
		return dteMdl;
	}
	public void setDteMdl(String dteMdl) {
		this.dteMdl = dteMdl;
	}
	public String getDteWon() {
		return dteWon;
	}
	public void setDteWon(String dteWon) {
		this.dteWon = dteWon;
	}
	public String getMaker() {
		return maker;
	}
	public void setMaker(String maker) {
		this.maker = maker;
	}
	public String getTelecom() {
		return telecom;
	}
	public void setTelecom(String telecom) {
		this.telecom = telecom;
	}
	
	
	
	
	
	
	
}
