package HomeWorks.Practice13;

import java.util.Scanner;

public class SecondNumber
{
    public static void main(String[] args)
    {
        String line;
        boolean check = false;
        Scanner read = new Scanner(System.in);

        line = read.nextLine();

        String[] fio = line.split(" ");

        if((fio.length > 1 && fio.length < 4))
        {
            for(int i = 0; i < fio.length; i++)
            {
                for (int j = 0; j < fio[i].length(); j++)
                {
                    if ((fio[i].charAt(j) < 1040 || fio[i].charAt(j) > 1103) && fio[i].charAt(j) != 45)
                    {
                        check = true;
                        j = fio[i].length();
                        i = fio.length;
                    }
                }
            }
        }
        else
            check = true;

        if(check)
            System.out.println("Введенная строка не является ФИО");
        else
        {
            if(fio.length == 2)
            {
                System.out.println("Фамилия: " + fio[0] + "\n" + "Имя: " + fio[1]);
            }
            else if (fio.length == 3)
            {
                System.out.println("Фамилия: " + fio[0] + "\n" + "Имя: " + fio[1] + "\n" + "Отчество: " + fio[2]);
            }
        }
    }
}
