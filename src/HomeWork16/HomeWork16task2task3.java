package HomeWork16;

import java.util.Scanner;

/*
 * �������� ����������, � ������� ������������ 2 ������(����� ���� � ��� ��). ����� ������ ������ ��� ��������� Thread. ����� ������ ������ ������������ � ������ run ���������� �������������������� ����� � ���������� ���� ����� �� 1 �� 100 �������� �� 10 ����� � ������, ����������� ���������, ������ ����� ������ ����� ������� ������ ������ �������:
"Thread 1:" ��� ������� ������, "Thread 2:" � ��� �������  - ����� ������������ �������� ������ (���� ��������������� �����).
��� ������ ������ ����� ������ � Main ������ ����� print10() - � ��� ��������� ���� �� ������ 10-�� �����.
� ���������� ��� ����� � ���������� "start" ������ ������ ����������.

 */

public class HomeWork16task2task3 {

	public static void main(String[] args)
	{
		System.out.println("������� \"start\" ��� ������� �������");
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
	
	// 3) ����������������� ���������� ����������, ��������� ������������� �� ���� ���������� ������ print10() ������������������.
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
