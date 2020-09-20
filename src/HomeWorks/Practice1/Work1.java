package HomeWorks.Practice1;

public class Work1
{
    int summ = 0;
    int i = 0;
    public void StartVoids()
    {
        int[] array = new int[] {2, 6, 4, 7, 9, 2, 6}; //36
        CycleFor(array);
        CycleWhile(array);
        CycleDoWhile(array);
    }
    void CycleFor(int[] arr)
    {
        for(i = 0; i < arr.length; i++)
            summ += arr[i];

        System.out.println(summ + " - результат работы цикла for");
    }
    void CycleWhile(int[] arr)
    {
        i = 0;
        summ = 0;
        while(i < arr.length)
        {
            summ += arr[i];
            i++;
        }
        System.out.println(summ + " - результат работы цикла while");
    }
    void CycleDoWhile(int[] arr)
    {
        i = 0;
        summ = 0;
        do {
            summ += arr[i];
            i++;
        }
        while(i < arr.length);
        System.out.println(summ + " - результат работы цикла DoWhile");
    }
}
