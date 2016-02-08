/* 1. �������� ������ � 10-� ����������� ���� int. ��������� �������� "for" ������� � �������� �� ����� ���������� � ���������� �������� � �������.
* min value =  "�������� ������� � ��� ����������".
* max value =  "�������� ������� � ��� ����������".
* ����� �������� ���������� �������� �� 0, � ���������� �������� �� 99 � �������� ������������ ������ �� ����� � ����:
* [23, 0, 34, 99, 43534].
 */

package homework2;

public class homework2task1 {

	public static void main(String[] args) {

		int[] array = {1, 2, 3, 8, 4, 6, 7, 9, 10, -2 }; // initial array
		int min = array[0];
		int max = array[0];
		
		for (int i = 0; i < array.length; i++) {
			//search min
			if (array[i] < min) {
				min = array[i];
			}
			//search max
			if (array[i] > max) {
				max = array[i];
			}			
		}
	
		System.out.println("min value = "+min);
		System.out.println("max value = "+max);
		//1st from 3 print sections
		System.out.print("[");
		
		for (int i = 0; i < array.length; i++) {
			//replace min with 0
			if (array[i] == min) {
				array[i] = 0;
			}
			//replace max with 99
			if (array[i] == max) {
				array[i] = 99;
			}
			//2nd from 3 print sections
			if (i < array.length-1) {
			System.out.print(array[i]+", ");
			}
			else {
			System.out.print(array[i]);
			}
		}
		//3rd from 3 print sections
		System.out.print("]");
				
	}

}
