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
public class Report extends Document {

    @Override
    public void createPages() {
        getPages().add(new IntroductionPage());
        getPages().add(new ConclusionPage());
        getPages().add(new SummaryPage());
        getPages().add(new BibliographyPage());
    }
    
}
