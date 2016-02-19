/*
 * 2. Задание по регуляркам:
С помощью регулярных выражений написать функцию которая будет выводить формат файла:
например ввел kjhkj.xml  - в итоге нам выведет формат xml.
Т. e. нужно обрезать все символы после последней точки.

Также отдельно сделать проверку файла на формат.
Например ввели sfdsgs.txt и нужно проверить это формат xml или json, если что-то другое, то вывести ошибку.

 */

package homework8;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class homework8task2 {
	
	public static void main(String strng) {
		regularsExtension("kjhkj.xml");
		regularsValidate("sfdsgs.txt");
		}

	private static void regularsExtension(String strng) {
		Pattern pattern1 = Pattern.compile(".+\\.([a-z]+)$");
		   Matcher matcher1 = pattern1.matcher(strng);
		   if (matcher1.find()) System.out.println("Расширение: " + matcher1.group(1));				
		   else System.out.println("Проверьте формат файла");		
	}

	private static void regularsValidate(String strng) {
		Pattern pattern1 = Pattern.compile(".+\\.(xml|json)$");
		   Matcher matcher1 = pattern1.matcher(strng);
		   if (matcher1.find()) System.out.println("ОК");
		   else System.out.println("Проверьте формат файла");		
	}
}


