import java.io.*;

public class FileOpenerUpdated {
    public static void main(String[] args) {
        int i;
        FileInputStream file = null;
        
        if(args.length != 1) {
            System.out.println("Use this file: java FileOpenerUpdated file_name");
            return;
        }
        
        try {
            file = new FileInputStream(args[0]);
            do {
                i = file.read();
                if(i != -1) System.out.print((char) i);
				// if here is necessary because it will write EOF(end-of-file)symbol.
            } while (i != -1);
        // we don't need to catch FileNotFoundException because it is подкласс IOExeption
        } catch (IOException exc) {  
             System.out.println("Error: " + exc);
        } finally {
            try {
                if (file != null) file.close();
            } catch (IOException exc) {
                System.out.println("Closing file error!");
            }
        }
    }
}
