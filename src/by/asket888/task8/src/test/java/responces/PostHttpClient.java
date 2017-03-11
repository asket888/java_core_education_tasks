package responces;

import org.apache.http.HttpResponse;
import org.apache.http.NameValuePair;
import org.apache.http.client.HttpClient;
import org.apache.http.client.entity.UrlEncodedFormEntity;
import org.apache.http.client.methods.HttpPost;
import org.apache.http.impl.client.DefaultHttpClient;
import org.apache.http.message.BasicNameValuePair;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;

import static org.apache.http.HttpHeaders.USER_AGENT;


public class PostHttpClient {

    public static void requestPost(String id, String name, String price) throws IOException {

        String url = "http://thomas-bayer.com/sqlrest/PRODUCT/";

        HttpClient client = new DefaultHttpClient();
        HttpPost postRequest = new HttpPost(url);

        postRequest.setHeader("User-Agent", USER_AGENT);
        postRequest.setHeader("Host", "thomas-bayer.com");

        List<NameValuePair> productParameters = new ArrayList<NameValuePair>();
        productParameters.add(new BasicNameValuePair("ID", id));
//        productParameters.add(new BasicNameValuePair("NAME", name));
//        productParameters.add(new BasicNameValuePair("PRICE", price));

        postRequest.setEntity(new UrlEncodedFormEntity(productParameters));

        HttpResponse response = client.execute(postRequest);

        System.out.println("Response code: " + response.getStatusLine().getStatusCode());

        BufferedReader reader = new BufferedReader(new InputStreamReader(response.getEntity().getContent()));

        String line = "";
        while ((line = reader.readLine()) != null) {
            System.out.println(line);
        }
    }

}
