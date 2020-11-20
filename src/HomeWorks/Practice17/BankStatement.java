package HomeWorks.Practice17;

import java.io.*;
import java.nio.channels.ScatteringByteChannel;
import java.util.ArrayList;

public class BankStatement
{
    public static void main(String[] args) throws FileNotFoundException, IOException
    {
        int it = 2;
        String line = " ";

        try
        {
            ArrayList<Statement> statementList = new ArrayList<Statement>();
            File file = new File("Data\\movementList.csv");
            FileReader fileReader = new FileReader(file);
            BufferedReader bufferedReader = new BufferedReader(fileReader);

            line = bufferedReader.readLine();
            do {
                line = bufferedReader.readLine();
                statementList.add(new Statement(line));
                it++;
            } while(line != null);

            System.out.println(statementList.get(8));
        }
        catch (Exception ex)
        {
            System.out.println(ex);
            System.out.println(it);
        }
    }
}
