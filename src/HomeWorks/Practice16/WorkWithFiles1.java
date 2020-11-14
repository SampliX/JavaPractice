package HomeWorks.Practice16;

import java.io.*;
import java.util.Scanner;

public class WorkWithFiles1
{
    public static void copyFiles(File oldFolder, File newFolder) throws IOException
    {
        if(oldFolder.isFile())
        {
            InputStream inputStream = null;
            OutputStream outputStream = null;

            try
            {
                inputStream = new FileInputStream(oldFolder);
                outputStream = new FileOutputStream(newFolder);

                byte[] buffer = new byte[1024];
                int length;

                while ((length = inputStream.read(buffer)) > 0)
                    outputStream.write(buffer, 0, length);
            }
            finally
            {
                inputStream.close();
                outputStream.close();
            }
        }
        else if(oldFolder.isDirectory())
        {
            if(!newFolder.exists())
                newFolder.mkdirs();

            String[] tree = oldFolder.list();
            for (int i=0; i< tree.length; i++)
                copyFiles(new File(oldFolder, tree[i]), new File(newFolder, tree[i]));
        }
        else
        {
            if(!oldFolder.exists())
            {
                System.out.println("Начальная директория не существует");
            }
        }
    }

    public static void main(String[] args) throws IOException
    {
        Scanner read = new Scanner(System.in);

        System.out.println("Введите начальную директорию");
        String oldFolder = read.nextLine();

        System.out.println("Введите конечную директорию");
        String newFolder = read.nextLine();

        copyFiles(new File(oldFolder),new File(newFolder));
    }
}
