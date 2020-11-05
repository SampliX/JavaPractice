package HomeWorks.Practice15;

import java.util.*;

public class Numbers
{
    static char[] letters = {'А','В','Е','К','М','Н','О','Р','С','Т','У','Х'};
    static ArrayList<String> numbers = new ArrayList<String>();
    static Scanner read = new Scanner(System.in);
    static String str;
    static String line;
    static int binarySearch;
    static boolean have = false;
    static long timeStart;
    static long timeStop;

    public static void main(String[] args)
    {
        generateNumbers();
        searchNumber();
    }

    static void generateNumbers()
    {
        for(int i = 0; i < letters.length;i++)
        {
            for(int j = 0; j < letters.length;j++)
            {
                for(int k = 0;k < letters.length;k++)
                {
                    for(int l = 1; l < 200;l++)
                    {
                        for(int numb = 0; numb < 10;numb++)
                        {
                            str = letters[i] + String.valueOf(numb) + String.valueOf(numb) + String.valueOf(numb) + letters[j] + letters[k];
                            str += l<10? ("0" + String.valueOf(l)) : (String.valueOf(l));
                            numbers.add(str);
                        }
                    }
                }
            }
        }

        System.out.println(numbers.size());
    }

    static void searchNumber()
    {
        HashSet<String> numbersHash = new HashSet<String>(numbers);
        TreeSet<String> numbersTree = new TreeSet<String>(numbers);

        System.out.println("Введите номер: ");
        line = read.nextLine();

        timeStart = System.nanoTime();
        have = numbers.contains(line);
        timeStop = System.nanoTime();

        str = have? ("Такой номер есть") : ("Такого номера нет");
        System.out.println("Поиск перебором: " + str + ", поиск занял: " + String.valueOf(timeStop - timeStart) + " нс");

        Collections.sort(numbers);
        timeStart = System.nanoTime();
        binarySearch = Collections.binarySearch(numbers,line);
        timeStop = System.nanoTime();

        str = binarySearch>=0? ("Такой номер есть") : ("Такого номера нет");
        System.out.println("Бинарный  поиск: " + str + ", поиск занял: " + String.valueOf(timeStop - timeStart) + " нс");

        timeStart = System.nanoTime();
        have = numbersHash.contains(line);
        timeStop = System.nanoTime();

        str = have? ("Такой номер есть") : ("Такого номера нет");
        System.out.println("Поиск в HashSet: " + str + ", поиск занял: " + String.valueOf(timeStop - timeStart) + " нс");

        timeStart = System.nanoTime();
        have = numbersTree.contains(line);
        timeStop = System.nanoTime();

        str = have? ("Такой номер есть") : ("Такого номера нет");
        System.out.println("Поиск в TreeSet: " + str + ", поиск занял: " + String.valueOf(timeStop - timeStart) + " нс");
    }
}
