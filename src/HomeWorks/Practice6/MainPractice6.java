package HomeWorks.Practice6;

import java.util.Scanner;

public class MainPractice6
{
    static Scanner Read = new Scanner(System.in);
    public void practice6(int WorkNumber)
    {
        while (WorkNumber != 0) {
            System.out.println("Введите номер задания для проверки: ");
            WorkNumber = Read.nextInt();

            if(WorkNumber == 1)
            {
                MovableRectangle movableRectangle = new MovableRectangle(12.5, 15.6);
                System.out.println(movableRectangle.getHeight());
                MovablePoints movablePoints = new MovablePoints();
                movablePoints.setPoints(12.5, 12.8);
                System.out.println();
                movablePoints.speedCheck();
            }
            else
                System.out.println("Данной работы не существует либо она ещё не выполнена, попробуйте ввести другое значение.");
        }
    }
}
