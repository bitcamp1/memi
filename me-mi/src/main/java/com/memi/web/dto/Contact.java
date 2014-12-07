package com.memi.web.dto;

import java.io.Serializable;


public class Contact implements Serializable{
	private static final long serialVersionUID = 1L;
	private int cntSq; // 주소록 일련번호
	private String phoNo;  // 휴대폰 번호
	private String telNo; // 연락처 번호
	private String fax; //팩스번호
	private String eml; // 이메일
	public int getCntSq() {
		return cntSq;
	}
	public void setCntSq(int cntSq) {
		this.cntSq = cntSq;
	}
	public String getPhoNo() {
		return phoNo;
	}
	public void setPhoNo(String phoNo) {
		this.phoNo = phoNo;
	}
	public String getTelNo() {
		return telNo;
	}
	public void setTelNo(String telNo) {
		this.telNo = telNo;
	}
	public String getFax() {
		return fax;
	}
	public void setFax(String fax) {
		this.fax = fax;
	}
	public String getEml() {
		return eml;
	}
	public void setEml(String eml) {
		this.eml = eml;
	}
	
	
}
