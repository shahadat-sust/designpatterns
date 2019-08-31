/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package designpatterns.creational.abstractfactory;

/**
 *
 * @author Shahadat
 */
public class AbstractFactoryDemo {
    
    public static void main(String[] args) {
        ContinentFactory asianAnimal  = AnimalFactory.getInstance().getFactory("ASIA");
        ContinentFactory africanAnimal  = AnimalFactory.getInstance().getFactory("AFRICA");
        ContinentFactory americanAnimal  = AnimalFactory.getInstance().getFactory("AMERICA");
        
        AnimalWorld animalWorld = new AnimalWorld();
        animalWorld.runFoodChain(asianAnimal);
        animalWorld.runFoodChain(africanAnimal);
        animalWorld.runFoodChain(americanAnimal);
    }
    
}
