/*
 * 4. ������� ����� ����� (�����), ��� ����� � ����� ����� � ������.
 *  ������� ��� �����, ������� � ���� ����� ������� � ���������� ������.
 */

package homework1;

public class homework1task4 {

	public static void main(String[] args) {
		
		int money = 1157581;
		String text2 = Integer.toString(money); //convert the number to word
		//last digit comparison
		if (text2.endsWith("0") || text2.endsWith("5") || text2.endsWith("6") || text2.endsWith("7") || text2.endsWith("8") || text2.endsWith("9")) {
			System.out.println(money + " ������");
		} else if (text2.endsWith("2") || text2.endsWith("3") || text2.endsWith("4")){
			System.out.println(money + " �����");
		} else {
			System.out.println(money + " �����");
		}
			
			
			}

}
