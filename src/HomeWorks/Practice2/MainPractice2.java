package HomeWorks.Practice2;

import java.util.Scanner;

public class MainPractice2
{
    static Scanner Read = new Scanner(System.in);
    public void practice2(int WorkNumber)
    {
        while (WorkNumber != 0) {
            System.out.println("Введите номер задания для проверки: ");
            WorkNumber = Read.nextInt();

            switch (WorkNumber) {
                case (0):
                    break;
                case (1):
                    Work1 work1 = new Work1();
                    work1.ShapeTester();
                    break;
                case (2):
                    DogKennel dogKennel = new DogKennel();
                    dogKennel.dogs();
                    break;
                default:
                    System.out.println("Данной работы не существует либо она ещё не выполнена, попробуйте ввести другое значение.");
                    break;

            }
        }
    }
}
