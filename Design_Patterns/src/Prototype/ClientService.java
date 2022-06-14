/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Prototype;

import java.util.ArrayList;

/**
 *
 * @author nilux
 */
public class ClientService {
    ArrayList client;

   
    public ClientService(){
        client = new ArrayList();
        client.add(new client("Nila,nila@gmail.com"));
        client.add(new client("Sam,sam@gmail.com"));
        client.add(new client("Nizar,nizar@gmail.com"));
        client.add(new client("Ram,ram@gmail.com"));
    }
     public ArrayList getClient() {
        return client;
    }
    
    
}
