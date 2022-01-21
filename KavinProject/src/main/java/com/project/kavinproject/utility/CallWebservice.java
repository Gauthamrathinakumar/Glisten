/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.project.kavinproject.utility;

import java.io.BufferedReader;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.util.Base64;
import java.util.logging.Level;
import java.util.logging.Logger;
import okhttp3.MediaType;
import okhttp3.OkHttpClient;
import okhttp3.Request;
import okhttp3.RequestBody;
import okhttp3.Response;

/**
 *
 * @author Gautham
 */
public class CallWebservice {

    public String callRestServiceWithBasicAuth(String requestMethod, String url, String username, String password, String jsonBody, String userMediaType) {
        String output = "";
        Request request;
        try {
            OkHttpClient client = new OkHttpClient().newBuilder().build();
            MediaType mediaType = MediaType.parse(userMediaType);
            if (!(jsonBody.equalsIgnoreCase("NA") || jsonBody.equalsIgnoreCase(""))) {
                RequestBody body = RequestBody.create(mediaType, jsonBody);
                request = new Request.Builder()
                        .url(url)
                        .method(requestMethod, body)
                        .addHeader("Authorization", "Basic " + Base64.getEncoder().encodeToString((username + ":" + password).getBytes()))
                        .build();
            } else {
                request = new Request.Builder()
                        .url(url)
                        .get()
                        .addHeader("Authorization", "Basic " + Base64.getEncoder().encodeToString((username + ":" + password).getBytes()))
                        .build();
            }
            Response response = client.newCall(request).execute();
//            System.out.println("response code " + response.code());
            InputStream isr = response.body().byteStream();
            BufferedReader reader = new BufferedReader(new InputStreamReader(isr));
            StringBuilder out = new StringBuilder();
            String resultsXml;
            while ((resultsXml = reader.readLine()) != null) {
                out.append(resultsXml);
            }
            reader.close();
            output = out.toString();
            return output;

        } catch (Exception ex) {
            Logger.getLogger(CallWebservice.class.getName()).log(Level.SEVERE, null, ex);
            return "Error : " + ex.getMessage();
        }
    }

}
