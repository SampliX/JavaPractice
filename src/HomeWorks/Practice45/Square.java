package HomeWorks.Practice45;

public class Square extends Shape
{
    double a;
    @Override
    double calculateArea() {
        return a*a;
    }

    @Override
    public String toString() {
        return String.valueOf(calculateArea());
    }
}
