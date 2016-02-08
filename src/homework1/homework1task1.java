/* 1.  Создайте переменную типа String c любым текстом (не сильно короткое).
Далее выведите на экран количество символов в данной строке.
Далее разделите строку пополам (если ровно поделить не выходит то +-1 не страшно),
в результате у вас должно быть 2-е новых переменных типа String с частями из изначальной строки.
Полученные строки выведите на экран.
 */
package homework1;

public class homework1task1 {

	public static void main(String[] args) {
		
		String txt = "thistexthavemanyletters"; // init text
		System.out.println("Init text: "+txt);
	    int size = txt.length(); //var "size" is number of letters
		System.out.println("Text size, letters: "+size);
		String part1 = txt.substring(0, size/2); //var "part1" contains chars from begin to middle of txt
		String part2 = txt.substring(size/2, size); //var "part2" contains chars from middle to end of txt
		System.out.println("String1: "+part1);	
		System.out.println("String2: "+part2);
	}

}
