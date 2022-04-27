/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package co.g2academy.bootcamp.network;

import java.util.ArrayList;
import java.util.Date;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 *
 * @author Asus
 */
public class BalanceServer {
    private Map<String, Balance> balances = new HashMap<>();
    private Map<String, List<TopUpBalance>> topUps = new HashMap<>();
    
    public void topUp(TopUpBalance topup){
//        history topup
        List<TopUpBalance> topUpBalances = topUps.get(topup.getPhoneNumber());
        if (topUpBalances != null) {
            topUpBalances.add(topup);
        } else {
            topUpBalances = new ArrayList<>();
            topUpBalances.add(topup);
            topUps.put(topup.getPhoneNumber(), topUpBalances);
        }
//        adding balances
        Balance balance = balances.get(topup.getPhoneNumber());
        if(balance != null){
            Integer newBalance = balance.getBalance() + topup.getAmount();
            balance.setBalance(newBalance);
        } else {
            balance = new Balance();
            balance.setPhoneNumber(topup.getPhoneNumber());
            balance.setBalance(topup.getAmount());
            balances.put(topup.getPhoneNumber(), balance);
        }
    }
    
    public TopUpBalance parseMessageFromClient(String message){
//    topup 081111111 30000
        String[] data = message.split(" ");
        Integer amount = Integer.parseInt(data[2]);
        String phoneNumber = data[1];
        TopUpBalance topup = new TopUpBalance();
        topup.setAmount(amount);
        topup.setPhoneNumber(phoneNumber);
        topup.setDate(new Date());
        return topup;
    }
    
    public void printBalanceAndHistory(String phoneNumber){
        Balance balance = balances.get(phoneNumber);
        System.out.println("Balance: " + phoneNumber);
        List<TopUpBalance>histories = topUps.get(phoneNumber);
        for (TopUpBalance history : histories){
            System.out.println("Top up at " + history.getDate() + " for " + history.getAmount());
        }
    }
    
    public Map<String, Balance> getBalances(){
        return balances;
    }
    
    public Map<String, List<TopUpBalance>> getTopups(){
        return topUps;
    }
}
