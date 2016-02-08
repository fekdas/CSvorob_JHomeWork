/*
 * 1. Создайте массив с 10-ю переменными типа int.
Значения необходимо вводить с клавиатуры в отдельном методе.
Затем выведите все значения на экран также в отдельном методе в виде:
"значение" | "значение 2" | "значение 3" |  и тд. -
Далее отсортируйте массив по возрастанию одним из способов из статьи (или всеми:) ).
Результат вывести на экран:
"значение" | "значение 2" | "значение 3" |  и тд.
Далее найдите в массиве все четные числа и выведите их на экран:
"значение" | "значение 2" | "значение 3" |  и тд.

В итоге у вас должна получиться программа как минимум с 3 методами:
1- для ввода данных с клавиатуры
2 - для сортировки
3 - для вывода 

Вывод значений массива на экран должен быть сделан в отдельном методе,
этот метод будет использоваться для вывода значений массива до сортировки и после сортировки.
 */

package homework3;
import java.util.Arrays;
import java.util.Scanner;

public class HomeWork3task1 {

	public static void main(String [] args){

		int[] inputarray = new int[10];
		initarray(inputarray);
		printarray(inputarray);

		bubble(inputarray);
		printarray(inputarray);

		selections(inputarray);
		printarray(inputarray);

		Arrays.sort(inputarray); // (3rd method of sort.)
		printarray(inputarray);

		even(inputarray);
	}

	// Init array
	public static void initarray(int[] array){
		Scanner scanner = new Scanner(System.in);
		for (int i = 0; i < array.length ; i++) {
			System.out.println("Enter numbers of array " + i + " :");
			if (scanner.hasNextInt()) {
				array[i] = scanner.nextInt();
			} else {
				System.out.println("Error!");
				i--;
			}
		}
	}

	// Print array
	public static void printarray(int[] array){
		for (int i = 0; i < array.length ; i++) {
			System.out.print("|" + array[i] );
		}
		System.out.println();
	}

	// Bubble (1st method)
	public static void bubble(int[] array){
		for(int i = array.length - 1 ; i > 0; i--){
			for(int j = 0; j < i ;j++){
				int t;
				if (array[j] > array[j+1]) {
					t = array[j+1];
					array[j+1] = array[j];
					array[j] = t;
				}
			}
		}
	}

	// Select (2nd method of sort.)
	public static void selections(int[] array){
		for(int i = 0; i < array.length; i++){
			for (int j = i + 1 ; j < array.length; j++) {
				int k;
				if(array[j] < array[i]){
					k = array[j];
					array[j] = array[i];
					array[i] = k;
				}
			}
		}
	}

	// Even print
	public static void even(int[] array){
		System.out.println("Even numbers : ");
		for (int i = 0; i <array.length ; i++) {
			if (array[i]%2 == 0) {
				System.out.print("|" + array[i]);
			}
		}
	}

}