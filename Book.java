package OOP_Projects.Fetching_DataToFile;

public abstract class Book implements Comparable<Book>, info 
{
  private String title;
  private String author;
  private String ISBN;

  public Book() 
  {

  }

  public Book(String title, String author, String iSBN) 
  {
    this.title = title;
    this.author = author;
    ISBN = iSBN;
  }

  public String getTitle() 
  {
    return title;
  }

  public void setTitle(String title)
  {
    this.title = title;
  }

  public String getAuthor() 
  {
    return author;
  }

  public void setAuthor(String author) 
  {
    this.author = author;
  }

  public String getISBN() 
  {
    return ISBN;
  }

  public void setISBN(String iSBN) 
  {
    ISBN = iSBN;
  }


  @Override
  public int compareTo(Book compare) 
  {  
    return this.author.compareToIgnoreCase(compare.author);
  }

  @Override
  public abstract void display();  
  
}
