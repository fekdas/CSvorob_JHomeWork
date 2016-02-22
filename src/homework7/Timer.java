package HomeWork7;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Timer implements ActionListener // будет реализован таймер на совершение операции
{

    @Override
    public void actionPerformed(ActionEvent alert)
    {
        System.out.println("Время сеанса истекло. Попробуйте заново или ...");
        System.exit(0);
    }

}
