/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package main;

import ui.FMain;

/**
 *
 * @author Maja Janković
 */
public class Main {
         public static void main(String[] args) {
                FMain f = new FMain();
                f.createComponents();
                f.setListeners();
                f.setVisible(true);
    }

}
