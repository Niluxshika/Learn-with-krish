/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Prototype;

import java.util.List;


/**
 *
 * @author nilux
 */
public class ImplementClass {
    
    public static void main(String[] args){
        ClientDetails client = new ClientDetails();
        client.getclient();
        
        ClientDetails clientNew;
       
        try {
            clientNew = (ClientDetails) client.clone();
            ClientDetails clientNew1 = (ClientDetails) client.clone();
            List list = clientNew.getClientList();
            list.add(new client("Rathi","rathi@gmail.com"));
            List list1 = clientNew1.getClientList();
            list1.remove(new client("Chithra","chithra@gmail.com"));
            
            System.out.println("client List:"+ client.getClientList());
            System.out.println("clientNew List:"+ list);
            System.out.println("clientNwe1 List:"+ list1);
        } catch (CloneNotSupportedException e) {
            
            e.printStackTrace();
        }
            
        
    }
            
}
