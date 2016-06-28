package com.sandeep.test.dto;

public class FindSkuStrAttrDTO {

	private String strNsme;
	private int strNbr;
	private int skuNbr;
	private String skuDesc;
	private int onHnd;

	public int getOnHnd() {
		return onHnd;
	}

	public void setOnHnd(int onHnd) {
		this.onHnd = onHnd;
	}

	public FindSkuStrAttrDTO() {

	}

	public FindSkuStrAttrDTO(int strNbr, int skuNbr) {
		this.skuNbr = skuNbr;
		this.strNbr = strNbr;
	}

	public String getStrNsme() {
		return strNsme;
	}

	public void setStrNsme(String strNsme) {
		this.strNsme = strNsme;
	}

	public int getStrNbr() {
		return strNbr;
	}

	public void setStrNbr(int strNbr) {
		this.strNbr = strNbr;
	}

	public int getSkuNbr() {
		return skuNbr;
	}

	public void setSkuNbr(int skuNbr) {
		this.skuNbr = skuNbr;
	}

	public String getSkuDesc() {
		return skuDesc;
	}

	public void setSkuDesc(String skuDesc) {
		this.skuDesc = skuDesc;
	}
}
