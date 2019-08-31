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
public class Lion extends Carnivore {

    @Override
    public void eat(Herbivore h) {
        System.out.println(this.getClass().getSimpleName() + " eats " + h.getClass().getSimpleName());
    }
    
}
