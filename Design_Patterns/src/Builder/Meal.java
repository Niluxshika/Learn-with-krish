/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Builder;

import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author nilux
 */
public class Meal {
    private List<Bill> item = new ArrayList<Bill>();	

   public void addItem(Bill bill){
      item.add(bill);
   }

   public float getCost(){
      float cost = 0.0f;
      
      for (Bill bill : item) {
         cost += bill.price();
      }		
      return cost;
   }

   public void showItems(){
   
    for (Bill bill : item) {
        System.out.print("Bill : " + bill.name());
        System.out.print(", Packing : " + bill.packing().pack());
        System.out.println(", Price : " + bill.price());
    }
       	
   }		
}
