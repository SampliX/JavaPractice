package HomeWorks.Practice17;

public class Statement
{
    String currentAccount;
    String accountNumber;
    String currency;
    String date;
    String transactionReference;
    String descriptionOperations;
    double revenue;
    double cost;

    public Statement(String line)
    {
        String[] a = line.split(",");
        for(int i = 0; i < a.length; i++)
        {
            System.out.println(a[i]);
        }
        this.currentAccount = a[0];
        this.accountNumber = a[1];
        this.currency = a[2];
        this.date = a[3];
        this.transactionReference = a[4];
        this.descriptionOperations = a[5];
        this.revenue = Double.parseDouble(a[6]);
        this.cost = Double.parseDouble(a[7]);
    }
    public void StatementWrite()
    {
        System.out.println(this.currentAccount + ", " + this.accountNumber + ", " + this.currency + ", " + this.date + ", " + this.transactionReference + ", " + this.descriptionOperations + ", " + this.revenue + ", " + this.cost);
    }
}