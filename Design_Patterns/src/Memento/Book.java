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
public class Book {
    protected int count;
    protected BookState B;
    protected String state;
    
    public Book(int count,BookState B){
    this.count = count;
    this.B = B;
    
    BookGenerator();
    
    }

    @Override
    public String toString() {
        return "Book {" +
                ", book='" + state + '\''+
                '}';
    }
    
    public void BookGenerator(){
        if(count > 5 && B == BookState.EXCEED)
            state = "Return book";
        else if (count > 5 && B == BookState.IN_LIMIT)
            state = "exceed the limit";
        else if (count > 3 && B == BookState.EXCEED)
            state = "You are almost exceed the limit";
        else if (count > 3 && B == BookState.IN_LIMIT)
            state = "Keep Reading";
        else
            state = "Start your day with reading";
    }
    
}
