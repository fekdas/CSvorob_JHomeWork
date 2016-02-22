package com.svorob.constantine;

public class MoneyInterfaceWork
{
    private MoneyInterface listener2;


    public void setListener(MoneyInterface listener)
    {
        listener2 = listener;
    }

    public void Work()
    {
        if (listener2 != null)
        {
            listener2.snyatie();
        }
    }


}
