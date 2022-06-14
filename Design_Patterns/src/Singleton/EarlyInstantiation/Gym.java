/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Singleton.EarlyInstantiation;

/**
 *
 * @author nilux
 */
public class Gym {
    public static void main(String [] args) {
    
            Trainer Fitness_Model1 = Trainer.getFitness_Model();
            Trainer Fitness_Model2 = Trainer.getFitness_Model();
            
            System.out.println(Fitness_Model1);
            System.out.println(Fitness_Model1);
    }
           
}
