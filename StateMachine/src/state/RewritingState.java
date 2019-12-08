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
 * @author maja
 */
public class RewritingState extends State {

    @Override
    public String toString() {
        return "Rewriting state";
    }

    @Override
    protected void showOptions(Paper paper) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    protected List<State> possibleStates() {
        List<State> list = new ArrayList<>();

        list.add(new ReviewState());
        list.add(new CancelState());
        list.add(new RewritingState());

        return list;

    }

}
