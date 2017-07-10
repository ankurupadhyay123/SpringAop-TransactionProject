package com.spring.demo;

import java.io.IOException;

/**
 * Created by ankur on 9/7/17.
 */
public class UserAccount {

    //Spring Transaction Question 1
    private String name;
    private Integer balance;

    public String getName() {
        return name;
    }

    public void setName(String name) throws IOException {
        if(name.isEmpty() || name == ""){
            throw new IOException("name can't be empty");
        }else {
            this.name = name;
        }
    }

    public Integer getBalance() {
        return balance;
    }

    public void setBalance(Integer balance) { this.balance = balance; }

    @Override
    public String toString() {
        return "UserAccount{" +
                "name='" + name + '\'' +
                ", balance=" + balance +
                '}';
    }

}
