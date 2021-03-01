package classes;

import java.net.*;
import java.io.*;

public class Whois {
    public static void main(String[] args) throws Exception {
        int c;

        // creating a socket connected to internic.net
        try (Socket s = new Socket("whois.internic.net", 43)) {

            // obtaining input and output stream
            InputStream input = s.getInputStream();
            OutputStream output = s.getOutputStream();

            String str = (args.length == 0 ? "OraclePressBooks.com" : args[0]) + "\n";
            // convert to bytes
            byte[] buf = str.getBytes();

            // sending a request
            output.write(buf);

            while ((c = input.read()) != -1) {
               System.out.print((char) c);
            }
        } 
        // an Exception is thrown so we don't need to catch it
    }
}
