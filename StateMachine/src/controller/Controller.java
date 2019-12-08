/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package controller;

import form.MainForm;
import graphics.Drawer;
import java.awt.Color;
import javax.swing.JFrame;
import model.Paper;

/**
 *
 * @author maja
 */
public class Controller {
    private Paper paper;
    private MainForm form;
    private Drawer drawer;
  

    public Controller(Paper paper, MainForm form) {
        this.paper = paper;
        this.form = form;
        drawer = new Drawer(this);
        drawer.drawAllStates();
    }

   
    public void setVisible() {
        form.setSize(1500,1000);
        form.getContentPane().setBackground(Color.white);
        form.setLocationRelativeTo(null);
        form.setVisible(true);
    }

    public Paper getPaper() {
        return paper;
    }

    public MainForm getForm() {
        return form;
    }

    public Drawer getDrawer() {
        return drawer;
    }

}
