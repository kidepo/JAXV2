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
import java.security.cert.X509Certificate;
import java.io.IOException;
import java.io.InputStream;
import java.io.StringWriter;
import java.math.BigInteger;
import java.net.MalformedURLException;
import java.net.URL;
import java.security.NoSuchAlgorithmException;
import java.security.SecureRandom;
import java.util.HashMap;

import javax.net.ssl.HttpsURLConnection;
import javax.net.ssl.SSLContext;
import javax.net.ssl.TrustManager;
import javax.net.ssl.X509TrustManager;

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

import java.net.URL;
import java.security.cert.X509Certificate;

import javax.net.ssl.HttpsURLConnection;
import javax.net.ssl.SSLContext;
import javax.net.ssl.TrustManager;
import javax.net.ssl.X509TrustManager;

public class SmileHttpClient {
	
	private String keystoreFileName ;
	private String keystorePassword ;
	private String url;
	
	public SmileHttpClient(String trustStore,String trustPwd,String providerUrl) throws NoSuchAlgorithmException, MalformedURLException, KeyManagementException
	{
		this.keystoreFileName = trustStore;
		this.keystorePassword = trustPwd;
		this.url = providerUrl;
		

	}
	public SmileHttpClient()
	{
	}
	
	public  String postRequest(String xmlRequest)
			throws JSONException, NoSuchAlgorithmException, ClientProtocolException, IOException, KeyManagementException, UnrecoverableKeyException, KeyStoreException, CertificateException {
		System.out.print("Key is "+this.keystorePassword);

	
		String httpMethod = "POST";
	
		this.url = "https://qa.interswitchng.com/kmw/kimonoservice";
		String clientId = ConstantUtils.CLIENT_ID;
		String clientSecretKey = ConstantUtils.CLIENT_SECRET;
		String signatureMethod = "SHA-256";

		//String formed from Object
		//System.out.print("String to be sent :"+ xmlRequest);

		HashMap<String, String> interswitchAuth = InterswitchAuth.generateInterswitchAuth(httpMethod, this.url,
				clientId, clientSecretKey, "", signatureMethod);

		// Write HTTP request to post

        DefaultHttpClient httpclient = new DefaultHttpClient();
        String responseBody = "";
        FileInputStream instream = null;
      // try
        //{ 
    	    //System.out.println("Key is one "+this.keystorePassword+"  :");
            KeyStore trustStore  = KeyStore.getInstance(KeyStore.getDefaultType());
            
			instream = new FileInputStream(new File(this.keystoreFileName));
           
            trustStore.load(instream, this.keystorePassword.toCharArray());
           
           
            SSLSocketFactory socketFactory = new SSLSocketFactory(trustStore);
            Scheme sch = new Scheme("https", socketFactory, 443);
            httpclient.getConnectionManager().getSchemeRegistry().register(sch);

            HttpPost httppost =  new HttpPost(this.url);

            InputStream is = new ByteArrayInputStream(xmlRequest.getBytes("UTF-8"));
            
            InputStreamEntity reqEntity = new InputStreamEntity(is,-1);
            reqEntity.setContentType("text/xml");
            httppost.setEntity(reqEntity);
            
            httppost.setHeader("Authorization", interswitchAuth.get(ConstantUtils.AUTHORIZATION).toString());
            httppost.setHeader("Timestamp", interswitchAuth.get(ConstantUtils.TIMESTAMP).toString());
            httppost.setHeader("Nonce", interswitchAuth.get(ConstantUtils.NONCE).toString());
            httppost.setHeader("Signature", interswitchAuth.get(ConstantUtils.SIGNATURE).toString());
            httppost.setHeader("SignatureMethod", interswitchAuth.get(ConstantUtils.SIGNATURE_METHOD).toString());
            
  		  System.out.println("started...");
		    TrustManager[] trustAllCerts = new TrustManager[] { new X509TrustManager() {
		      public java.security.cert.X509Certificate[] getAcceptedIssuers() {
		        return null;
		      }

		      public void checkClientTrusted(X509Certificate[] certs, String authType) {
		      }

		      public void checkServerTrusted(X509Certificate[] certs, String authType) {
		      }
		    } };

		    SSLContext sc = SSLContext.getInstance("SSL");
		    sc.init(null, trustAllCerts, new java.security.SecureRandom());
		    HttpsURLConnection.setDefaultSSLSocketFactory(sc.getSocketFactory());

		    URL url = new URL("https://qa.interswitchng.com/kmw/kimonoservice");
		    System.out.println("Done...");

            
            ResponseHandler<String> responseHandler = new BasicResponseHandler();
            
            responseBody = httpclient.execute(httppost, responseHandler);
       /* } 
        catch (KeyStoreException e) { responseBody = "KeyStoreException :" + e.getMessage(); }
        catch(FileNotFoundException e){ responseBody = "FileNotFoundException :" + e.getMessage();  }
        catch(NoSuchAlgorithmException e){responseBody = "NoSuchAlgorithmException :" + e.getMessage();}
        catch(CertificateException e){responseBody = "CertificateException :" + e.getMessage();}
        catch(IOException e){responseBody = "IOException :" + e.getMessage();}
        catch(KeyManagementException e){responseBody = "KeyManagementException :" + e.getMessage();}
        catch(UnrecoverableKeyException e){responseBody = "UnrecoverableKeyException :" + e.getMessage();}
        catch(Exception e){responseBody = "General Exception : " + e.getMessage();}
        finally {
        	try {
				instream.close();
			} catch (IOException e) {responseBody = "IOException :" + e.getMessage();}
            httpclient.getConnectionManager().shutdown();
       
           } */
        
        return responseBody;

	}

	
	public void setUrl(String post_url){
		this.url = post_url;
	}
	
	public void setKeystoreFileName(String file){
		this.keystoreFileName = file;
	}
	
	public void setKeystorePassword(String password){
		this.keystorePassword = password;
	}
	
}
