/*
 * Сделать расчет выражения (x подставляем сами):
Далее выведите на экран количество символов в данной строке.
Далее разделите строку пополам (если ровно поделить не выходит то +-1 не страшно),
в результате у вас должно быть 2-е новых переменных типа String с частями из изначальной строки.
Полученные строки выведите на экран.
 */

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
