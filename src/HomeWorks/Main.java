package HomeWorks;

import HomeWorks.Practice1.MainPractice1;
import HomeWorks.Practice2.MainPractice2;
import HomeWorks.Practice3.MainPractice3;
import HomeWorks.Practice6.MainPractice6;
import HomeWorks.Practice78.MainPractice7;
import HomeWorks.Practice9.MainPractice9;

import java.util.Scanner;

public class Main
{
    static Scanner Read = new Scanner(System.in);
    static int PracticeNumber = -1;
    static int WorkNumber = -1;

    public static void main(String[] args)
    {
        System.out.println("Для выхода из проверки вводите - 0");
        while (PracticeNumber != 0)
        {
            try
            {
                System.out.println("Введите номер практической работы для проверки: ");
                PracticeNumber = Read.nextInt();

                switch (PracticeNumber)
                {
                    case(-1):
                        break;
                    case (1):
                        MainPractice1 mainPractice1 = new MainPractice1();
                        mainPractice1.Practice1(WorkNumber,args);
                        break;
                    case (2):
                        MainPractice2 mainPractice2 = new MainPractice2();
                        mainPractice2.practice2(WorkNumber);
                        break;
                    case(3):
                        MainPractice3 mainPractice3 = new MainPractice3();
                        mainPractice3.practice3(WorkNumber);
                        break;
                    case(9):
                        MainPractice9 mainPractice9 = new MainPractice9();
                        mainPractice9.practice9(WorkNumber);
                        break;
                    default:
                        System.out.println("Данной практической работы не существует либо она ещё не выполнена, попробуйте ввести другое значение: ");
                        break;
                }
            }
            catch (Exception ex)
            {
                System.out.println("Ошибка! " + ex);
            }
        }
    }
}
