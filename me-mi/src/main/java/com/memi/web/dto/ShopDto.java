package com.memi.web.dto;

import java.io.Serializable;

public class ShopDto implements Serializable {

	private static final long serialVersionUID = 1L;
	 
	private int shopSq; 
	private String rgDt; // 등록일
	private String shopNm; // 샵 이름
	private String shopId; //
	private String shopPw;
	private String shopTp; // 개통처 or 판매처
	private String juso; // 우편번호 제외한 상세주소
	private int cntSeq; // 연락처
	
	@SuppressWarnings("unused")
	private String zip; // 우편번호
	
	
	
	public ShopDto() {
		super();
		// TODO Auto-generated constructor stub
	}
	Contact c = new Contact();
	public void setPhoNo(String phoNo){
		c.setPhoNo(phoNo);
	}
	public String getPhoNo(){
		return c.getPhoNo();
	}
	public void setTelNo(String telNo){
		c.setTelNo(telNo);
	}
	public String getTelNo(){
		return c.getTelNo();
	}
   
	
	/**
	 * @return the shopSq
	 */
	public int getShopSq() {
		return shopSq;
	}
	/**
	 * @return the regDt
	 */
	public String getRgDt() {
		return rgDt;
	}
	/**
	 * @return the shopNm
	 */
	public String getShopNm() {
		return shopNm;
	}
	/**
	 * @return the shopId
	 */
	public String getShopId() {
		return shopId;
	}
	/**
	 * @return the shopPw
	 */
	public String getShopPw() {
		return shopPw;
	}
	/**
	 * @return the shopTp
	 */
	public String getShopTp() {
		return shopTp;
	}
	/**
	 * @return the juso
	 */
	public String getJuso() {
		return juso;
	}

	/**
	 * @return the zip
	 */
	public String getZip(String zip) {
		return zip;
	}
	/**
	 * @param shopSq the shopSq to set
	 */
	public void setShopSq(int shopSq) {
		this.shopSq = shopSq;
	}
	/**
	 * @param regDt the regDt to set
	 */
	public void setRgDt(String rgDt) {
		this.rgDt = rgDt;
	}
	/**
	 * @param shopNm the shopNm to set
	 */
	public void setShopNm(String shopNm) {
		this.shopNm = shopNm;
	}
	/**
	 * @param shopId the shopId to set
	 */
	public void setShopId(String shopId) {
		this.shopId = shopId;
	}
	/**
	 * @param shopPw the shopPw to set
	 */
	public void setShopPw(String shopPw) {
		this.shopPw = shopPw;
	}
	/**
	 * @param shopTp the shopTp to set
	 */
	public void setShopTp(String shopTp) {
		this.shopTp = shopTp;
	}
	/**
	 * @param juso the juso to set
	 */
	public void setJuso(String juso) {
		this.juso = juso;
	}

	/**
	 * @param zip the zip to set
	 */
	public void setZip(String zip) {
		this.zip = zip;
	}
	public int getCntSeq() {
		return cntSeq;
	}
	public void setCntSeq(int cntSeq) {
		this.cntSeq = cntSeq;
	}
	
	
	
}
