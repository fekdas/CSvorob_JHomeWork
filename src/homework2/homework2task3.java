/*
 * 3. Напишите программу, которая печатает массив, затем инвертирует (то есть меняет местами первый элемент с последним, второй — с предпоследним и т.д.), и вновь печатает.
 */
package homework2;

public class homework2task3 {

	public static void main(String[] args) {
		
		int[] array = {1, 3, 2, 4, 7, 6, 5};
		int[] invertarray = new int[array.length];
		
		System.out.print("Initial array: ");
		//print initial array
		for (int i = 0; i < array.length; i++) {
			System.out.print(array[i]+" ");
			invertarray[i] = 0;
		}
		
		System.out.println();
		System.out.print("Invert array: ");
		//invert
		for (int i = 0; i < array.length ; i++) {
			invertarray[i] = array[array.length-1 - i];
			System.out.print(invertarray[i]+" ");	 
		}
		
	}

}
