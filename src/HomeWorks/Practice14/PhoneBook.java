package HomeWorks.Practice14;

import java.text.DecimalFormat;
import java.util.HashMap;
import java.util.Scanner;

public class PhoneBook
{
    public static void main(String[] args)
    {
        Scanner read = new Scanner(System.in);
        HashMap<String,String> namesAndNumbers = new HashMap<>();
        String line = read.nextLine();
        String[] lineArr;
        String[] fio;
        String numb;
        int it = 0;
        String aLine = "";
        boolean check = false;
        boolean checkN = true;

        while (!line.equals("EXIT"))
        {
            lineArr = line.split(" ");

            if (lineArr[0].equals("LIST") && lineArr.length == 1)
            {
                if (lineArr.length == 1)
                    System.out.println(namesAndNumbers);
                else
                    System.out.println("Неизвестная команда.");
            }
            else if((lineArr[0].charAt(0) >= 'А' && lineArr[0].charAt(0) <= 'Я') || (lineArr[0].charAt(0) >= 'а' && lineArr[0].charAt(0) <= 'я'))
            {
                fio = lineArr;
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
                if(!check)
                {
                    System.out.println("Введите номер абонента");
                    numb = read.nextLine();
                    aLine = "";
                    while (check)
                    {
                        checkN = false;
                        for(int i = 0; i < numb.length();i++)
                        {
                            if (numb.charAt(i) > 47 && numb.charAt(i) < 58)
                            {
                                it++;
                                aLine += numb.charAt(i);
                            }
                            else if (numb.charAt(i) != '-' && numb.charAt(i) != '(' && numb.charAt(i) != ')' && numb.charAt(i) != '+' && numb.charAt(i) != ' ')
                                checkN = true;
                        }
                    }
                }
            }
            else if(lineArr[0].charAt(0) > 47 && lineArr[0].charAt(0) < 58)
            {
                System.out.println("Введите номер абонента");
                numb = read.nextLine();
                aLine = "";
                while (check)
                {
                    checkN = false;
                    for(int i = 0; i < numb.length();i++)
                    {
                        if (numb.charAt(i) > 47 && numb.charAt(i) < 58)
                        {
                            it++;
                            aLine += numb.charAt(i);
                        }
                        else if (numb.charAt(i) != '-' && numb.charAt(i) != '(' && numb.charAt(i) != ')' && numb.charAt(i) != '+' && numb.charAt(i) != ' ')
                            checkN = true;
                    }
                }
            }
            else
                System.out.println("Неизвестная команда");

            line = read.nextLine();
        }
    }
}
