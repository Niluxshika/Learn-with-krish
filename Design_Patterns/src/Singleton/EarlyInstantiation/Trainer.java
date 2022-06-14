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
public class Trainer {
    private static volatile Trainer Fitness_Model = new Trainer();
    
    private Trainer() {
    
    }

    public static Trainer getFitness_Model() {
        return Fitness_Model;
    }
  
    
}
