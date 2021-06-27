public class Try {
    public static void main(String[] args) {
        int number = -2147483648;
        number -= 1;
        System.out.println("Hello " + number);
        
        // binary operations try and type conversion 
        
        int x = 100;
        System.out.println(Integer.toBinaryString(~x) + " " + Integer.toBinaryString(x));
        
        System.out.println(277&432); // if both bitwise values are 1 puts 1
        
        System.out.println(277|432);  // if at least one bitwise value is 1 puts 1
        
        System.out.println(277^432);	// if only one bitwise value is 1 puts 1
        
        System.out.println(Integer.toBinaryString(100));
        System.out.println(100 >> 2);  // moves 100 in 2-bit value to 2 symbols to the right 
        System.out.println(100 << 2);
        
        // Block
        char c1 = '\u0031';
        char c2 = '1';
        char c3 = 49;
        System.out.println(c1 + c2 + c3);
        // End of this block
        
        // Another Block
        int one = 1;
        long two = 1L;
        one = (int) (one + two); // so a = a + b doesn't convert automatically
        System.out.println(one);
        
        int one1 = 1;
        long two1 = 1L;
        one1 += two1;
        System.out.println(one1);
        
        // End
        
        byte b = 1;
		byte c = (byte) (b + 1); // IMPORTANT!!!!!

	}
}
