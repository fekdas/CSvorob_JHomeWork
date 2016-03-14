package HomeWork16;

import java.util.Scanner;

/*
 * Написать приложение, в котором используются 2 потока(класс один и тот же). Класс потока задать как наследник Thread. Класс потока должен обеспечивать в методе run построчный несинхронизированный вывод в консольное окно чисел от 1 до 100 порциями по 10 чисел в строке, разделенных пробелами, причем перед каждой такой порцией должна стоять надпись:
"Thread 1:" для первого потока, "Thread 2:" — для второго  - можно использовать название потока (есть соответствующий метод).
Для вывода строки чисел задать в Main классе метод print10() - в нем запускать цикл на печать 10-ти чисел.
В приложении при вводе с клавиатуры "start" потоки должны стартовать.

 */

public class HomeWork16task2task3 {

	public static void main(String[] args)
	{
		System.out.println("Введите \"start\" для запуска потоков");
		 Scanner s = new Scanner(System.in);
		 switch (s.next())
		   {
		   case "start":
		   {
			   myThread thread = new myThread();
			   thread.setName("-111-");
			   thread.start();
			   myThread thread2 = new myThread();
			   thread2.setName("-222-");
			   thread2.start();
		   }
			 break;
		   default:
			 System.exit(0);
		   }

	}
	
	// 3) Усовершенствовать предыдущее приложение, обеспечив синхронизацию за счет объявления вызова print10() синхронизированным.
	// /*synchronized*/
	
public static /*synchronized*/ void print10()
{
	System.out.print(Thread.currentThread().getName());
	for (int i = 0; i<10; i++)
	{
		int a = (int) (Math.random()*100);
		System.out.print(" " + a);
	}
	System.out.println();
	
}

}
