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
public abstract class ContinentFactory {
    
    public abstract Herbivore getHerbivore();
    public abstract Carnivore getCarnivore();
    
}
