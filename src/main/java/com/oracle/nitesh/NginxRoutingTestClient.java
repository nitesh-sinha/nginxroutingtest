package com.oracle.nitesh;

import org.apache.http.HttpResponse;
import org.apache.http.client.*;
import org.apache.http.client.methods.HttpGet;
import org.apache.http.impl.client.HttpClientBuilder;

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class NginxRoutingTestClient {

    public static void main(String[] args) throws Exception {
        String line = "";
        StringBuffer buffer = new StringBuffer();
        // Send an HTTPS GET request
        String protocol = "https";
        String hostname = "test1.mgmt.uscom-central-1.c9dev1.oc9qadev.com";
        String port = "443";
        String url = protocol + "://" + hostname + ":" + port;

        HttpClient client = HttpClientBuilder.create().build();
        HttpGet request = new HttpGet(url);

        // Add request headers(comment this header statement to test non-SNI client behavior)
        request.addHeader("Host", hostname);

        // Send the HTTP request
        System.out.println("Sending an HTTP request to URL: " + url);
        HttpResponse response = client.execute(request);

        // Read the response
        int respStatusCode = response.getStatusLine().getStatusCode();
        System.out.println("Response code: " + respStatusCode);

        BufferedReader buffReader = new BufferedReader(new InputStreamReader(response.getEntity().getContent()));
        while ((line = buffReader.readLine()) != null) {
            buffer.append(line);
        }

        System.out.println("Response content: " + buffer.toString());
    }
}
