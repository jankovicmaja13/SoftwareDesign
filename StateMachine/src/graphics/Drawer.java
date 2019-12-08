/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package graphics;

import controller.Controller;
import form.MainForm;
import java.awt.GridLayout;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.util.List;
import javax.swing.JPanel;
import state.State;

/**
 *
 * @author maja
 */
public class Drawer {

    private Controller controller;

    public Drawer(Controller controller) {
        this.controller = controller;
        setUpForm();
    }

    public void selectCircle(Circle circle) {
        if (circle.getNaziv().equals(controller.getPaper().getCurrentState().toString())) {
            circle.mark();
        } else {
            circle.unmark();
        }
    }

    public void drawAllStates() {
        List<State> allStates = controller.getPaper().getAllStates();
        for (int i = 0; i < allStates.size(); i++) {
            createCircle(allStates.get(i));
        }
    }

    public void createCircle(State state) {
        JPanel panel = new Circle(state);
        selectCircle((Circle) panel);
        setListener(panel, state);
        controller.getForm().add(panel);
        controller.getForm().getPanels().add(panel);

    }

    private void setUpForm() {
        MainForm form = controller.getForm();

        int numberOfRows = 0;
        GridLayout grid = (GridLayout) form.getContentPane().getLayout();
        if (controller.getPaper().getAllStates().size() >= 6) {
            numberOfRows = (int) Math.round((double) controller.getPaper().getAllStates().size() / 3);
            grid.setColumns(3);
        } else {
            numberOfRows = (int) Math.round((double) controller.getPaper().getAllStates().size() / 2);
            grid.setColumns(2);
        }

        grid.setRows(numberOfRows);
    }

    private void setListener(JPanel panel, State state) {
        panel.addMouseListener(new MouseAdapter() {
            @Override
            public void mouseClicked(MouseEvent e) {
                state.doSomething(controller);
            }

        });
    }

}
