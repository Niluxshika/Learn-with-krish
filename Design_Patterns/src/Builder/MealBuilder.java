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
public class MealBuilder {
    public Meal prepareNonVegMeal (){
      Meal meal = new Meal();
      meal.addItem((Bill) new NonVeg());
      meal.addItem(new Stawberry());
      return meal;
   }   

   public Meal prepareVegMeal (){
      Meal meal = new Meal();
      meal.addItem(new Veg());
      meal.addItem(new Banana());
      return meal;
   }
}
