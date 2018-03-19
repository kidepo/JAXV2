package uba;

import javax.xml.bind.annotation.XmlRootElement;

import java.util.ArrayList;

import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlElement;

//Below statement means that class 'Country.java' is the root-element of our example
//@XmlRootElement(namespace = 'org.arpit.javapostsforlearning.jaxb.Country')
public class Field {

	private String key;
	private String value;
	
	//private ArrayList<Field> field;
	
	public Field() {
	}

	public Field(String key, String value) {
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

	public void setKey(String key) {
		this.key = key;
	}

	public void setValue(String value) {
		this.value = value;
	}
	

	//public ArrayList<Field> getField() {
	//	return field;
	//}
	

	// XmLElementWrapper generates a wrapper element around XML representation
	// @XmlElementWrapper(name = 'stateList')
	// XmlElement sets the name of the entities in collection
	//@XmlElement
	
	//public void setField(ArrayList<Field> fields) {
	//	this.field = fields;
	//}
	


}