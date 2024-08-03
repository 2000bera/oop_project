package OOP_Projects.Fetching_DataToFile;

public class EBook extends Book 
{
  private int size;

  public EBook(int size) 
  {
    this.size = size;
  }

  public EBook(String title, String author, String iSBN, int size) 
  {
    super(title, author, iSBN);
    this.size = size;
  }

  public int getSize() 
  {
    return size;
  }

  public void setSize(int size) 
  {
    this.size = size;
  }

  @Override
  public void display() 
  {
    System.out.println("EBooks Information");
    System.out.println("Title: " + getTitle());
    System.out.println("Author: " + getAuthor());
    System.out.println("ISBN: " + getISBN());
    System.out.println("Size: " + size);
  }

}
