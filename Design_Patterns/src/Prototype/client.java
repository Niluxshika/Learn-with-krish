/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Prototype;

/**
 *
 * @author nilux
 */
public class client {
    
     String name;
    String email;

    public client(String name, String email) {
        this.name = name;
        this.email = email;
    }

    client(String nilanilagmailcom) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }


    @Override
    public String toString() {
        return "Name of client:"+this.name+"Email of Client:"+this.email+"\n";
    }
    
   
    
}
