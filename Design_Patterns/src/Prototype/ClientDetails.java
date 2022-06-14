/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Prototype;

import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author nilux
 */
public class ClientDetails implements Cloneable{
    private ArrayList clientList;
    
    public ClientDetails(){
        this.clientList= new ArrayList<>();
    }
    
    public ClientDetails(ArrayList client){
        this.clientList = client;
    }
    public void getclient() {
        ClientService s = new ClientService();
        this.clientList = s.getClient();
    }
    public ArrayList getClientList() {
        return clientList;
    }
     @Override
     public Object clone() throws CloneNotSupportedException {
        List tem = new ArrayList();
        for(Object s: this.getClientList()){
            tem.add(s);
        }
        return new ClientDetails((ArrayList) tem);
    
    }  

    
}
