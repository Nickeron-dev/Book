package classes;

import java.nio.file.*;
import java.nio.*;

public class CreateFile {
    public static void main(String[] args) {
        try {
            Path p = Paths.get("DataSet/text.txt");
            if (Files.exists(p)) {
                System.out.println("File already exists");
            } else {
                Path donePath = Files.createFile(p);
                System.out.println("File is created: " + donePath.toString());
            }
        } catch (Exception exc) {
            exc.printStackTrace();
        }
    }
}