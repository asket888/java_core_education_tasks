package test;

import org.testng.annotations.Test;
import responces.DeleteHttpClient;
import responces.GetHttpClient;
import responces.PostHttpClient;

import java.io.IOException;

public class Post_Get_Delete_Get_Test {

    @Test
    public void PostRequestTest() throws IOException {
        PostHttpClient.requestPost("100", "New Product", "10");
    }

    @Test
    public void GetRequestAfterPostTest() throws IOException {
        GetHttpClient.requestGet("40");
    }

    @Test
    public void DeleteRequestTest() throws IOException {
        DeleteHttpClient.requestDelete("49");
    }

    @Test
    public void GetRequestAfterDeleteTest() throws IOException {
        GetHttpClient.requestGet("100");
    }
}
