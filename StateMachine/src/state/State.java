/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package state;

import controller.Controller;
import form.ChangeStateForm;
import graphics.Circle;
import java.awt.Component;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.List;
import javax.swing.JComboBox;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import model.Paper;

/**
 *
 * @author student1
 */
public abstract class State {

    private final ChangeStateForm forma = new ChangeStateForm(null, true);

    public void doSomething(Paper paper) {
        printCurrentState();
        showOptions(paper);
    }

    private void printCurrentState() {
        System.out.println("====================================================");
        System.out.println("State: " + this);
        System.out.println("====================================================");
    }

    protected abstract void showOptions(Paper paper);

    protected abstract List<State> possibleStates();

    public void doSomething(Controller controller) {
        setCurrentState();
        fillCMB();
        setListener(controller);
        providePossibleStates(controller);

    }

    private void fillCMB() {
        JComboBox<Object> cmb = forma.getCmbPossibleStates();
        cmb.removeAllItems();
        for (State possibleState : possibleStates()) {
            cmb.addItem(possibleState);
        }

    }

    private void setCurrentState() {
        forma.getLbCurrentState().setText(this.toString());
    }

    private void setListener(Controller controller) {
        forma.getBtnSubmit().addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                State choosed = (State) forma.getCmbPossibleStates().getSelectedItem();
                controller.getPaper().goToState(choosed);
     
                for (Component component : controller.getForm().getContentPane().getComponents()) {
                    if (component instanceof Circle) {
                        controller.getDrawer().selectCircle((Circle) component);
                        System.out.println("controller.getDrawer().selectCircle((Circle) component);");
                    }
                }
                System.out.println("Gasim formu za change state");
                forma.setVisible(false);
            }
        });
    }

    private void providePossibleStates(Controller controller) {
        if (this.toString().equals(controller.getPaper().getCurrentState().toString())) {
            if (possibleStates().size() > 0) {
                forma.setLocationRelativeTo(null);
                forma.setVisible(true);
            } else {
                JOptionPane.showMessageDialog(controller.getForm(), "This is the final state.", "Change state", JOptionPane.INFORMATION_MESSAGE);
            }
        } else {
            JOptionPane.showMessageDialog(controller.getForm(), "This is not a current state.", "Change state", JOptionPane.INFORMATION_MESSAGE);
        }
    }

}
