package HomeWorks.Practice2;

import java.util.Scanner;

public class Work1
{
    Scanner read = new Scanner(System.in);
    Shape shape = new Shape();

    void ShapeTester()
    {
        System.out.print("Длина прямоугольника: ");
        System.out.println(shape.length);

        System.out.print("Ширина прямоугольника: ");
        System.out.println(shape.width);

        System.out.println("Периметр прямоугольника: ");
        System.out.println(shape.perimetr);

        System.out.println("Площадь прямоугольника: ");
        System.out.println(shape.area);
    }
}