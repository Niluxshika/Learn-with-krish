/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Memento;

import java.util.ArrayList;
/**
 *
 * @author nilux
 */
public class CustomerInfo {
    private ArrayList<Book> bookList = new ArrayList<>();
    
    public void addBook (Book book){
        bookList.add(book);
    }

    public ArrayList<Book> getBookList() {
        return (ArrayList)bookList.clone();
    }
    public BookMemento saveBook(){
        return new BookMemento (getBookList());
         }
    public void revertBook (BookMemento BookMemento){
        bookList = BookMemento.getbookList();
    }

    @Override
    public String toString() {
        return "Customer{" +
               "BookList=" + bookList +
                '}';
    }
    
    static class BookMemento{
    
        ArrayList<Book> bookList;
        
        public BookMemento(ArrayList<Book> customer){
            this.bookList = customer;
        }
        private ArrayList<Book> getbookList(){
            return bookList;
        }
    }
}
