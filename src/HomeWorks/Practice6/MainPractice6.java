package HomeWorks.Practice6;

import java.util.Scanner;

public class MainPractice6
{
    static Scanner Read = new Scanner(System.in);

    public static void main(String[] args) {
        MovableRectangle mov = new MovableRectangle(12, 15);
        System.out.println(mov.getHeight());
        MovablePoints mp = new MovablePoints();
        mp.setPoints(12, 12);
        System.out.println();
        mp.speedCheck();
    }
}
