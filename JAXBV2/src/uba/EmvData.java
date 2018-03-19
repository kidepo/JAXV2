package uba;

import javax.xml.bind.annotation.XmlRootElement;

import java.util.ArrayList;

import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlElement;

//Below statement means that class 'Country.java' is the root-element of our example
//@XmlRootElement(namespace = 'org.arpit.javapostsforlearning.jaxb.Country')
public class EmvData {

	private String AmountAuthorized;
	private String AmountOther;
	private String ApplicationInterchangeProfile;
	private String atc;
	private String Cryptogram;
	private String CryptogramInformationData;
	private String CvmResults;
	private String iad;
	private String TransactionCurrencyCode;
	private String TerminalVerificationResult;
	private String TerminalCountryCode;
	private String TerminalType;
	private String TerminalCapabilities;
	private String TransactionDate;
	private String TransactionType;
	private String UnpredictableNumber;
	private String DedicatedFileName;

	
	public EmvData() {
	}


	public EmvData(String amountAuthorized, String amountOther, String applicationInterchangeProfile, String atc,
			String cryptogram, String cryptogramInformationData, String cvmResults, String iad,
			String transactionCurrencyCode, String terminalVerificationResult, String terminalCountryCode,
			String terminalType, String terminalCapabilities, String transactionDate, String transactionType,
			String unpredictableNumber, String dedicatedFileName) {
		super();
		this.AmountAuthorized = amountAuthorized;
		this.AmountOther = amountOther;
		this.ApplicationInterchangeProfile = applicationInterchangeProfile;
		this.atc = atc;
		this.Cryptogram = cryptogram;
		this.CryptogramInformationData = cryptogramInformationData;
		this.CvmResults = cvmResults;
		this.iad = iad;
		this.TransactionCurrencyCode = transactionCurrencyCode;
		this.TerminalVerificationResult = terminalVerificationResult;
		this.TerminalCountryCode = terminalCountryCode;
		this.TerminalType = terminalType;
		this.TerminalCapabilities = terminalCapabilities;
		this.TransactionDate = transactionDate;
		this.TransactionType = transactionType;
		this.UnpredictableNumber = unpredictableNumber;
		this.DedicatedFileName = dedicatedFileName;
	}


	public String getAmountAuthorized() {
		return AmountAuthorized;
	}


	public String getAmountOther() {
		return AmountOther;
	}


	public String getApplicationInterchangeProfile() {
		return ApplicationInterchangeProfile;
	}


	public String getAtc() {
		return atc;
	}


	public String getCryptogram() {
		return Cryptogram;
	}


	public String getCryptogramInformationData() {
		return CryptogramInformationData;
	}


	public String getCvmResults() {
		return CvmResults;
	}


	public String getIad() {
		return iad;
	}


	public String getTransactionCurrencyCode() {
		return TransactionCurrencyCode;
	}


	public String getTerminalVerificationResult() {
		return TerminalVerificationResult;
	}


	public String getTerminalCountryCode() {
		return TerminalCountryCode;
	}


	public String getTerminalType() {
		return TerminalType;
	}


	public String getTerminalCapabilities() {
		return TerminalCapabilities;
	}


	public String getTransactionDate() {
		return TransactionDate;
	}


	public String getTransactionType() {
		return TransactionType;
	}


	public String getUnpredictableNumber() {
		return UnpredictableNumber;
	}


	public String getDedicatedFileName() {
		return DedicatedFileName;
	}


	public void setAmountAuthorized(String amountAuthorized) {
		AmountAuthorized = amountAuthorized;
	}


	public void setAmountOther(String amountOther) {
		AmountOther = amountOther;
	}


	public void setApplicationInterchangeProfile(String applicationInterchangeProfile) {
		ApplicationInterchangeProfile = applicationInterchangeProfile;
	}


	public void setAtc(String atc) {
		this.atc = atc;
	}


	public void setCryptogram(String cryptogram) {
		Cryptogram = cryptogram;
	}


	public void setCryptogramInformationData(String cryptogramInformationData) {
		CryptogramInformationData = cryptogramInformationData;
	}


	public void setCvmResults(String cvmResults) {
		CvmResults = cvmResults;
	}


	public void setIad(String iad) {
		this.iad = iad;
	}


	public void setTransactionCurrencyCode(String transactionCurrencyCode) {
		TransactionCurrencyCode = transactionCurrencyCode;
	}


	public void setTerminalVerificationResult(String terminalVerificationResult) {
		TerminalVerificationResult = terminalVerificationResult;
	}


	public void setTerminalCountryCode(String terminalCountryCode) {
		TerminalCountryCode = terminalCountryCode;
	}


	public void setTerminalType(String terminalType) {
		TerminalType = terminalType;
	}


	public void setTerminalCapabilities(String terminalCapabilities) {
		TerminalCapabilities = terminalCapabilities;
	}


	public void setTransactionDate(String transactionDate) {
		TransactionDate = transactionDate;
	}


	public void setTransactionType(String transactionType) {
		TransactionType = transactionType;
	}


	public void setUnpredictableNumber(String unpredictableNumber) {
		UnpredictableNumber = unpredictableNumber;
	}


	public void setDedicatedFileName(String dedicatedFileName) {
		DedicatedFileName = dedicatedFileName;
	}
	
	
	
	


}