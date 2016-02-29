/*
 * Делаем вот это задание:
Написать простой калькулятор в консоли, который будет уметь складывать, отнимать, умножать и делить числа, и выводить результат.
Числа вводить в консоли и проверять на корректность + проверять во время операций сложения, вычитания и тд.
Выбор оператора (+, -  и т. д.) можно спрашивать у пользователя в виде:
- введите 1, что-бы сложить 2 числа
- введите 2, что-бы умножить 2 числа

Вам нужно модернизировать калькулятор с использованием своих исключений.
Тоесть вы выносите весь код расчетов в отдельный метод или класс и там при возникновении проблемы генерируете собственные исключения.
Вы должны сделать как минимум 2 исключения - одно например которое ловит ошибки некорректного ввода, а другое ошибки при расчете
 - понятное дело что есть и стандартные ны мы хотим свои + добавьте в свое исключение метод getRussianMessage
  чтобы можно было получить описание ошибки на русском в методе main откуда все вызываете.
 */

package HomeWork11;

import java.util.Scanner;

public class HomeWork11calculator {

	public static void main(String[] args) {
		
		Scanner scanner = new Scanner(System.in);
		
		Double num1 = (double) 0;
		Double num2 = (double) 0;
		String operand;
		
		boolean cycle = true;
			do {
				System.out.println("Введите число num1:");		
				num1 = Double.parseDouble(scanner.nextLine().trim());
				System.out.println("Введите число num2:");		
				num2 = Double.parseDouble(scanner.nextLine().trim());
				System.out.println("Введите операцию (/*-+)");		
				operand = scanner.nextLine();
				
				try
				{
					switch (operand)
					{
					case "+":
						System.out.printf("num1+num2 = %.1f", num1 + num2);
						break;
					case "-":
						System.out.printf("num1-num2 =  %.1f", num1 - num2);
						break;
					case "*":
						System.out.printf("num1*num2 =  %.1f", num1 * num2);
						break;
					case "/":
						try
							{
								System.out.printf("num1/num2 = %.1f", division(num1, num2));
							} catch (DivisionByZero e) // Первое исключение
							{
								System.out.println(e.getRussianMessage());
							}
						break;
					default:
						System.out.println("Операция введена неверно");
					}
					cycle = true;
				} catch (NumberFormatException e) // Второе исключение
				{
					System.out.println(e.getMessage());
					cycle = false;
					System.out.println("Проверьте введённые значения!");
				}
				
				
			} while (cycle == false);
					
}	

	public static double division(Double a, Double b) throws DivisionByZero
	{
		if (b == 0)
			throw new DivisionByZero();
		return a / b;
	}		
}





