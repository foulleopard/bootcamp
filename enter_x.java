import java.util.*;
import java.lang.*;
import static java.lang.System.out;

public class enter_x {
	
	public static void main(String args[]) {
		
		Scanner input = new Scanner(System.in);
		String i = null;
		int sum = 0, n = 0;
		out.println("Enter a Number: ");
		
		/*do {
		  try {
			i = input.nextInt();
			sum += i;
		  } catch (InputMismatchException e) {
			System.out.println(sum);
			System.exit(0);
		} 
		} while (true);*/
		
		
		do {
			
			try {
				i = input.next();
				n = Integer.parseInt(i);
				sum += n;
			} catch (NumberFormatException e) {
				if (!i.equals("x")) {
					throw e;
				}
				System.out.println(sum);
			} 
		} while (true);
	}
}


