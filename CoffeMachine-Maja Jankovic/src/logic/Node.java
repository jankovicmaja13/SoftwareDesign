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
public abstract class Node {

    protected int totalBanknotes;
    protected Node nextNode;
    
    public abstract void getCurrency(Currency currency, Map<String, Integer> map) throws CashOutOfStock;

    public void setNextNode(Node cvor) {
        nextNode = cvor;
    }

    public Node getNextNode() {
        return nextNode;
    }

    public int getNumberOfBanktnotes() {
        return totalBanknotes;
    }

    public void addBanknote(int ammountOfBanktnotes) {
        totalBanknotes = totalBanknotes + ammountOfBanktnotes;
    }

    

}
