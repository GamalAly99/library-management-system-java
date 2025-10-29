package com.library.service;
import com.library.model.Book;

import com.library.model.Borrower;

import java.util.ArrayList;
import java.util.List;

public class Library {
   private List <Book>books=new ArrayList<>();

public void addBook(Book book)
            {

                books.add(book);
                System.out.println(" >> Book added Successfully: "+ book.getBookName());

            }

public void listBooks()
                        {
                                System.out.println("Books in Libarary: ");
                                if(books.isEmpty()){
                                    System.out.println("No Books in the Library yet. \n");
                                    return;
                                }     
                                
                        // رأس الجدول
                            System.out.printf("%-5s | %-25s | %-20s | %-6s | %-20s%n",
                                    "ID", "Book Name", "Author", "Year", "Status");
                            System.out.println("--------------------------------------------------------------------------");


                                    // عرض كل كتاب بشكل منسق
                            for (Book b : books) {
                                String status;
                                if (b.isAvailable()) {
                                    status = "Available";
                                } else  {
                                    status = "Borrowed by " + b.getBorrowedBy().getBorrowerName();
                                } 
                        
                                System.out.printf("%-5d | %-25s | %-20s | %-6d | %-20s%n",
                                        b.getBookId(), b.getBookName(), b.getAuthor(), b.getYear(), status);
                            }

                            System.out.println(); // سطر فارغ بعد الجدول
                        }

public void searchAuthor(String author)
                        {

                          //  boolean found=false;
                          List <Book> matched=new ArrayList<>();
                           System.out.println("\nSearch Results For Author "+ author);
                        for (Book b : books) 
                                {
                                    
                                    if(b.getAuthor().equalsIgnoreCase(author))
                                    {
                                    //if(!found)
                                    matched.add(b);
                                    // {
                                    //     System.out.println("Book(s) that founded: ");
                                    //     found=true;
                                    // }
                                        //System.out.println(b);
                                        
                                    }
                            
                                }
                       // if(!found){System.out.println("no Book Founded by author : "+ author);}
                       printBookTable(matched);

                        }


public void searchBookId(int bookId)
                        {
                            System.out.println("\nSearch Results For Book Id "+ bookId);
                            List<Book>matched=new ArrayList<>();
                            // System.out.println("Searching for Books");
                                for(Book b:books)
                                {
                                    if(b.getBookId()==bookId)
                                    {
                                    matched.add(b);
                                    
                                    }
                                
                                }



                        //         if(matched.isEmpty()){
                        // System.out.println("No book Found by id >> "+ bookId);
                        //         }
                        //         else{
                        // System.out.println("Found "+ matched.size() +" Book(s)"); 
                        //             for (Book bb : matched) {
                        //                 System.out.println(bb);
                        //             }   
                        //         }
                            printBookTable(matched);
                        }



public void searchBookName(String bookName){
               // boolean isFound=false;
               List <Book> matched =new ArrayList<>();

                System.out.println("\nSearch Results For Book name "+ bookName);
                for (Book b : books)
                {

                    if(b.getBookName().equalsIgnoreCase(bookName))
                        {
                           // System.out.println("Found book(s) its name is >>"+bookName + " and its info at next-Line:");
                           // System.out.println(b);
                           // isFound=true;
                           matched.add(b);
                        }
                }
                // if(matched.isEmpty())
                // System.out.println("No Book Found by that name >> " +bookName);
                //else
                    printBookTable(matched);
                

                }



public void printBookTable(List<Book>bookList)   
{
    if(bookList.isEmpty())
    {
System.out.println("No Books By that Info To Show .");
    }
    else{

        // رأس الجدول
         System.out.println("--------------------------------------------------------------------------");
         System.out.printf("%-5s | %-25s | %-20s | %-6s | %-20s%n",
        "ID", "Book Name", "Author", "Year", "Status");
        System.out.println("--------------------------------------------------------------------------");


        for (Book b : bookList) {
            
            String status= b.isAvailable()? " Available ": "Borrowed By "+ b.getBorrowedBy().getBorrowerName();
            
            System.out.printf("%-5d | %-25s | %-20s | %-6d | %-20s%n",
                                        b.getBookId(), b.getBookName(), b.getAuthor(), b.getYear(), status);
            }
       }
       System.out.println();
}            


public void borroweBook(int bookId ,Borrower borrower)
                    {
                        System.out.println("==============================================================");
                        for (Book b : books) 
                        {
                                        
                                if(b.getBookId()==bookId)
                                {
                                if(b.isAvailable())
                                {
                                    b.setAvailable(false);
                                    b.setBorrowedBy(borrower);
                                System.out.println(b.getBookName()+" Borrowed By "+ borrower.getBorrowerName());
                                }
                                else
                                {
                                
                                
                                    System.out.println("Book already Borrowed By "+ b.getBorrowedBy().getBorrowerName());
                                
                                    
                                }

                        System.out.println("==============================================================");

                                return;

                                }
                        }
                    System.out.println("No Book Found By "+ bookId);
                        System.out.println("==============================================================");

                    }


public void returnBook(int bookId)
{
                            System.out.println("==============================================================");

            for (Book b : books) 
                    {
                            if(b.getBookId()==bookId)
                                {
                                    if(!b.isAvailable())
                                     {

                                            b.setAvailable(true);
                                        b.setBorrowedBy(null);
                                        System.out.println("Successefully Book Return "+ b.getBookName());
                                     }
                                    else
                                     {
                                        
                                        System.out.println("This Book Was Not Borrowed.");
                                     }
                        System.out.println("==============================================================");
                                     return;
                                }
                    }
                
    System.out.println(" No Book Found By Id "+ bookId);
                                  System.out.println("==============================================================");
      
}



}
