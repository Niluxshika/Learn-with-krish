/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Singleton.LazyInstantiation;

/**
 *
 * @author nilux
 */
public class Trainer {
    private static volatile Trainer Fitness_model = new Trainer();

    private Trainer(){}
    
    public static Trainer getFitness_model() {
        if(Fitness_model == null){
            synchronized(Trainer.class){
                if(Fitness_model ==null){
                    Fitness_model= new Trainer();
                }
            }
        }
        return Fitness_model;
    }
    
}
