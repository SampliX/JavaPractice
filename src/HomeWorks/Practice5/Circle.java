package HomeWorks.Practice5;

public class Circle extends Shape
{
    double radius;
    @Override
    double calculateArea() {
        return radius*radius*3.1415*2;
    }
    public String toString() {
        return String.valueOf(calculateArea());
    }
}
