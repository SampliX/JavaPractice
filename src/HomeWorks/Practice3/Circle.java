package HomeWorks.Practice3;

import java.util.Scanner;

public class Circle
{
    double radius;
    Scanner Read = new Scanner(System.in);

    public void choiseRadious()
    {
        System.out.println("Введите радиус: ");
        radius = Read.nextDouble();
        
        System.out.format(toString(), radius, 2.0*3.1415*radius, 2.0*radius, 2.0*3.1415*radius*radius);
    }

    @Override
    public String toString (){
        return "Радиус: %.3f \nДлина окружности: %.3f \nДиаметр окружности: %.3f \nПлощадь окружности: %.3f %n";
    }
}
