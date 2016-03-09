package HomeWork12;

/*
 * 3) ������� ������ � ������� ��������� ���, ������� � ��������. 
 * ������ ������� 2 ������� � ������� ���� ����� ������ (���). 
 * � ����� ���������� ������� ���, � ������ �������.
��������� �� ����������� �������.
 ��� ������� �������� � HashMap � ������� "man",  "woman" �������������.
������ ������������ ������� ������� ��� ������� ��� �� ����� �������
 � � ����������� � ���� �������� ����������� �������� �� ������� ������� �������� � HashMap.
�. �. �� ����� ����� ������� ��������� ��� �� �������.

 */

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Scanner;

public class HomeWork12task3 {

	public static void main(String[] args) {

		ArrayList<FIO> male = new ArrayList<>();
		ArrayList<FIO> female = new ArrayList<>();
		male.add(new FIO("male1name", "male1sn"));
		male.add(new FIO("male2name", "male2sn"));
		male.add(new FIO("male3name", "male3sn"));
		male.add(new FIO("male4name", "male4sn"));
		male.add(new FIO("male5name", "male5sn"));
		female.add(new FIO("fem1name", "fem1sn"));
		female.add(new FIO("fem2name", "fem2sn"));
		female.add(new FIO("fem3name", "fem3sn"));
		female.add(new FIO("fem4name", "fem4sn"));
		female.add(new FIO("fem5name", "fem5sn"));
		
		HashMap <String, ArrayList<FIO>> map = new HashMap <>();
		map.put("man", male);
		map.put("woman", female);
		
		Scanner sc = new Scanner(System.in);
	
		System.out.println("\n\"m\" - ������� ���; \n\"w\" - �������; \n anykey - �����");
		String ch = sc.nextLine();
		ch = ch.toUpperCase();
		ch = ch.trim();
		switch (ch)
			{
				case "M":
				{
					System.out.println(map.get("man").get((int)((map.get("man").size())*Math.random())));
					break;
				}
				case "W":
				{
					System.out.println(map.get("woman").get((int)((map.get("woman").size())*Math.random())));
					break;
				}
				default :
					System.exit(0);
			}
		}
	
		
	

}
