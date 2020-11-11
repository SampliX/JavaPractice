package HomeWorks.Practice16;

import java.io.File;

public class WorkWithFiles
{
    public static void main(String[] args)
    {
        int it = 0;
        String line = "";
        File folder = new File("E:\\Steam");
        double result = getFolderSize(folder);

        while(result > 1024) {
            result /= 1024;
            it++;
        }

        if(it == 0)
            line = "байт";
        else if(it == 1)
            line = "Кб";
        else if(it == 2)
            line = "Мб";
        else if(it >= 3)
            line = "Гб";

        System.out.format("%.1f",result);
        System.out.println(" " + line);
    }

    public static double getFolderSize(File folder) {
        long size = 0;
        File[]files = folder.listFiles();

        int it = files.length;

        for (int i = 0; i < it; i++)
        {
            if (files[i].isFile())
                size += files[i].length();
            else
                size += getFolderSize(files[i]);
        }
        return size;
    }
}
