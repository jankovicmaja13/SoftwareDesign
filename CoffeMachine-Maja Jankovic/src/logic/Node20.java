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
public class Node20 extends Node{
    @Override
    public void getCurrency(Currency currency, Map<String, Integer> map) throws CashOutOfStock {
        if (currency.getAmount() >= 20) {
            int first = currency.getAmount() / 20;
            int second = currency.getAmount() % 20;
            if (first < totalBanknotes) {
                map.put("20", first);
                totalBanknotes -= first;
            } 
            else {
                map.put("20", totalBanknotes);
                second += (first - totalBanknotes) * 20;
                totalBanknotes = 0;
            }
            if (second != 0 && nextNode != null) {
                nextNode.getCurrency(new Currency(second), map);
            }
        } 
        else {
            map.put("20", 0);
            if (nextNode != null) {
                nextNode.getCurrency(currency, map);
            }
        }
    }
    public String toString() {
        return "Node20: "+totalBanknotes;
    }
}
