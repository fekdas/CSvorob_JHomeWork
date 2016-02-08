package homework1;

import static java.lang.Math.*;

public class homework1taskExtended {

	public static void main(String[] args) {
		
		int x = 10;
		int s = 3;
		int t = 4; 
		if (pow(x, s) != -1) {
			double y = pow((sin(pow(x, t))),2) / sqrt(1 + pow(x, s));
			System.out.print("y = " + y);
		} else {
			System.out.print("division by zero"); 
		}
	}

}
