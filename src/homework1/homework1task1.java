/* 1.  �������� ���������� ���� String c ����� ������� (�� ������ ��������).
* ����� �������� �� ����� ���������� �������� � ������ ������.
* ����� ��������� ������ ������� (���� ����� �������� �� ������� �� +-1 �� �������),
* � ���������� � ��� ������ ���� 2-� ����� ���������� ���� String � ������� �� ����������� ������.
* ���������� ������ �������� �� �����.
 */
package homework1;

public class homework1task1 {

	public static void main(String[] args) {
		
		String txt = "thistexthavemanyletters"; // init text
		System.out.println("Init text: "+txt);
	    int size = txt.length(); //var "size" is number of letters
		System.out.println("Text size, letters: "+size);
		String part1 = txt.substring(0, size/2); //var "part1" contains chars from begin to middle of txt
		String part2 = txt.substring(size/2, size); //var "part2" contains chars from middle to end of txt
		System.out.println("String1: "+part1);	
		System.out.println("String2: "+part2);
	}

}
