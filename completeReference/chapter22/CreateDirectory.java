package classes;

import java.nio.*;
import java.nio.file.*;

public class CreateDirectory {
    public static void main(String[] args) {
        try {
            Path p = Paths.get("DataSet");

            if (Files.exists(p)) {
                System.out.println("Directory already exists");
            } else {
                Path donePath = Files.createDirectory(p);
                System.out.println("Directory Created at: " + donePath.toString());
            }
        } catch (Exception exc) {
            System.out.println("Exception: " + exc);
            exc.printStackTrace();
        }
    }
}