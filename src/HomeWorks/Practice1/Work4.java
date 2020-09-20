package HomeWorks.Practice1;

import java.util.Random;

public class Work4
{
    public void FillArray()
    {
        int[] RandomArr = new int[15];
        int[] MathRandomArr = new int[15];
        Random rnd = new Random();

        System.out.println("Массив сгенерированный классом Random():");
        for(int i = 0; i < 15; i++)
        {
            RandomArr[i] = rnd.nextInt(100);
            System.out.print(RandomArr[i] + ", ");
        }
        System.out.println();

        System.out.println("Массив сгенерированный методом random() класса Math:");
        for (int i = 0; i < 15; i++)
        {
            MathRandomArr[i] += (int) (Math.random()*100);
            System.out.print(MathRandomArr[i] + ", ");
        }
        System.out.println();

        RandomArr = SortArray(RandomArr);
        MathRandomArr = SortArray(MathRandomArr);

        System.out.println("Отсортированный массив сгенерированный классом Random():");
        for(int i = 0; i < RandomArr.length; i++)
            System.out.print(RandomArr[i] + ", ");
        System.out.println();

        System.out.println("Отсортированный массив сгенерированный методом random() класса Math:");
        for(int i = 0; i < MathRandomArr.length; i++)
            System.out.print(MathRandomArr[i] + ", ");
        System.out.println();
    }

    int[] SortArray(int[] arr)
    {
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr.length - 1; j++) {
                if (arr[j] > arr[j + 1]) {
                    int a = arr[j];
                    arr[j] = arr[j + 1];
                    arr[j + 1] = a;
                }
            }
        }
        return arr;
    }
}
