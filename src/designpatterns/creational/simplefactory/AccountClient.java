/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package designpatterns.creational.simplefactory;

/**
 *
 * @author Shahadat
 */
public class AccountClient {
    
    public static void main(String[] args) {
        Account savingAccount  = AccountFactory.getAccountFactory().getAccount(1);
        savingAccount.setAccountName("Abdul Karim");
        savingAccount.deposit(100);
        
        Account currentAccount  = AccountFactory.getAccountFactory().getAccount(2);
        currentAccount.setAccountName("Faisal Ahmed");
        currentAccount.deposit(30);
        
        Account loanAccount  = AccountFactory.getAccountFactory().getAccount(3);
        loanAccount.setAccountName("Rahim");
        loanAccount.deposit(200);
        
        System.out.println(savingAccount.getStatement());
        System.out.println(currentAccount.getStatement());
        System.out.println(loanAccount.getStatement());
    }
    
}
