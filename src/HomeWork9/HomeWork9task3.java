package HomeWork9;

/*
 * Cоздать файл .txt с какими-нибудь записями, потом прочитать его в программе и вывести данные в консоль.
+ создать свой файл и записать туда информацию, введенную с консоли.
 */

import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.FileNotFoundException;
import java.util.Scanner;

import java.io.IOException;


public class HomeWork9task3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		File file = new File("C:/java/task3.txt"); // (с относительным расположением не разобрался)

		Scanner scnr = new Scanner(System.in);
		System.out.println("Введите что-то: ");
		
		// (запись в файл / создание файла) строки из консоли, дозапись в новую строку при повторном запуске
		if (scnr.hasNext()) {
			
			try(FileWriter writer = new FileWriter(file, true)) {
				String text = scnr.next();
				writer.append('\n');
				writer.write(text);
				//writer.flush();
			} catch (FileNotFoundException e) {

			e.printStackTrace();
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			
		// чтение файла
			try(FileReader reader = new FileReader(file)) {
				char[] buffer = new char[(int)file.length()];
			    reader.read(buffer);
			    System.out.println("Содержимое файла: "+new String(buffer));
			} catch (IOException e) {
				e.printStackTrace();
			}
			
		}
			
					
	}

}
