/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Builder;

/**
 *
 * @author nilux
 */
public class Banana extends Smoothies{
     @Override
   public float price() {
      return 140.0f;
   }

   @Override
   public String name() {
      return "Banana Smoothie";
   }
}
