package uba;

import javax.xml.bind.annotation.XmlRootElement;

import java.util.ArrayList;

import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlElement;

//Below statement means that class 'Country.java' is the root-element of our example
//@XmlRootElement(namespace = 'org.arpit.javapostsforlearning.jaxb.Country')
public class TerminalInformation {

	private String batteryInformation;
	private String currencyCode;
	private String languageInfo;
	private String merchantId;
	private String merhcantLocation;
	private String posConditionCode;
	private String posDataCode;
	private String posEntryMode;
	private String posGeoCode;
	private String printerStatus;
	private String terminalId;
	private String terminalType;
	private String transmissionDate;
	private String uniqueId;

	
	public TerminalInformation() {
	}


	public TerminalInformation(String batteryInformation, String currencyCode, String languageInfo, String merchantId,
			String merhcantLocation, String posConditionCode, String posDataCode, String posEntryMode,
			String posGeoCode, String printerStatus, String terminalId, String terminalType, String transmissionDate,
			String uniqueId) {
		super();
		this.batteryInformation = batteryInformation;
		this.currencyCode = currencyCode;
		this.languageInfo = languageInfo;
		this.merchantId = merchantId;
		this.merhcantLocation = merhcantLocation;
		this.posConditionCode = posConditionCode;
		this.posDataCode = posDataCode;
		this.posEntryMode = posEntryMode;
		this.posGeoCode = posGeoCode;
		this.printerStatus = printerStatus;
		this.terminalId = terminalId;
		this.terminalType = terminalType;
		this.transmissionDate = transmissionDate;
		this.uniqueId = uniqueId;
	}


	public String getBatteryInformation() {
		return batteryInformation;
	}


	public String getCurrencyCode() {
		return currencyCode;
	}


	public String getLanguageInfo() {
		return languageInfo;
	}


	public String getMerchantId() {
		return merchantId;
	}


	public String getMerhcantLocation() {
		return merhcantLocation;
	}


	public String getPosConditionCode() {
		return posConditionCode;
	}


	public String getPosDataCode() {
		return posDataCode;
	}


	public String getPosEntryMode() {
		return posEntryMode;
	}


	public String getPosGeoCode() {
		return posGeoCode;
	}


	public String getPrinterStatus() {
		return printerStatus;
	}


	public String getTerminalId() {
		return terminalId;
	}


	public String getTerminalType() {
		return terminalType;
	}


	public String getTransmissionDate() {
		return transmissionDate;
	}


	public String getUniqueId() {
		return uniqueId;
	}


	public void setBatteryInformation(String batteryInformation) {
		this.batteryInformation = batteryInformation;
	}


	public void setCurrencyCode(String currencyCode) {
		this.currencyCode = currencyCode;
	}


	public void setLanguageInfo(String languageInfo) {
		this.languageInfo = languageInfo;
	}


	public void setMerchantId(String merchantId) {
		this.merchantId = merchantId;
	}


	public void setMerhcantLocation(String merhcantLocation) {
		this.merhcantLocation = merhcantLocation;
	}


	public void setPosConditionCode(String posConditionCode) {
		this.posConditionCode = posConditionCode;
	}


	public void setPosDataCode(String posDataCode) {
		this.posDataCode = posDataCode;
	}


	public void setPosEntryMode(String posEntryMode) {
		this.posEntryMode = posEntryMode;
	}


	public void setPosGeoCode(String posGeoCode) {
		this.posGeoCode = posGeoCode;
	}


	public void setPrinterStatus(String printerStatus) {
		this.printerStatus = printerStatus;
	}


	public void setTerminalId(String terminalId) {
		this.terminalId = terminalId;
	}


	public void setTerminalType(String terminalType) {
		this.terminalType = terminalType;
	}


	public void setTransmissionDate(String transmissionDate) {
		this.transmissionDate = transmissionDate;
	}


	public void setUniqueId(String uniqueId) {
		this.uniqueId = uniqueId;
	}
	
	
	

/*
	public ArrayList<Field> getField() {
		return field;
	}

	// XmLElementWrapper generates a wrapper element around XML representation
	// @XmlElementWrapper(name = 'stateList')
	// XmlElement sets the name of the entities in collection
	@XmlElement
	public void setField(ArrayList<Field> fields) {
		this.field = fields;
	}
*/

}