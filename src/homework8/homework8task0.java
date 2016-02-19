package homework8;

import java.util.regex.Pattern;
import java.util.regex.Matcher;

public class homework8task0 {

	public static void main(String[] args) {
		
//				Pattern pattern = Pattern.compile("^\\D+#\\d+$"); //шаблон для регулярного выражения, по которому будет поиск
//				Matcher matcher = pattern.matcher("sdfgsd#3645"); //Matcher - объект, который умеет находить и сравнивать по заданному шаблону
//				if(matcher.find()) {
//					System.out.print("Найдено 1");
				
		// Проверка гос.номера 
				Pattern pattern1 = Pattern.compile("^[0-9]{4}\\s{1}[A-СEH-KMOPTX]{2}\\-[0-7]$");
				Matcher matcher1 = pattern1.matcher("2510 AР-7");
				
				if(matcher1.find()) {
					System.out.println("Гос. номер введён верно!\n");
				}
								
		// Проверка телефонного номера и его очистка на входе:
				String number = "++37sd52g96h84j9981"; //... на входе
				String number2 = number.replaceAll("\\D", ""); // Удаляем все нецифры методом replaceAll
				System.out.println(number);
				
				Pattern pattern2 = Pattern.compile("^375+(17|25|29|33|44)+\\d{7}$"); // Проверка цифровой части номера	
				Matcher matcher2 = pattern2.matcher(number2);
				
				if(matcher2.find()) {
					System.out.println("Номер телефона: +"+number2);
				}
				else System.out.print("Цифры телефонного номера введены неверно!");
	}
	
}
	

