/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package designpatterns.creational.factorymethod;

import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author Shahadat
 */
public abstract class Document {
    
    private List<Page> pages;
    
    public Document() {
        this.pages = new ArrayList<Page>();
        this.createPages();
    }
    
    public List<Page> getPages(){
        return pages;
    }
    
    public abstract void createPages(); 
    
}
