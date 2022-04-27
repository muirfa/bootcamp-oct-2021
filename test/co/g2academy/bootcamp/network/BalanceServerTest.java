/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package co.g2academy.bootcamp.network;

import java.util.Date;
import java.util.List;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author Asus
 */
public class BalanceServerTest {
    
    private BalanceServer server = new BalanceServer();

    @Test
    public void testTopUp() {
        TopUpBalance topup = new TopUpBalance();
        topup.setPhoneNumber("0811111111");
        topup.setDate(new Date());
        topup.setAmount(10_000);
        
        server.topUp(topup);
        
        assertEquals(1, server.getBalances().size());
        assertEquals(1, server.getTopups().size());
    }
    
    @Test
    public void textTopUp_2_time_topup(){
        TopUpBalance first = new TopUpBalance();
        first.setPhoneNumber("081111111");
        first.setDate(new Date());
        first.setAmount(10_000);
        
        server.topUp(first);
        
        TopUpBalance second = new TopUpBalance();
        second.setPhoneNumber("081111111");
        second.setDate(new Date());
        second.setAmount(20_000);
        
        server.topUp(second);
        
        Balance result = server.getBalances().get("081111111");
        Integer expected = 30000;
        assertEquals(expected, result.getBalance());
        List<TopUpBalance> topupHistory = server.getTopups().get("081111111");
        assertEquals(2, topupHistory.size());
    }
    
    @Test
    public void testParseMessageFromClient(){
        String message = "topup 081111111 30000";
        TopUpBalance topup = server.parseMessageFromClient(message);
        assertEquals("081111111", topup.getPhoneNumber());
        Integer expected = 30_000;
        assertEquals(expected, topup.getAmount());
    }
    
    
    
}
