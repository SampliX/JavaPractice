package HomeWorks.Practice1;

import java.util.Scanner;

public class MainPractice1
{
    Scanner Read = new Scanner(System.in);
    public void Practice1(int WorkNumber, String[] args)
    {
        while (WorkNumber != 0) {
            System.out.println("Введите номер задания для проверки: ");
            WorkNumber = Read.nextInt();

            switch (WorkNumber) {
                case (0):
                    break;
                case (1):
                    Work1 work1 = new Work1();
                    work1.StartVoids();
                    break;
                case (2):
                    args = new String[]{"Первый аргумент, ", "Втрой аргумент, ", "Третий аргумент, ", "Четвертый аргумент, ", "Пятый аргумент."};
                    for (int i = 0; i < args.length; i++)
                        System.out.println(args[i]);
                    break;
                case (3):
                    Work3 work3 = new Work3();
                    work3.harmonicSeries();
                    break;
                case (4):
                    Work4 work4 = new Work4();
                    work4.FillArray();
                    break;
                case (5):
                    System.out.println("Введите число:");
                    Work5 work5 = new Work5();
                    work5.Factorial(Read.nextInt());
                    break;
                default:
                    System.out.println("Данной работы не существует либо она ещё не выполнена, попробуйте ввести другое значение.");
                    break;

            }
        }
    }
}
