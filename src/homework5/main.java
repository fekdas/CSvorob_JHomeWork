/*
������� �������� �������, ����������� ������� �������.
������� ��������� �������� ��������� �������, ����� �� ��� �������� � �������.
�������� ������ ����� ���� �� ��� ������.
*/

package HomeWork5;


    public static void main(String[] args)
    {
        TV one = new TV("LG", "model-1", 32, 200);
        TV two = new TV("LG", "model-2", 40, 800);
        WashMachine three = new WashMachine("Atlant", "model-x", 900);
        three.On();
        System.out.println(three.isOn());
    }

