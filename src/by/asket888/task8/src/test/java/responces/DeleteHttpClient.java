package responces;

import org.apache.http.HttpResponse;
import org.apache.http.client.HttpClient;
import org.apache.http.client.methods.HttpDelete;
import org.apache.http.impl.client.DefaultHttpClient;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class DeleteHttpClient {

    public static void requestDelete(String id) throws IOException {

        String url = "http://thomas-bayer.com/sqlrest/PRODUCT/" + id;

        HttpClient client = new DefaultHttpClient();
        HttpDelete DeleteRequest = new HttpDelete(url);

        HttpResponse response = client.execute(DeleteRequest);

        System.out.println("Response code: " + response.getStatusLine().getStatusCode());

        BufferedReader reader = new BufferedReader(new InputStreamReader(response.getEntity().getContent()));

        String line = "";
        while ((line = reader.readLine()) != null) {
            System.out.println(line);
        }
    }
}
