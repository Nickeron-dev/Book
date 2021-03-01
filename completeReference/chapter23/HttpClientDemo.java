package classes;

import java.net.*;
import java.net.http.*;
import java.io.*;
import java.util.*;

public class HttpClientDemo {
    public static void main(String[] args) throws Exception {
        HttpClient myHc = HttpClient.newHttpClient();

        HttpRequest myReq = HttpRequest.newBuilder(new URI("http://www.google.com/")).build();

        HttpResponse<InputStream> myResp = myHc.send(myReq, HttpResponse.BodyHandlers.ofInputStream());

        System.out.println("Response: " + myResp.statusCode());
        System.out.println("Request method is" + myReq.method());

        HttpHeaders hdrs = myResp.headers();

        Map<String, List<String>> hdrMap = hdrs.map();
        Set<String> hdrField = hdrMap.keySet();

        System.out.println("\nHere is the header");

        for (String k : hdrField) {
            System.out.println("key: " + k + " Value: " + hdrMap.get(k));
        }

        System.out.println("\nBody:");

        InputStream input = myResp.body();
        int c;

        while ((c = input.read()) != -1) {
            System.out.print((char) c);
        }
    }

}