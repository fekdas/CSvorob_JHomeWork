package HomeWork9;
/*
 * Создайте класс Студент с соответвующими полями (имя, фамилия, дата рождения).
 *  Поле дата рождения  должна быть типа Date.
 *  Создайте массив объектов класса Студент, заполнение данных должно быть из консоли, день рождения должен вводиться в виде строки (любой формат),
 *   затем конвертироваться в Date и записываться в объект Студент.
Ваша задача найти средний возраст всех студентов. Результат вывести в следующем виде:
50 лет 3 месяца.
 */

import java.util.Scanner;
import java.util.GregorianCalendar;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import java.text.ParseException;

public class HomeWork9task2 {

    public static void main(String[] args) {

        Student[] array = makeArray(3); // массив из 3 студентов
        long total = 0;

        for (Student e : array)
        {
            total += e.getBirth().getTime();
        }
        total = total/array.length);

        GregorianCalendar today = new GregorianCalendar();
        GregorianCalendar average = new GregorianCalendar();
        average.setTime(avg);

        int month, year;
// отдельно годы и месяцы
        if (today.get(GregorianCalendar.MONTH)<average.get(GregorianCalendar.MONTH))
        {
            month = today.get(GregorianCalendar.MONTH)-average.get(GregorianCalendar.MONTH)+12;
            average.add(GregorianCalendar.YEAR, 1);
            year = today.get(GregorianCalendar.YEAR)-average.get(GregorianCalendar.YEAR);
        }
        else
        {
            month = today.get(GregorianCalendar.MONTH)-average.get(GregorianCalendar.MONTH);
            year = today.get(GregorianCalendar.YEAR)-average.get(GregorianCalendar.YEAR);
        }

        for (Student e : array)
        {
            System.out.println("Студент: ", e.getName(), e.getSname(), e.getBirth());
        }
        System.out.println("Средний возраст " + year + " лет,  " + month + " месяцев");
    }

    //
    private static Student[] makeArray(int st)
    {
        Student[] array = new Student[st];
        Scanner scan1 = new Scanner(System.in);
        boolean done = true;
        for (int i = 0; i<array.length; i++)
        {
            Date myDate = null;
            String s = null;
            String sN = null;

            System.out.println("Введите имя");
            if(scan1.hasNext())
            {
                s = scan1.next();
                s = s.toUpperCase();
            }

            System.out.println("Введите фамилию");
            if(scan1.hasNext())
            {
                sN = scan1.next();
                sN = sN.toUpperCase();
            }

            do
            {
                System.out.println("Введите дату рождения (DD.MM.YY)");
                String sd = scan1.next();
                // Проверка ввода шаблоном
                Pattern pttrn = Pattern.compile("^\\d{2}\\.\\d{2}\\.\\d{2}$");
                Matcher mtch = pttrn.matcher(sd);
                if(mtch.find())
                {
                    done = true;
                    SimpleDateFormat formats = new SimpleDateFormat("dd.MM.yy");

                    try {
                        formats.setLenient(false);
                        myDate = formats.parse(sd);
                    } catch (ParseException e) {
                        done = false;
                        System.out.println("Вы ввели дату неверно");
                    }
                }
                else
                {
                    System.out.println("Допустимый формат - DD.MM.YY");
                    done = false;
                }
            }
            while (done==false);
            array[i] = new Student(s, sN, myDate);
        }
        return array;
    }

}