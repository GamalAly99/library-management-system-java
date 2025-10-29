package com.library.model;

public class Borrower {
    private int borrowerId;
    private String borrowerName;
    

    // public Borrower() {
    //     this.borrowerId = 223344;
    //     this.borrowerName = "x.gamal@gmail.com";
    // }
    public Borrower(int borrowerId, String borrowerName) {
        this.borrowerId = borrowerId;
        this.borrowerName = borrowerName;
    }

    public int getBorrowerId() {
        return borrowerId;
    }

    public void setBorrowerId(int borrowerId) {
        this.borrowerId = borrowerId;
    }

    public String getBorrowerName() {
        return borrowerName;
    }

    public void setBorrowerName(String borrowerName) {
        this.borrowerName = borrowerName;
    }



    @Override
    public String toString() {
        return "Borrower [borrowerId=" + borrowerId + ", borrowerName=" + borrowerName + "]";
    }

    
}
