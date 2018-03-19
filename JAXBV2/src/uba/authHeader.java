package uba;

import javax.xml.bind.annotation.XmlRootElement;

import java.util.ArrayList;

import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlElement;

//Below statement means that class 'Country.java' is the root-element of our example
//@XmlRootElement(namespace = 'org.arpit.javapostsforlearning.jaxb.Country')
public class authHeader {

	private String sourceid;
	private String password;
	

	public authHeader() {
		super();
	}

	public authHeader(String sourceid, String password) {
		super();
		this.sourceid = sourceid;
		this.password = password;

	}

	public String getSourceid() {
		return sourceid;
	}

	@XmlAttribute
	public void setSourceid(String sourceid) {
		this.sourceid = sourceid;
	}

	public String getPassword() {
		return password;
	}

	@XmlAttribute
	public void setPassword(String password) {
		this.password = password;
	}

}