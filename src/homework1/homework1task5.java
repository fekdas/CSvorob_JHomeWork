/* 5. ������� ������, ������� �������� ������� ? � ������� #.
 *    �������� ��� ������� ? �� HELLO, � # - �������. ��������� ������� �� �����.
 */

package homework1;

public class homework1task5 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String text5 = "#what#?where#?when#?#";
		text5 = text5.replace("?", "HELLO"); //replace ? with HELLO
		text5 = text5.replace("#", ""); //replace # with NULL
		System.out.print(text5);
	}

}
