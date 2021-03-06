package HomeWork6bankomat;

/**
 * Создать класс и объекты описывающие Банкомат.
 * Набор купюр находящихся в банкомате должен задаваться тремя свойствами:
 * количеством купюр номиналом 20 50 100. Сделать методы для добавления денег в банкомат.
 * Сделать функцию снимающую деньги. На вход передается сумма денег.
 * На выход – булевское значение (операция удалась или нет).
 * При снятии денег функция должна рапечатывать каким количеством купюр какого номинала выдается сумма.
 * Создать конструктор с тремя параметрами – количеством купюр.
 */

import java.util.Scanner;

public class HomeWork6

{
    public static void main(String[] args)

    {

        Money ATM = new Money(0,0,0); //банкноты в банкомате
        Money cashback = new Money(0,0,0); // cashback - выдаваемые банкноты
        Scanner scan = new Scanner(System.in);
        int deltaminus = 0;
        boolean donemoney;
        boolean success = false;

        do
        {
            System.out.println("Введите:\n\"1\" - Остаток на счёте\n\"2\" - Зачисление\n\"3\" - Снятие\n\"любая клавиша\" - Выход");
            if (scan.hasNextInt())
            {
                int finddone = scan.nextInt();
                switch (finddone)
                {
                    case 1:
                        System.out.print("Доступно: ");
                        atm.getMoney();
                        break;
                    case 2:
                        do
                        {
                            System.out.println("Введите сумму внесения");
                            if(scan.hasNextInt())
                            {
                                int deltaplus = scan.nextInt();
                                donemoney = true;
                                atm.addMoney(deltaplus);
                                System.out.println("Успешно");
                            }
                            else
                            {
                                System.out.println("Исправьте введенное значение!");
                                donemoney = false;
                            }
                        }
                        while (donemoney==false);
                        break;
                    case 3:
                        do
                        {
                            System.out.println("Введите сумму для снятия");
                            if(scan.hasNextInt())
                            {
                                deltaminus = scan.nextInt();
                                donemoney = true;
                                if (deltaminus <= atm.checkMoney() && deltaminus >= 0)
                                    success = true;
                                else
                                    success = false;
                            }
                            else
                            {
                                System.out.println("Исправьте введенное значение!");
                                donemoney = false;
                            }
                        }
                        while (donemoney==false);

                        if (success)
                        {
                            cashback.reset();
                            cashback.addCash(deltaminus);
                            if (atm.getS100()-cashback.getK100()<0 ||
                                    atm.getS50()-cashback.getK50()<0 ||
                                    atm.getS20()-cashback.getK20()<0)
                            {
                                System.out.println("Операция невозможна, не хватает купюр нужного номинала\n Попробуйте снять другую сумму");
                                cashback.reset();
                            }
                            else
                            {
                                atm.setS100(atm.getS100()-cashback.getK100());
                                atm.setS50(atm.getS50()-cashback.getK50());
                                atm.setS20(atm.getS20()-cashback.getK20());
                                System.out.print("Issued ");
                                cashback.getCash();
                            }
                        }
                        else System.out.println("Недостаточно средств на балансе!");
                        break;


                    default:
                        System.exit(0);
                }
            }
            else System.exit(0);
        }
        while (true);
    }
}

class Money
{
    private int k100;
    private int k50;
    private int k20;

    // конструктор купюр
    public Money(int k100, int k50, int k20)
    {
        this.k100 = k100;
        this.k50 = k50;
        this.k20 = k20;
    }


    // количество денег
    public void getCash()

    {
        int b = 100* k100 + 50* k50 + 20* k20;
        System.out.println(" сумма " + b + " руб\nКупюр -100- : " + k100 + " шт\nКупюр -50- : " + k50 + " шт\nКупюр -20- : " + k20 + " шт");
    }

    // выборка с равномерным распределением купюр
    public void addCash(int num)
    {
        num=num/10;
        while (num >= 2)
        {
            if ((num>=17 && num != 20) || (num%2 == 0 && num>=10 && num<17))
            {
                k100++;
                num-=10;
            }
            if (num == 15)
            {
                k100++;
                k50++;
                num-=15;
            }
            if (num>=9 || num == 7 || num == 5)
            {
                k50++;
                num-=5;
            }
            if (num>=2)
            {
                k20++;
                num-=2;
            }
        }
    }

    public int checkMoney()
    {
        int b = 100* k100 + 50* k50 + 20* k20;
        return b;
    }

    public void reset()
    {
        k100 = k50 = k20 = 0;
    }

    public int getK100() {
        return k100;
    }

    public void setK100(int k100) {
        this.k100 = k100;
    }

    public int getK50() {
        return k50;
    }

    public void setK50(int k50) {
        this.k50 = k50;
    }

    public int getK20() {
        return k20;
    }

    public void setK20(int k20) {
        this.k20 = k20;
    }

}
