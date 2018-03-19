package uba;

import java.util.ArrayList;

import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlElementWrapper;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;

import uba.TerminalInformation;
import uba.authHeader;

import javax.xml.bind.annotation.XmlAttribute;

//Below annotation defines root element of XML file
/**
 * @author dkiyingi
 *
 */
@XmlRootElement
// You can define order in which elements will be created in XML file
// Optional
// @XmlType(propOrder = { 'countryName', 'countryPopulation', 'listOfStates'})
public class PurchaseRequest {

	TerminalInformation terminalInformation;
	CardData cardData;
	
	private String fromAccount;
	private String stan;
	private String minorAmount;
	private String surcharge;
	private String receivingInstitutionId;
	
	PinData pinData;
	
	private String keyLabel;
	
	StructuredData structuredData;
	
	public PurchaseRequest(){}
	
	public PurchaseRequest(TerminalInformation terminalInformation, CardData cardData,
			String fromAccount, String stan, String minorAmount, String surcharge, String receivingInstitutionId,
			PinData pinData, String keyLabel, StructuredData structuredData) {
		super();
		this.terminalInformation = terminalInformation;
		this.cardData = cardData;
		this.fromAccount = fromAccount;
		this.stan = stan;
		this.minorAmount = minorAmount;
		this.surcharge = surcharge;
		this.receivingInstitutionId = receivingInstitutionId;
		this.pinData = pinData;
		this.keyLabel = keyLabel;
		this.structuredData = structuredData;
	}

	@XmlElement
	public TerminalInformation getTerminalInformation() {
		return terminalInformation;
	}
	@XmlElement
	public CardData getCardData() {
		return cardData;
	}
	@XmlElement
	public String getFromAccount() {
		return fromAccount;
	}
	@XmlElement
	public String getStan() {
		return stan;
	}
	@XmlElement
	public String getMinorAmount() {
		return minorAmount;
	}
	@XmlElement
	public String getSurcharge() {
		return surcharge;
	}
	@XmlElement
	public String getReceivingInstitutionId() {
		return receivingInstitutionId;
	}
	@XmlElement
	public PinData getPinData() {
		return pinData;
	}
	@XmlElement
	public String getKeyLabel() {
		return keyLabel;
	}
	@XmlElement
	public StructuredData getStructuredData() {
		return structuredData;
	}

	public void setTerminalInformation(TerminalInformation terminalInformation) {
		this.terminalInformation = terminalInformation;
	}

	public void setCardData(CardData cardData) {
		this.cardData = cardData;
	}

	public void setFromAccount(String fromAccount) {
		this.fromAccount = fromAccount;
	}

	public void setStan(String stan) {
		this.stan = stan;
	}

	public void setMinorAmount(String minorAmount) {
		this.minorAmount = minorAmount;
	}

	public void setSurcharge(String surcharge) {
		this.surcharge = surcharge;
	}

	public void setReceivingInstitutionId(String receivingInstitutionId) {
		this.receivingInstitutionId = receivingInstitutionId;
	}

	public void setPinData(PinData pinData) {
		this.pinData = pinData;
	}

	public void setKeyLabel(String keyLabel) {
		this.keyLabel = keyLabel;
	}

	public void setStructuredData(StructuredData structuredData) {
		this.structuredData = structuredData;
	}

}