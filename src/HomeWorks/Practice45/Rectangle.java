package HomeWorks.Practice45;

public class Rectangle extends Shape
{
    double width;
    double height;

    @Override
    double calculateArea()
    {
        return width*height;
    }

    @Override
    public String toString() {
        return String.valueOf(calculateArea());
    }
}
