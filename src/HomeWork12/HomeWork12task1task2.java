package HomeWork12;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.Scanner;

/*
 * 1) ������� ������ � ������� ���� String, � �������������� �������� ���������� ���������.
��������� ��� �������. ������ ������ ��������� � �������, ������ ����� ���� ����� ������. 
���� ���������� �� ����� ����. ������� (��������� ����� ������ ��� ����� �������� ����������
���������� �������).
����� ������ ������ ������� � ����� � ������� �� ����� ��� ����� "�".
����� ������� ������������ ������.

2) ���������� ������� ��������� �� ������� ����������� �������.
 */

public class HomeWork12task1task2 {

	public static void main(String[] args) {
		
		ArrayList<String> strings = new ArrayList<>();
		 Scanner sc = new Scanner(System.in);
		 String exit = null;
		 String s = null;
		 
		 do
			 // ��������� ������ ��������
			 {
			  System.out.println("������� ������");
				    if(sc.hasNext())
					{
				       	s = sc.next();
				    }
				    strings.add(s);
				    
			  System.out.println("���? (anykey - YES / X - exit)");
			  if(sc.hasNext())
					{
				       	exit = sc.next();
				    }
			  }
		 
		 while (!exit.equalsIgnoreCase("x"));
		 
		 System.out.println("�������� ��������� �����: " + strings.toString());
		 
		 for (int i = 0; i< strings.size(); i++)
			 {
				 String s2 = strings.get(i);
				 s2 = s2.replaceAll("a", ""); //������� ����� "�"
				 strings.set(i, s2);				 
			 }
		 
		 System.out.println("��������� ����� �������� ���� -�-: " + strings.toString());
		 
		 //������� ��������� 
		 HashSet<String> hs = new HashSet<>(strings);
		 strings.clear(); strings.addAll(hs);
		 System.out.println("��������� ��� ����������: " + strings.toString());
  }
}