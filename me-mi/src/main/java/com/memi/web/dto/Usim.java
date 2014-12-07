package com.memi.web.dto;

import java.io.Serializable;

public class Usim implements Serializable{

	private static final long serialVersionUID = 1L;
	
	private String usimNo;
	private String usimMdl;
	private String usimWon;
	private String usimPayTm;
	private int custId;
	public String getUsimNo() {
		return usimNo;
	}
	public void setUsimNo(String usimNo) {
		this.usimNo = usimNo;
	}
	public String getUsimMdl() {
		return usimMdl;
	}
	public void setUsimMdl(String usimMdl) {
		this.usimMdl = usimMdl;
	}
	public String getUsimWon() {
		return usimWon;
	}
	public void setUsimWon(String usimWon) {
		this.usimWon = usimWon;
	}
	public String getUsimPayTm() {
		return usimPayTm;
	}
	public void setUsimPayTm(String usimPayTm) {
		this.usimPayTm = usimPayTm;
	}
	public int getCustId() {
		return custId;
	}
	public void setCustId(int custId) {
		this.custId = custId;
	}

}
