package classes;

import java.nio.*;
import java.nio.file.*;
import java.util.*;

public class ReadFromFile {
    public static void main(String[] args) {
        try {
            Path p = Paths.get("DataSet/text.txt");
            List<String> data = Files.readAllLines(p);

            for(String str : data) {
                System.out.println(str);
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
