/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package designpatterns.creational.factorymethod;

/**
 *
 * @author Shahadat
 */
public class Resume extends Document {

    @Override
    public void createPages() {
        getPages().add(new SkillsPage());
        getPages().add(new ResultsPage());
        getPages().add(new EducationPage());
        getPages().add(new ExperiencePage());
    }
    
}
