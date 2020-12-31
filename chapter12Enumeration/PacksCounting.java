package packsUnpacks;
import java.io.*;

public class PacksCounting {
	public static void main(String[] args) {
		PrintWriter pw = new PrintWriter(System.out, true);
		Integer iOb, iOb2;
		int i;
		
		iOb = 99;
		pw.println("First iOb value is: " + iOb);
		
		// Here the result automaticaly unpacks, counts and then packs back
		++iOb;
		pw.println("The result of ++iOb: " + iOb);
		
		iOb += 10;
		pw.println("The result unpacks automaticaly, counts and packs pack: " + iOb);
		
		// Here iOb unpacks, counts and then packs back to iOb2
		iOb2 = iOb + (iOb / 3);
		pw.println("iOb2: " + iOb2);
		
		i = iOb + (iOb / 3);
		pw.println("The same but autopack back doesn't commit because i is int. i: " + i);
	}
}
