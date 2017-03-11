package responces;

import org.apache.http.HttpResponse;
import org.apache.http.client.HttpClient;
import org.apache.http.client.methods.HttpGet;
import org.apache.http.impl.client.DefaultHttpClient;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class GetHttpClient {

    public static void requestGet(String id) throws IOException {

        String url = "http://thomas-bayer.com/sqlrest/PRODUCT/" + id;

        HttpClient client = new DefaultHttpClient();
        HttpGet getRequest = new HttpGet(url);

        HttpResponse response = client.execute(getRequest);

        System.out.println("Response code: " + response.getStatusLine().getStatusCode());

        BufferedReader reader = new BufferedReader(new InputStreamReader(response.getEntity().getContent()));

        String line = "";
        while ((line = reader.readLine()) != null) {
            System.out.println(line);
        }
    }
}
