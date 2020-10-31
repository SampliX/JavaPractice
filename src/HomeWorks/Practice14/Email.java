package HomeWorks.Practice14;

import java.util.Scanner;
import java.util.TreeSet;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Email
{
    public static void main(String[] args) {

        TreeSet<String> emails = new TreeSet<String>();
        Scanner read = new Scanner(System.in);
        String[] lineArr;
        String str;
        String line;
        boolean error = false;
        Pattern pattern;
        pattern = Pattern.compile("^([A-Za-z0-9]{1,}[\\\\.-]{0,1}[A-Za-z0-9]{1,})+@([A-Za-z0-9]{1,}[\\\\.-]{0,1}[A-Za-z0-9]{1,})+[\\\\.]{1}[a-z]{2,4}$");
        Matcher matcher;

        emails.add("jhgj@gmail.com");
        emails.add("gfjh@yandex.ru");

        System.out.println("Для выхода из программы введите - EXIT");

        line = read.nextLine();

        while (!line.equals("EXIT")) {
            lineArr = line.split(" ");

            switch (lineArr[0]) {
                case ("LIST"):
                    if (lineArr.length == 1)
                        System.out.println(emails);
                    else
                        System.out.println("Неизвестная команда.");
                    break;
                case ("ADD"):
                    matcher = pattern.matcher(lineArr[1]);
                    boolean found = matcher.matches();
                    if (found)
                    {
                        emails.add(lineArr[1]);
                        System.out.println("Добавлено");
                    }
                    else
                        System.out.println("Неверный ввод.");
                    break;
                default:
                    System.out.println("Неизвестная команда.");
                    break;
            }
            line = read.nextLine();
        }
    }
}
