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
public class FactoryMethodDemo {

    public static void main(String[] args) {
        Document[] documents = new Document[2];
        documents[0] = new Resume();
        documents[1] = new Report();

        for (Document document : documents) {
            System.out.println("\n" + document.getClass().getSimpleName() + "--");
            for (Page page : document.getPages()) {
                System.out.println(" " + page.getClass().getSimpleName());
            }
        }
    }
}
