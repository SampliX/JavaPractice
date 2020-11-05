package HomeWorks.Practice15;

import java.util.ArrayList;
import java.util.Random;

public class Numbers
{
    static char[] letters = {'А','В','Е','К','М','Н','О','Р','С','Т','У','Х'};
    static ArrayList<String> numbers = new ArrayList<String>();
    static String str;
    static Random rnd = new Random();

    public static void main(String[] args)
    {
        generateNumbers();
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
}
