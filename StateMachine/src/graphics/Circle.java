/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package graphics;

import java.awt.Color;
import java.awt.Font;
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.Rectangle;
import java.awt.Shape;
import java.awt.geom.Ellipse2D;
import javax.swing.JPanel;
import state.State;

/**
 *
 * @author maja
 */
public class Circle extends JPanel {

    boolean selected = false;

    public void setSelected(boolean selected) {
        this.selected = selected;
    }

    Shape circle = new Ellipse2D.Float(90.0f,5.0f,300.0f, 300.0f);
    String naziv = null;
    Font f1 = new Font("Arial", Font.BOLD, 25);
    Font f2 = new Font("Arial", Font.PLAIN, 22);

    public Circle(State state) {
        naziv = state.toString();
    }

    public String getNaziv() {
        return naziv;
    }

    @Override
    public void paint(Graphics g) {
        Graphics2D ga = (Graphics2D) g;
        
        ga.clearRect(0, 0, 500, 500);
        ga.draw(circle);
        if (selected) {
            ga.setFont(f1);
            ga.setColor(Color.YELLOW);
        } else {
            ga.setFont(f2);
            ga.setColor(Color.RED);
        }
        
        ga.drawChars(naziv.toCharArray(), 0, naziv.length(), 160, 150);
    }

    public void mark() {
        selected = true;        
        repaint();
    }

    public void unmark() {
        selected = false;
        repaint();
    }

}
