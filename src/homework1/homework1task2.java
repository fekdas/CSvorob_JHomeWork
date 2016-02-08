/* 2. —оздайте любое число. ќпределите, €вл€етс€ ли последн€€ цифра числа семеркой.
 */
package homework1;

public class homework1task2 {

	public static void main(String[] args) {
		
		int q = 12378;
		String text = Integer.toString(q);
		if (text.endsWith("7")) { // comparison last char with seven
			System.out.print("The last digit equals seven");
		} else {
			System.out.print("The last digit not equals seven");
		}
	}

}
