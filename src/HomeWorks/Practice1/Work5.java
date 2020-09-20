package HomeWorks.Practice1;

public class Work5
{
    public void Factorial(int a)
    {
        int Fact = 1;
        for(int i = 1; i <= a; i++)
            Fact *= i;

        System.out.println("Факториал числа " + a + ": " + Fact);
    }
}
