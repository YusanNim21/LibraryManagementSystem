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
        
        Book book1 = new Book("The Great Gatsby", "F. Scott Fitzgerald", "9780743273565");
        book1.displayInfo();
    }
}

