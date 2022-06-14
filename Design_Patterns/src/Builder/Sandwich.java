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
public abstract class Sandwich implements Bill {
    @Override
   public Packing packing() {
      return new Wrapper();
   }

   @Override
   public abstract float price();
}
