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
public abstract class HouseTemplete {
    
    public final void buildHouse(){
        System.out.println("Build house started.");
        buildFoundation();
        buildPillars();
        buildWalls();
        buildWindows();
        buildDoors();
        System.out.println("Build house completed.");
    }
    
    private void buildFoundation(){
        System.out.println("Build foundation with cement, iron, rod and sand.");
    }
    
    public abstract void buildPillars();
    
    public abstract void buildWalls();
    
    public void buildWindows(){
        System.out.println("Build windows with glass.");
    }
    
    public void buildDoors(){
        System.out.println("Build doors with wood.");
    }
    
}
