package com.library.main;
import com.library.model.Book;
import com.library.model.Borrower;
import com.library.service.Library;



import java.util.Scanner;
public class App {
    public static void main(String[] args) throws Exception {
        System.out.println("==============================================================");
        System.out.println("Welcome to Alex Libarary :> ");
        System.out.println("==============================================================\n");

        Library Alex=new Library();
        

        Book book1 =new Book(1,"Ared Zikola","Amr Abdelhamed",2018,true);
        Book book2 =new Book(2,"qulub mughlaqa","Dina Emad",2015,true);
        Book book3 =new Book(3,"Ahbabt Waghadan","Emad Rashad Osman",2008,true);
        Book book4 =new Book(4,"fan El La Moballah","Mark Manson",2007,true);
        Book book5 =new Book(5,"the power of now","Eckhart tolle",2001,true);
        Book book6 =new Book(6,"closed hearts    ","Dina Emad",2015,true);

Alex.addBook(book1);
Alex.addBook(book2); 
Alex.addBook(book3);
Alex.addBook(book4);
Alex.addBook(book5);
Alex.addBook(book6);

Scanner sc =new Scanner(System.in);
int choise;
do{
System.out.println("\n============ MENU ============== :> ");
System.out.println("1. list Books of Libarary ");
System.out.println("2. Search By Author");
System.out.println("3. Search By Book Id");
System.out.println("4. Search By Book Name");
System.out.println("5. Borrowe a Book");
System.out.println("6. Return a Book");
System.out.println("0. Exit..");
System.out.println("Choose any number You Want...");

choise=sc.nextInt();
sc.nextLine();
switch (choise) {
   case  1 -> 
   Alex.listBooks();
   case 2 ->
   {
    
    System.out.println("Plz, Enter Author Name.");
String author=sc.nextLine();
Alex.searchAuthor(author);
   }
   case 3->
   {
    int id;
    System.out.println("plz, Enter Book Id.");
    id=sc.nextInt();
    sc.nextLine();
    Alex.searchBookId(id);

   }

   case 4->
   {
    String bookName;
    System.out.println("P lz, Enter Book Name.");
bookName=sc.nextLine();
Alex.searchBookName(bookName);
   }

   case 5->
   {
    System.out.println("plz, Enter Book Id to Borrow: ");
    int id=sc.nextInt();
    sc.nextLine();

   
    System.out.println("Plz, Enter borrower Name.");
String borrowerName=sc.nextLine();

Borrower borrower=new Borrower(id*100, borrowerName);
Alex.borroweBook(id, borrower);
   }

case 6->
{
    int id;
    System.out.println("plz, Enter Book Id.");
    id=sc.nextInt();
    sc.nextLine();
    Alex.returnBook(id);
}
case 0 ->
System.out.println("Exiting....Bye!");
default ->
   System.out.println("plz , Enter Valid Choise!"); 

}

}
while(choise !=0);

sc.close();





// //....
// Alex.listBooks();
// System.out.println(" Test 3 Methods for Searching.");
// Alex.searchBookId(1);
// Alex.searchBookName("The Power Of now");
// Alex.searchAuthor("Dina Emad");

// Borrower b1=new Borrower(1111,"Doaa");
// Borrower b2=new Borrower(2222,"shahed"); 

// Alex.borroweBook(1, b1);
// Alex.borroweBook(1, b2);

// Alex.returnBook(1);
// Alex.returnBook(1);


    }
}