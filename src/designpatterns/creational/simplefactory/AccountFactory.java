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
public class AccountFactory {
    
    private static AccountFactory accountFactory;
    
    public static AccountFactory getAccountFactory(){
        if(accountFactory == null){
            accountFactory = new AccountFactory();
        }
        return accountFactory;
    }
    
    public Account getAccount(int accountType){
        Account account = null;
        
        switch(accountType) {
            case 1:
                account = new SavingAccount();
                break;
            case 2:
                account = new CurrentAccount();
                break;
            case 3:
                account = new LoanAccount();
                break;
            default:
                throw new UnsupportedClassVersionError("Invalid Account Type");
        }
        
        return account;
    }
    
}
