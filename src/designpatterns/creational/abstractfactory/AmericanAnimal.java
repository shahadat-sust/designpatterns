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
public class AmericanAnimal extends ContinentFactory {

    @Override
    public Herbivore getHerbivore() {
        return new Bison();
    }

    @Override
    public Carnivore getCarnivore() {
        return new Wolf();
    }
    
}
