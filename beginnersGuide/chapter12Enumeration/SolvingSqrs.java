package packsUnpacks;
import static java.lang.Math.sqrt;
import static java.lang.Math.pow;
import static java.lang.System.out;
public class SolvingSqrs {
	public static void main(String[] args) {
		double a, b, c;
		
		// solving 4x^2 + x - 3
		a = 4;
		b = 1;
		c = -3;
		// Math.sqrt() and Math.pow() are static so after import static we can use them every where and with no Math.
		double answer1 = ((-b + sqrt(pow(b, 2) - 4 * a * c)) / (2 * a));
		double answer2 = ((-b - sqrt(pow(b, 2) - 4 * a * c)) / (2 * a));
		out.println("answer1: " + answer1);
		out.println("answer2: " + answer2);
	}
}
