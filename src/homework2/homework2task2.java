/*
* 2. �������� ������ � 10-� ����������� ���� float. ����� ������� ��������� � �������� �� ����������.
* ������: ���� ������ {2, 3, 5, 7, 6, 5, 7, 3, 7, 20} - � ������ ������� ����� 3 � 7 �����������.
* � ���������� ���������� ��������� �� ����� ������ �������:
* [3] - ���������� 2
* [7] - ���������� 3
 */

package homework2;

public class homework2task2 {

	public static void main(String[] args) {
		
		float[] array = {7, 3, 2, 4, 3, 6, 5, 2, 3, 7};
		int[] copies = new int[array.length]; //array of counters
		//bubble sort
		for (int i = array.length - 1; i > 0; i--) {
			for (int j = 0; j < i; j++) {
				if(array[j] > array[j + 1]) {
					float temp = array[j];
					array[j] = array[j + 1];
					array[j + 1] = temp;
				}
			}
		}
		
		//count copies from i to end
		for (int i = 0; i < array.length; i++) {
			copies[i] = 1;
			for (int j = i + 1; j < array.length; j++) {
				if (array[j] == array[i] ) {					
					copies[i]++;
				}
			}
		}
		//print unique copies with counters
		for (int i = 0; i < array.length; i++) {
			if (copies[i] != 1 ) {
				if (i > 0 && array[i] == array[i-1]) {
					continue;
				} else {
					System.out.print("["+array[i]+"] - ���������� ");
					System.out.println(copies[i]);
				}
			}
		}
		
	}
}