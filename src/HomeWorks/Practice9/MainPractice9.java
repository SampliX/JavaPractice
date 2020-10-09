package HomeWorks.Practice9;

import java.util.Scanner;

public class MainPractice9
{
    static Scanner Read = new Scanner(System.in);
    public void practice9(int WorkNumber)
    {
        while (WorkNumber != 0) {
            System.out.println("Введите номер задания для проверки: ");
            WorkNumber = Read.nextInt();

            switch (WorkNumber) {
                case (0):
                    break;
                case (1):
                    HandleEmployees handleEmployees = new HandleEmployees();
                    handleEmployees.run();
                    break;
                default:
                    System.out.println("Данной работы не существует либо она ещё не выполнена, попробуйте ввести другое значение.");
                    break;

            }
        }
    }
}
