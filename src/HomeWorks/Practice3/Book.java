package HomeWorks.Practice3;

public class Book
{
    public String author = "Jules Verne";
    public String NameBook = "Mysterious island";
    public String PublicationDate = "01.01.1874";

    public void setAuthor(String author1){author = author1;}
    public void setNameBook(String nameBook){NameBook = nameBook;}
    public void setPublicationDate(String publicationDate) { PublicationDate = publicationDate; }

    public String getAuthor(){return author;}
    public String getNameBook(){return NameBook;}
    public String getPublicationDate() {return PublicationDate; }
}
