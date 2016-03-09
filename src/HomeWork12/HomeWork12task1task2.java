package HomeWork12;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.Scanner;

/*
 * 1) Создать массив с данными типа String, с использованием наиболее подходящей коллекции.
Заполнить его данными. Данные должны вводиться с консоли, массив может быть любой длинны. 
Ввод прекрашать по вводу спец. команды (придумать любой символ при вводе которого прекращаем
заполнение массива).
Далее читаем данные массива в цикле и удаляем из строк все буквы "а".
Затем выводим получившийся массив.

2) Необходимо удалить дубликаты из массива предыдущего задания.
 */

public class HomeWork12task1task2 {

	public static void main(String[] args) {
		
		ArrayList<String> strings = new ArrayList<>();
		 Scanner sc = new Scanner(System.in);
		 String exit = null;
		 String s = null;
		 
		 do
			 // Заполняем массив строками
			 {
			  System.out.println("Введите строку");
				    if(sc.hasNext())
					{
				       	s = sc.next();
				    }
				    strings.add(s);
				    
			  System.out.println("Ещё? (anykey - YES / X - exit)");
			  if(sc.hasNext())
					{
				       	exit = sc.next();
				    }
			  }
		 
		 while (!exit.equalsIgnoreCase("x"));
		 
		 System.out.println("Исходная коллекция строк: " + strings.toString());
		 
		 for (int i = 0; i< strings.size(); i++)
			 {
				 String s2 = strings.get(i);
				 s2 = s2.replaceAll("a", ""); //удаляем буквы "а"
				 strings.set(i, s2);				 
			 }
		 
		 System.out.println("Коллекция после удаления букв -а-: " + strings.toString());
		 
		 //удаляем дубликаты 
		 HashSet<String> hs = new HashSet<>(strings);
		 strings.clear(); strings.addAll(hs);
		 System.out.println("Коллекция без дубликатов: " + strings.toString());
  }
}