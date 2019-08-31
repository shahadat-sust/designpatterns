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
public class AnimalFactory {
    
    private static AnimalFactory animalFactory;
    public static  AnimalFactory getInstance(){
        if(animalFactory == null) {
            animalFactory = new AnimalFactory();
        }
        return animalFactory;
    } 
    
    public ContinentFactory getFactory(String type) {
        ContinentFactory factory = null;
        switch(type) {
            case "ASIA":
                factory = new AsianAnimal();
                break;
            case "AFRICA":
                factory = new AfricanAnimal();
                break;
            case "AMERICA" :
                factory = new AmericanAnimal();
                break;
            default:
                break;
        }
        return factory;
    }
    
}
