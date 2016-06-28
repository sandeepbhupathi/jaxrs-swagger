package com.sandeep.test.dto;

import javax.xml.bind.annotation.XmlRootElement;

@XmlRootElement
public class SkuStrOnHndDTO {

	private int skuNbr;
	private int strNbr;
	private String skuDesc;
	private String strName;
	private int onHand;

	public SkuStrOnHndDTO(int skuNbr, 
			int strNbr, 
			String skuDesc, 
			String strName, 
			int onHnd) {
		
		this.skuNbr= skuNbr;
		this.strNbr = strNbr;
		this.skuDesc= skuDesc;
		this.strName= strName;
		this.onHand=onHnd;
	}

	public int getSkuNbr() {
		return skuNbr;
	}

	public void setSkuNbr(int skuNbr) {
		this.skuNbr = skuNbr;
	}

	public int getStrNbr() {
		return strNbr;
	}

	public void setStrNbr(int strNbr) {
		this.strNbr = strNbr;
	}

	public String getSkuDesc() {
		return skuDesc;
	}

	public void setSkuDesc(String skuDesc) {
		this.skuDesc = skuDesc;
	}

	public String getStrName() {
		return strName;
	}

	public void setStrName(String strName) {
		this.strName = strName;
	}

	public int getOnHand() {
		return onHand;
	}

	public void setOnHand(int onHand) {
		this.onHand = onHand;
	}

}
