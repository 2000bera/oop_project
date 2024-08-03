package OOP_Projects.Fetching_DataToFile;

public class PrintBook extends Book 
{
  private int pages;
  private double weight;

  public PrintBook() 
  {

  }

  public PrintBook(String title, String author, String iSBN, int pages, double weight) 
  {
    super(title, author, iSBN);
    this.pages = pages;
    this.weight = weight;
  }

  public int getPages() 
  {
    return pages;
  }

  public void setPages(int pages) 
  {
    this.pages = pages;
  }

  public double getWeight() 
  {
    return weight;
  }

  public void setWeight(double weight) 
  {
    this.weight = weight;
  }

  @Override
  public void display() 
  {
    System.out.println("Title: " + getTitle());
    System.out.println("Author: " + getAuthor());
    System.out.println("ISBN: " + getISBN());
    System.out.println("Pages: " + pages);
    System.out.println("Weight: " + weight + "kg");
  }

}
