package uba;

/**
 * @author  Kedyr ... Apr 24, 2015
 *
 */

import java.io.ByteArrayInputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStream;
import java.security.KeyManagementException;
import java.security.KeyStore;
import java.security.KeyStoreException;
import java.security.NoSuchAlgorithmException;
import java.security.UnrecoverableKeyException;
import java.security.cert.CertificateException;

import java.io.IOException;
import java.io.InputStream;
import java.io.StringWriter;
import java.math.BigInteger;
import java.security.NoSuchAlgorithmException;
import java.security.SecureRandom;
import java.util.HashMap;

import javax.net.ssl.SSLContext;
import javax.net.ssl.TrustManager;

import org.apache.http.HttpEntity;
import org.apache.http.HttpResponse;
import org.apache.http.client.ClientProtocolException;
import org.apache.http.client.HttpClient;
import org.apache.http.client.methods.HttpPost;
import org.apache.http.entity.StringEntity;
import org.apache.http.impl.client.DefaultHttpClient;
import org.json.JSONException;
import org.json.JSONObject;

import org.apache.http.client.ResponseHandler;
import org.apache.http.client.methods.HttpPost;
import org.apache.http.conn.scheme.Scheme;
import org.apache.http.conn.ssl.SSLSocketFactory;
import org.apache.http.entity.InputStreamEntity;
import org.apache.http.impl.client.BasicResponseHandler;
import org.apache.http.impl.client.DefaultHttpClient;

import com.interswitchug.solutions.quickteller.util.ConstantUtils;
import com.interswitchug.solutions.quickteller.util.InterswitchAuth;

public class Main_ {
	
	private String keystoreFileName ;
	private String keystorePassword ;
	private String url;
	
	public Main_(String trustStore,String trustPwd,String providerUrl)
	{
		this.keystoreFileName = trustStore;
		this.keystorePassword = trustPwd;
		this.url = providerUrl;
	}
	public Main_(){}
		
	public static void main(String args[])
			throws NoSuchAlgorithmException, JSONException, ClientProtocolException, IOException, KeyManagementException, UnrecoverableKeyException, KeyStoreException, CertificateException {
			
		JAXBJavaToXml javaToXml = new JAXBJavaToXml();
		String xmlRequest = javaToXml.ConvertToXml();
		/*
	      try {
	            Main.class.getResource("trustStore.jks").getFile();
	        } catch (Exception e) {
	            e.printStackTrace();
	        }
	        */

	        String trustStore = System.getProperty("javax.net.ssl.trustStore","F:\\keystores\\newkey\\clientkeystore");

	       // String trustStore = "F:\\keystores\\newkey\\clientKey";

	        
//	        if (trustStore == null) {
//	            String storeLoc;
//	            storeLoc = System.getProperty("java.class.path");
//	            System.out.println("classpath: " + storeLoc);
//	        }
//
//	       // trustStore = System.getProperty("javax.net.ssl.trustStore","F:\\keystores\\newkey\\clientKey");
//	        if (trustStore == null) {
//	            System.out.println("javax.net.ssl.trustStore is not defined");
//	        } else {
//	            System.out.println("javax.net.ssl.trustStore = " + trustStore);
//	        }
//		
	        
	        /*Trying to disable ssl validations  
	         * http://www.java2s.com/Code/Java/Network-Protocol/DisablingCertificateValidationinanHTTPSConnection.htm
	         * https://log.rowanto.com/java-8-turning-off-ssl-certificate-check/

	         
	        final TrustManager[] trustAllCerts = new TrustManager[] { new X509TrustManager() {
	            @Override
	            public void checkClientTrusted( final X509Certificate[] chain, final String authType ) {
	            }
	            @Override
	            public void checkServerTrusted( final X509Certificate[] chain, final String authType ) {
	            }
	            @Override
	            public X509Certificate[] getAcceptedIssuers() {
	                return null;
	            }
	        } };

	        // Install the all-trusting trust manager
	        final SSLContext sslContext = SSLContext.getInstance( "SSL" );
	        sslContext.init( null, trustAllCerts, new java.security.Secure HttpsURLConnection.setDefaultSSLSocketFactory( sslContext.getSocketFactory() );
	       
	        
	        *
	        *
	        */

		SmileHttpClient smileHttpClient = new SmileHttpClient(trustStore,"changeit","https://qa.interswitchng.com/kmw/kimonoservice");
		smileHttpClient.postRequest(xmlRequest);
		System.out.println(smileHttpClient.postRequest(xmlRequest));

	}
	
}
