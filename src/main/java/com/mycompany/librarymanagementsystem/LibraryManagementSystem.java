/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.librarymanagementsystem;

/**
 *
 * @author yusan nimtharu
 */
public class LibraryManagementSystem {
    public static void main(String[] args) {
        System.out.println("Welcome to the Library Management System!");
        
        Library library = new Library();
        Book book1 = new Book("The Great Gatsby", "F. Scott Fitzgerald", "9780743273565");
        Book book2 = new Book("To Kill a Mockingbird", "Harper Lee", "9780060935467");

        library.addBook(book1);
        library.addBook(book2);

        System.out.println("Books in the Library:");
        library.listBooks();
    }
}


