/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package state;

import java.util.ArrayList;
import java.util.List;
import model.Paper;

/**
 *
 * @author student1
 */
public class RejectState extends State {

    public RejectState() {
    }

    @Override
    public String toString() {
        return "Reject state"; //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    protected void showOptions(Paper paper) {
        System.out.println("Final state: " + this);
    }

    @Override
    protected List<State> possibleStates() {
        return new ArrayList<>();
    }

}
