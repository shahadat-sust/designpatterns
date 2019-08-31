/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package designpatterns.behavioral.templatemethod;

/**
 *
 * @author Shahadat
 */
public class GlassHouse extends HouseTemplete {
    
    @Override
    public void buildPillars() {
        System.out.println("Build pillars with glass.");
    }

    @Override
    public void buildWalls() {
        System.out.println("Build walls with glass.");
    }
    
    public void buildDoors(){
        System.out.println("Build doors with iron");
    }
    
}
