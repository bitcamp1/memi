package com.memi.web.dto;

import java.io.Serializable;
import java.util.List;

public class CustDto implements Serializable{

	private static final long serialVersionUID = 1L;
	
	private String cust_id;
	private String cust_nm; // 고객명
	private String cust_gubun; // 고객구분 ( 양도인 , 법인, 개인)
	private String gen; // 성별
	private String regdt; // 고객리스트 등록일
	private String birth; // 생년월일
	private String bosang; //보상등급
	
	private Contact contact; // 연락처
	private ZipDto zip; // 우편번호
	private String juso; // 우편번호 제외한 상세주소
	
	public String getCust_id() {
		return cust_id;
	}
	public void setCust_id(String cust_id) {
		this.cust_id = cust_id;
	}
	public String getCust_nm() {
		return cust_nm;
	}
	public void setCust_nm(String cust_nm) {
		this.cust_nm = cust_nm;
	}
	
	public String getCust_gubun() {
		return cust_gubun;
	}
	public void setCust_gubun(String cust_gubun) {
		this.cust_gubun = cust_gubun;
	}
	public String getGen() {
		return gen;
	}
	public void setGen(String gen) {
		this.gen = gen;
	}
	public String getRegdt() {
		return regdt;
	}
	public void setRegdt(String regdt) {
		this.regdt = regdt;
	}
	public String getBirth() {
		return birth;
	}
	public void setBirth(String birth) {
		this.birth = birth;
	}
	
	
	

}
