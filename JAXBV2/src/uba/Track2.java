package uba;

import javax.xml.bind.annotation.XmlRootElement;

import java.util.ArrayList;

import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlElement;

//Below statement means that class 'Country.java' is the root-element of our example
//@XmlRootElement(namespace = 'org.arpit.javapostsforlearning.jaxb.Country')
public class Track2 {

	private String pan;
	private String expiryMonth;
	private String expiryYear;
	private String track2;
	
	public Track2() {
	}

	public Track2(String pan, String expiryMonth, String expiryYear, String track2) {
		super();
		this.pan = pan;
		this.expiryMonth = expiryMonth;
		this.expiryYear = expiryYear;
		this.track2 = track2;
	}

	public String getPan() {
		return pan;
	}

	public String getExpiryMonth() {
		return expiryMonth;
	}

	public String getExpiryYear() {
		return expiryYear;
	}

	public String getTrack2() {
		return track2;
	}

	public void setPan(String pan) {
		this.pan = pan;
	}

	public void setExpiryMonth(String expiryMonth) {
		this.expiryMonth = expiryMonth;
	}

	public void setExpiryYear(String expiryYear) {
		this.expiryYear = expiryYear;
	}

	public void setTrack2(String track2) {
		this.track2 = track2;
	}

	
	

}