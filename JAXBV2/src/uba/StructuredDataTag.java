package uba;

import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;

import java.util.ArrayList;

import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlElementWrapper;


//Below statement means that class 'Country.java' is the root-element of our example
//@XmlRootElement(namespace = 'org.arpit.javapostsforlearning.jaxb.Country')
//@XmlRootElement
//@XmlType(propOrder = { 'key', 'countryPopulation', 'listOfStates'})

public class StructuredDataTag {

	private String key;
	private String value;
	
	private String key2;
	private String value2;
	
	public StructuredDataTag() {
	}

	public StructuredDataTag(String key, String value) {
		super();
		this.key = key;
		this.value = value;
	}

	public String getKey() {
		return key;
	}

	public String getValue() {
		return value;
	}

	public String getKey2() {
		return key2;
	}

	public String getValue2() {
		return value2;
	}

	public void setKey(String key) {
		this.key = key;
	}

	public void setValue(String value) {
		this.value = value;
	}

	public void setKey2(String key2) {
		this.key2 = key2;
	}
	//@XmlElementWrapper(name = 'value')

	public void setValue2(String value2) {
		this.value2 = value2;
	}

}