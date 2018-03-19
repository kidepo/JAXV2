package uba;

import java.io.File;
import java.util.ArrayList;
import javax.xml.bind.JAXBContext;
import javax.xml.bind.JAXBException;
import javax.xml.bind.Unmarshaller;

public class JAXBXMLToJava {
	public static void main(String[] args) {

		try {

			// create JAXB context and initializing Marshaller
			JAXBContext jaxbContext = JAXBContext.newInstance(PurchaseRequest.class);

			Unmarshaller jaxbUnmarshaller = jaxbContext.createUnmarshaller();

			// specify the location and name of xml file to be read
			File XMLfile = new File("F:\\MyXml2.xml");

			// this will create Java object - country from the XML file
			PurchaseRequest purchaseRequest = (PurchaseRequest) jaxbUnmarshaller.unmarshal(XMLfile);
			//sample outs
			TerminalInformation terminalInformation = purchaseRequest.getTerminalInformation();
			CardData cardData = purchaseRequest.getCardData();
			

			System.out.println("TerminalInformation: " + terminalInformation);
			System.out.println("CardData: " + cardData);

			/*
			ArrayList<Field> listOfFields = iso.getField();
			for (Field field : listOfFields) {
				System.out.println("Field:" + field.getId() + " value:" + field.getValue());
			} */

		} catch (JAXBException e) {
			// some exception occured
			e.printStackTrace();
		}

	}
}