/* 2. Создайте любое число. Определите, является ли последняя цифра числа семеркой.
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
