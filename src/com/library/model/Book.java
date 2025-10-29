package com.library.model;

public class Book {
    private int bookId;
    private  String bookName;
    private String author;
    private int year;
    private boolean available;
    private Borrower borrowedBy;

    // public Book(){
    //     bookName="Default Name";
    //      bookId=0000;
    //      author="Default Author";
    //      year=0000;
    //      available=false;
    //      borrowedBy=null;
    // }

public Book(int bookId,String bookName,String author,int year,boolean available){
        this.bookName=bookName;
        this.bookId= bookId;
        this.author=author;
        this.year=year;
        this.available= available;
        this.borrowedBy=null;
    }
    

public int getBookId() {
    return bookId;
}

public void setBookId(int bookId) {
    this.bookId = bookId;
}

public String getBookName() {
    return bookName;
}

public void setBookName(String bookName) {
    this.bookName = bookName;
}

public String getAuthor() {
    return author;
}

public void setAuthor(String author) {
    this.author = author;
}

public int getYear() {
    return year;
}

public void setYear(int year) {
    this.year = year;
}


public boolean isAvailable() {
    return available;
}

public void setAvailable(boolean available) {
    this.available = available;
}

public Borrower getBorrowedBy() {
    return borrowedBy;
}

public void setBorrowedBy(Borrower borrowedBy) {
    this.borrowedBy = borrowedBy;
}
 
@Override
public String toString( ) {
    String status= isAvailable()? " Available ": " Borrowed By "+ borrowedBy.getBorrowerName ();
// String status;
// if(available)
// {
//     status=" Available ";
// }
// else{
//     status= (borrowedBy!=null)?"Borrowed By"+ borrowedBy.getBorrowerName()  : "Borrowd By Unknoun Borrower";
// }

    return "Book [Book Id = " + bookId + " , Book Name = " + bookName + " , Author = " + author + "  , Year = " + year
            +"  Status" + status + " ]\n";
}




}
