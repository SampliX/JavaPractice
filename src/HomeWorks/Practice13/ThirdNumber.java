package HomeWorks.Practice13;
import java.util.Scanner;

public class ThirdNumber
{
    public static void main(String[] args)
    {
        Scanner read = new Scanner(System.in);
        String line = read.nextLine();
        String aLine = "";
        int it = 0;
        boolean check = false;

        for(int i = 0; i < line.length();i++) {
            if (line.charAt(i) > 47 && line.charAt(i) < 58) {
                it++;
                aLine += line.charAt(i);
            } else if (line.charAt(i) != '-' || line.charAt(i) != '(' || line.charAt(i) != ')' || line.charAt(i) != '+' || line.charAt(i) != ' ')
                check = true;
        }
        if(it == 10 && !check)
            System.out.println("+" + 7 + " (" + aLine.substring(0,3) + ") " + aLine.substring(3,6) + "-" + aLine.substring(6,8) + "-" + aLine.substring(8,10));
        else if (it == 11 && (aLine.charAt(0) == '7' || aLine.charAt(0) == '8') && !check)
            System.out.println("+" + 7 + " (" + aLine.substring(1,4) + ") " + aLine.substring(4,7) + "-" + aLine.substring(7,9) + "-" + aLine.substring(9,11));
        else
            System.out.println("Некорректная входная строка");
    }
}
