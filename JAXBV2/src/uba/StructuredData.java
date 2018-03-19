package uba;

import javax.xml.bind.annotation.XmlRootElement;

import java.util.ArrayList;

import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlElement;

//Below statement means that class 'Country.java' is the root-element of our example
//@XmlRootElement(namespace = 'org.arpit.javapostsforlearning.jaxb.Country')
public class StructuredData {

	StructuredDataTag structuredDataTag;
	

	public StructuredData() {
	}


	public StructuredData(StructuredDataTag structuredDataTag) {
		super();
		this.structuredDataTag = structuredDataTag;
	}


	public StructuredDataTag getStructuredDataTag() {
		return structuredDataTag;
	}


	public void setStructuredDataTag(StructuredDataTag structuredDataTag) {
		this.structuredDataTag = structuredDataTag;
	}
	

}