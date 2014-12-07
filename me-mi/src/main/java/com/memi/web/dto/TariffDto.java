package com.memi.web.dto;

import java.io.Serializable;

public class TariffDto implements Serializable{

	private static final long serialVersionUID = 1L;
	
	private int tfSeq;
	private String tariff;
	private String telecom;
	/**
	 * @return the tfSeq
	 */
	public int getTfSeq() {
		return tfSeq;
	}
	/**
	 * @return the tariff
	 */
	public String getTariff() {
		return tariff;
	}
	/**
	 * @return the telecom
	 */
	public String getTelecom() {
		return telecom;
	}
	/**
	 * @param tfSeq the tfSeq to set
	 */
	public void setTfSeq(int tfSeq) {
		this.tfSeq = tfSeq;
	}
	/**
	 * @param tariff the tariff to set
	 */
	public void setTariff(String tariff) {
		this.tariff = tariff;
	}
	/**
	 * @param telecom the telecom to set
	 */
	public void setTelecom(String telecom) {
		this.telecom = telecom;
	}
	
	
	

}
