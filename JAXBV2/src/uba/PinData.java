package uba;

import javax.xml.bind.annotation.XmlRootElement;

import java.util.ArrayList;

import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlElement;

//Below statement means that class 'Country.java' is the root-element of our example
//@XmlRootElement(namespace = 'org.arpit.javapostsforlearning.jaxb.Country')
public class PinData {

	private String ksn;
	private String ksnd;
	private String pinBlock;
	private String pinType;
	

	public PinData() {
	}
	public PinData(String ksn, String ksnd, String pinBlock, String pinType) {
		super();
		this.ksn = ksn;
		this.ksnd = ksnd;
		this.pinBlock = pinBlock;
		this.pinType = pinType;
	}
	public String getKsn() {
		return ksn;
	}
	public String getKsnd() {
		return ksnd;
	}
	public String getPinBlock() {
			return pinBlock;
		}
	public String getPinType() {
		return pinType;
	}
	public void setKsn(String ksn) {
		this.ksn = ksn;
	}
	public void setKsnd(String ksnd) {
		this.ksnd = ksnd;
	}
	public void setPinBlock(String pinBlock) {
		this.pinBlock = pinBlock;
	}
	public void setPinType(String pinType) {
		this.pinType = pinType;
	}
	
	

}