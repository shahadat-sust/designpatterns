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
public class LoanAccount implements Account {

    private String accountName;
    private float amount;
    
    public LoanAccount(){

    }

    @Override
    public void setAccountName(String accountName) {
        this.accountName = accountName;
    }

    @Override
    public String getAccountName() {
        return accountName;
    }

    @Override
    public void deposit(float amount) {
        this.amount += amount;
    }

    @Override
    public float withdraw(float amount) {
        this.amount -= amount;
        return this.amount;
    }
    
    @Override
    public String getStatement() {
        return "Loan Account:: Account Name = " + this.accountName + ", Amount = " + this.amount;
    }
    
}
