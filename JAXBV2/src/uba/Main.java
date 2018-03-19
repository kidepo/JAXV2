package uba;

import java.io.BufferedReader;
import java.io.DataOutputStream;
import java.io.InputStreamReader;
import java.net.HttpURLConnection;
import java.net.URL;
import java.util.HashMap;

import javax.net.ssl.HttpsURLConnection;

import com.interswitchug.solutions.quickteller.util.ConstantUtils;
import com.interswitchug.solutions.quickteller.util.InterswitchAuth;

public class Main {

	private final String USER_AGENT = "Mozilla/5.0";

	public static void main(String[] args) throws Exception {

		Main http = new Main();


		System.out.println("\nTesting  - Send Http POST request");
		http.sendPost();

	}


	// HTTP POST request
	private void sendPost() throws Exception {
		
		String httpMethod = "POST";
		String clientId = ConstantUtils.CLIENT_ID;
		String clientSecretKey = ConstantUtils.CLIENT_SECRET;
		String signatureMethod = "SHA-256";

		String url = "http://172.23.1.248:9080/api/v1A/svapayments/validateCustomer";
		URL obj = new URL(url);
		HttpsURLConnection con = (HttpsURLConnection) obj.openConnection();
		
		HashMap<String, String> interswitchAuth = InterswitchAuth.generateInterswitchAuth(httpMethod, url,
				clientId, clientSecretKey, "", signatureMethod);

		//add reuqest header
		con.setRequestMethod("POST");
		con.setRequestProperty("User-Agent", USER_AGENT);
		con.setRequestProperty("Accept-Language", "en-US,en;q=0.5");
		
		///* need to set thse
		con.setRequestProperty("Authorization", interswitchAuth.get(ConstantUtils.AUTHORIZATION).toString());
		con.setRequestProperty("Timestamp", interswitchAuth.get(ConstantUtils.TIMESTAMP).toString());
		con.setRequestProperty("Nonce", interswitchAuth.get(ConstantUtils.NONCE).toString());
		con.setRequestProperty("Signature", interswitchAuth.get(ConstantUtils.SIGNATURE).toString());
		con.setRequestProperty("SignatureMethod", interswitchAuth.get(ConstantUtils.SIGNATURE_METHOD).toString());
		//post.setHeader("TerminalId", terminalowner); // set terminal ID here
		

		String urlParameters = "Im  good boy";

		// Send post request
		con.setDoOutput(true);
		DataOutputStream wr = new DataOutputStream(con.getOutputStream());
		wr.writeBytes(urlParameters);
		wr.flush();
		wr.close();

		int responseCode = con.getResponseCode();
		System.out.println("\nSending 'POST' request to URL : " + url);
		System.out.println("Post parameters : " + urlParameters);
		System.out.println("Response Code : " + responseCode);

		BufferedReader in = new BufferedReader(
		        new InputStreamReader(con.getInputStream()));
		String inputLine;
		StringBuffer response = new StringBuffer();

		while ((inputLine = in.readLine()) != null) {
			response.append(inputLine);
		}
		in.close();

		//print result
		System.out.println(response.toString());

	}

}