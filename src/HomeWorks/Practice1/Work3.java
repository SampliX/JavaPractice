package HomeWorks.Practice1;

public class Work3
{
    public void harmonicSeries()
    {
        for(int n = 1; n <= 20; n+=2)
        {
            System.out.format("%f", 1.0/(n-1));
            System.out.println();
        }
    }
}
