/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Memento;

/**
 *
 * @author nilux
 */
public class LibraryApp {
        public static void main(String[] args){
            
        BookHistory bookHistory = new BookHistory();
        CustomerInfo customer1 = new CustomerInfo();
        

        customer1.addBook(new Book(4,BookState.EXCEED));
        customer1.addBook(new Book(6,BookState.EXCEED));
        
        bookHistory.saveBook(customer1);
        System.out.println(customer1);
        
        customer1.addBook(new Book(6,BookState.IN_LIMIT));
        
        bookHistory.saveBook(customer1);
        System.out.println(customer1);
        
         customer1.addBook(new Book(4,BookState.IN_LIMIT));
        
        bookHistory.saveBook(customer1);
        System.out.println(customer1);
        
        customer1.addBook(new Book(2,BookState.EXCEED));
        bookHistory.saveBook(customer1);
        System.out.println(customer1);
        }
}
