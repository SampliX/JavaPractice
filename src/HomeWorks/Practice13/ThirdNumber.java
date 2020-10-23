package HomeWorks.Practice13;

import java.util.Scanner;

public class ThirdNumber
{
    public static void main(String[] args)
    {
        Scanner read = new Scanner(System.in);
        String line = read.nextLine();
        String aLine = "";
        String endLine = "";
        int it = 0;
        boolean check = false;

        for(int i = 0; i < line.length();i++)
        {
            if(line.charAt(i) > 47 && line.charAt(i) < 58)
            {
                it++;
                aLine += line.charAt(i);
            }
            else if(line.charAt(i) != '-' || line.charAt(i) != '(' || line.charAt(i) != ')' || line.charAt(i) != '-')
                check = true;
        }

        if(it == 10 && !check)
        {
            endLine = "+" + 7 +
                    " (" + aLine.charAt(0) + aLine.charAt(1) + aLine.charAt(2) + ") " +
                    aLine.charAt(3) + aLine.charAt(4) + aLine.charAt(5) + "-" +
                    aLine.charAt(6) + aLine.charAt(7) + "-" +
                    aLine.charAt(8) + aLine.charAt(9);
            System.out.println(endLine);
        }
        else if (it == 11 && (aLine.charAt(0) == '7' || aLine.charAt(0) == '8') && !check)
        {
            endLine = "+" + 7 +
                    " (" + aLine.charAt(1) + aLine.charAt(2) + aLine.charAt(3) + ") " +
                    aLine.charAt(4) + aLine.charAt(5) + aLine.charAt(6) + "-" +
                    aLine.charAt(7) + aLine.charAt(8) + "-" +
                    aLine.charAt(9) + aLine.charAt(10);
            System.out.println(endLine);
        }
        else
            System.out.println("Некорректная входная строка");

    }
}
