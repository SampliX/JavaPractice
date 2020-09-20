package HomeWorks.Practice3;

import HomeWorks.Practice2.DogKennel;
import HomeWorks.Practice2.Work1;

import java.util.Scanner;

public class MainPractice3
{
    static Scanner Read = new Scanner(System.in);
    public void practice3(int WorkNumber)
    {
        while (WorkNumber != 0) {
            System.out.println("Введите номер задания для проверки: ");
            WorkNumber = Read.nextInt();

            switch (WorkNumber) {
                case (0):
                    break;
                case (1):
                    CircleTest circleTest = new CircleTest();
                    circleTest.CircleTest();
                    break;
                case (2):
                    Human human = new Human();
                    human.Human();
                    break;
                default:
                    System.out.println("Данной работы не существует либо она ещё не выполнена, попробуйте ввести другое значение.");
                    break;

            }
        }
    }
}
