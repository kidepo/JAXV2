package uba;

import javax.xml.bind.annotation.XmlRootElement;

import java.util.ArrayList;

import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlElement;

//Below statement means that class 'Country.java' is the root-element of our example
//@XmlRootElement(namespace = 'org.arpit.javapostsforlearning.jaxb.Country')
public class CardData {

	private String cardSequenceNumber;
	
	EmvData emvData;
	Track2 track2;

	public CardData() {}

	public CardData(String cardSequenceNumber, EmvData emvData, Track2 track2) {
		super();
		this.cardSequenceNumber = cardSequenceNumber;
		this.emvData = emvData;
		this.track2 = track2;
	}

	public String getCardSequenceNumber() {
		return cardSequenceNumber;
	}

	public EmvData getEmvData() {
		return emvData;
	}

	public Track2 getTrack2() {
		return track2;
	}

	public void setCardSequenceNumber(String cardSequenceNumber) {
		this.cardSequenceNumber = cardSequenceNumber;
	}

	public void setEmvData(EmvData emvData) {
		this.emvData = emvData;
	}

	public void setTrack2(Track2 track2) {
		this.track2 = track2;
	}
	
	



}