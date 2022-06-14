/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Memento;

import java.util.Stack;

/**
 *
 * @author nilux
 */
public class BookHistory {
    private Stack<CustomerInfo.BookMemento> BookHistory = new Stack();
    
    public void saveBook(CustomerInfo customer){
        BookHistory.push(customer.saveBook());
    }
    
    public void reverBook (CustomerInfo customer) {
        if(!BookHistory.isEmpty()) {
            customer.revertBook(BookHistory.pop());
        }else{
            System.out.println("Nothing left to Undo");
        }
    }
}

