/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package main;

import controller.Controller;
import form.MainForm;
import java.awt.Color;
import java.awt.Dimension;
import javax.swing.JFrame;
import model.Paper;
import process.PaperReviewProcess;

/**
 *
 * @author student1
 */
public class Main {

    public static void main(String[] args) {
//        PaperReviewProcess paperReviewProcess = new PaperReviewProcess();
//        paperReviewProcess.process();
        Paper paper = new Paper();
        MainForm forma= new MainForm();
        Controller controller = new Controller(paper, forma);
        controller.setVisible();
          
     
    }
}
