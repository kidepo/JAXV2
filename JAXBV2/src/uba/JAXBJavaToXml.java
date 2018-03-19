package uba;

import java.io.File;
import java.io.StringWriter;
import java.util.ArrayList;

import javax.xml.bind.JAXBContext;
import javax.xml.bind.JAXBException;
import javax.xml.bind.Marshaller;

public class JAXBJavaToXml {
	
 public static String ConvertToXml(){
	
	 
   String xmlString = "";

  // creating country object
   PurchaseRequest purchaseRequest=new PurchaseRequest(); 
      
   TerminalInformation terminalInformation = new TerminalInformation();
   terminalInformation.setBatteryInformation("-1");
   terminalInformation.setCurrencyCode("566");
   terminalInformation.setLanguageInfo("EN");
   terminalInformation.setMerchantId("IBP000000001384");
   terminalInformation.setMerhcantLocation("AIRTEL NETWORKS LIMITED PH MALL");
   terminalInformation.setPosConditionCode("00");
   terminalInformation.setPosDataCode("510101511344101");
   terminalInformation.setPosEntryMode("051");
   terminalInformation.setPosGeoCode("00234000000000566");
   terminalInformation.setPrinterStatus("1");
   terminalInformation.setTerminalId("2069018M");
   terminalInformation.setTerminalType("PAX");
   terminalInformation.setTransmissionDate("2015-06-19T16:09:12");
   terminalInformation.setUniqueId("280-820-589");
   
   purchaseRequest.setTerminalInformation(terminalInformation);
   
   CardData cardData = new CardData();
   cardData.setCardSequenceNumber("01");
   
   EmvData emvData = new EmvData();
   emvData.setAmountAuthorized("000000000100");
   emvData.setAmountOther("000000000000");
   emvData.setApplicationInterchangeProfile("5800");
   emvData.setAtc("0781");
   emvData.setCryptogram("181F9556071A1251");
   emvData.setCryptogramInformationData("80");
   emvData.setCvmResults("410302");
   emvData.setIad("0FA501A039F8040000000000000000000F010000000000000000000000000000");
   emvData.setTransactionCurrencyCode("566");
   emvData.setTerminalVerificationResult("4080008000");
   emvData.setTerminalCountryCode("566");
   emvData.setTerminalType("22");
   emvData.setTerminalCapabilities("E0F8C8");
   emvData.setTransactionDate("161214");
   emvData.setTransactionType("00");
   emvData.setUnpredictableNumber("C4986B17");
   emvData.setDedicatedFileName("A0000003710001");
   
   cardData.setEmvData(emvData);
   
   purchaseRequest.setCardData(cardData);
   
   Track2 track2 = new Track2();
   track2.setPan("5060990580000001778");
   track2.setExpiryMonth("01");
   track2.setExpiryYear("17");
   track2.setTrack2("5060990580000001778D17016010012890118");
   
   cardData.setTrack2(track2);
   
   purchaseRequest.setFromAccount("Current");
   purchaseRequest.setStan("000009");
   purchaseRequest.setMinorAmount("125000");
   purchaseRequest.setSurcharge("1250");
   purchaseRequest.setReceivingInstitutionId("628051043");
   
   PinData pinData =new PinData();
   pinData.setKsn("005");
   pinData.setKsnd("605");
   pinData.setPinBlock("506099058000000");
   pinData.setPinType("Dukpt");
   
   purchaseRequest.setPinData(pinData);
   purchaseRequest.setKeyLabel("000002");
   
   StructuredData structuredData = new StructuredData();
   StructuredDataTag structuredDataTag = new StructuredDataTag();
   
   structuredDataTag.setKey("MerchantInfo");
   structuredDataTag.setValue("&lt;MerchantInfo&gt;&lt;TerminalId&gt;{tid}&lt;/TerminalId&gt;&lt;/MerchantInfo&gt;");
   
   //StructuredDataTag structuredDataTag_2 = new StructuredDataTag();
   structuredDataTag.setKey2("PrepaidMerchandise");
   structuredDataTag.setValue2("&lt;PrepaidMerchandise&gt;&lt;Request&gt;&lt;Product Type=&quot;PHONE&quot; UserID=&quot;{TPhoneNo}&quot; NetworkID=&quot;{networkid}&quot; ProductID=&quot;{productcode}&quot;/&gt;&lt;/Request&gt;&lt;/PrepaidMerchandise&gt;");
   
   structuredData.setStructuredDataTag(structuredDataTag);
   //structuredData.setStructuredDataTag(structuredDataTag_2);
   
   purchaseRequest.setStructuredData(structuredData);
   
   //ArrayList<StructuredDataTag> FieldsList=new ArrayList<StructuredDataTag>();
  
  try {

   // create JAXB context and initializing Marshaller
   JAXBContext jaxbContext = JAXBContext.newInstance(PurchaseRequest.class);
   Marshaller jaxbMarshaller = jaxbContext.createMarshaller();

   // for getting nice formatted output
   jaxbMarshaller.setProperty(Marshaller.JAXB_FORMATTED_OUTPUT, Boolean.TRUE);

   //specify the location and name of xml file to be created
   //File XMLfile = new File("F:\\MyXml2.xml");

   // Writing to XML file
  // jaxbMarshaller.marshal(purchaseRequest, XMLfile); 
   // Writing to console
   //jaxbMarshaller.marshal(purchaseRequest, System.out); 
   //Writing to a String
   StringWriter sw = new StringWriter();
   jaxbMarshaller.marshal(purchaseRequest, sw); 
   
   xmlString =  sw.toString();
   

  } catch (JAXBException e) {
   // some exception occured
   e.printStackTrace();
  }
  return xmlString;
}
/* 
private static String renameStrings(String inputLine, String searchStr1, String searchStr2, String repStr1, String repStr2)

 {
      String  outputLine=inputLine.replaceAll(searchStr1, repStr1);
      outputLine=inputLine.replaceAll(searchStr2, repStr2);
      
      return outputLine;
}
*/
 public static void main(String[] args) {

	 ConvertToXml();

 }
 
 
}