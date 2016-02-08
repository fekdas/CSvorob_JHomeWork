/* 3. Имеется прямоугольное отверстие размерами a и b (размеры задать любые), определить, можно ли его полностью закрыть круглой картонкой радиусом r (тоже подставляем любое значение).
 * 
 */

package homework1;

import static java.lang.Math.*;

public class homework1task3 {

	public static void main(String[] args) {

		int a = 17;
		int b = 19;
		double hypot = sqrt(pow(a, 2) + pow(b, 2)); // hypotenuse
		float r = 11.7f; // radius
		// hypotenuse & diameter comparison
		if ( 2*r >= hypot ) {
			System.out.println("The hole can be closed cardboard");
		} else {
			System.out.println("The hole can NOT be closed cardboard");
		}
	}

}
