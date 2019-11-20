/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package logic;

import domain.Currency;
import exception.CashOutOfStock;
import java.util.Map;

/**
 *
 * @author Maja Jankovic
 */
public class Node1 extends Node{

    @Override
    public void getCurrency(Currency currency, Map<String, Integer> map) throws CashOutOfStock {
        if (currency.getAmount() >= 1) {
            if (currency.getAmount() <= totalBanknotes) {
                map.put("1", currency.getAmount());
                totalBanknotes -= currency.getAmount();
            } 
            else {
                System.err.println(currency.getAmount() + "   " + totalBanknotes);
                map.put("1", totalBanknotes);
                totalBanknotes = 0;
                throw new CashOutOfStock("Not enough money! " + (currency.getAmount() - map.get("1")) + " cents is missing!");
            }
        } else {
            map.put("1", 0);
        }
    }

    @Override
    public String toString() {
        return "Node1: "+totalBanknotes;
    }
    
    
}
