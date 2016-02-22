package HomeWork9;

// В ПРОЦЕССЕ ИЗГОТОВЛЕНИЯ ...

/*
 * Создайте класс Студент с соответвующими полями (имя, фамилия, дата рождения).
 *  Поле дата рождения  должна быть типа Date.
 *  Создайте массив объектов класса Студент, заполнение данных должно быть из консоли, день рождения должен вводиться в виде строки (любой формат),
 *   затем конвертироваться в Date и записываться в объект Студент.
Ваша задача найти средний возраст всех студентов. Результат вывести в следующем виде:
50 лет 3 месяца.
 */

import java.util.Date;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.GregorianCalendar;
import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class HomeWork9task2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Student[] array = makeArray(3);
		
		
	}

	
	
	//--- Студент ---
	public class Student	{
		
		private String name;
		private String sname;
		private Date birth;

		public Student(String name, String sname, Date birth)
		{
			this.name = name;
			this.sname = sname;
			this.birth = birth;
		}
		public String getName()
		{		return name;	}
		public void setName(String name)
		{		this.name = name;	}
		public String getSname()
		{		return sname;	}
		public void setSname(String sname)
		{		this.sname = sname;	}
		public Date getBirth()
		{		return birth;	}
		public void setBirth(Date birth)
		{		this.birth = birth;	}
		@Override
		public String toString()
		{		return "Student: name:" + name + " sname:" + sname + ", birth=" + birth;}

	}
	

}
