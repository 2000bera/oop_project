package OOP_Projects.Fetching_DataToFile;

import java.util.Arrays;

public class TestProgram 
{
  public static void main(String[] args) 
  {
    Book[] books = new Book[6];

    String title;
    String author;
    String ISBN;
    int pages;
    int size;
    double weight;

    books[0] = new EBook("The C++ Programming Language", "Bjarne Stroustrup", "1321563841", 203178);
    books[1] = new EBook("The Grapes of Wrath", "John Steinbeck ", "167001617X", 9590);
    books[2] = new EBook("To Kill A Mockingbird", "Harper Lee", "1162420715", 3503);
    books[3] = new PrintBook("The C++ Programming Language", "Bjarne Stroustrup", "0321563840", 1365, 1.7);
    books[4] = new PrintBook("Head First Java", "Kathy Sierra", "0596009208", 688, 1.3);
    books[5] = new PrintBook("Beginning Programming for Dummies", "Barry Burd0", "0018407803", 430, 0.64);

    Arrays.sort(books);

    for (Book book : books) {
     if(book != null) {
      book.display();
      System.out.println();
     }
    }
  }
  
}
