/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package model;

import java.util.ArrayList;
import java.util.List;
import state.AcceptedState;
import state.CancelState;
import state.RejectState;
import state.ReviewState;
import state.RewritingState;
import state.State;
import state.WritingState;

/**
 *
 * @author student1
 */
public class Paper {

    private State state;
    private List<State> allStates;

    public Paper() {
        state = new WritingState();
        allStates = new ArrayList<>();
        allStates.add(new WritingState());
        allStates.add(new AcceptedState());
        allStates.add(new CancelState());
        allStates.add(new ReviewState());
        allStates.add(new RejectState());
        //allStates.add(new RewritingState());    
    }

    public State getCurrentState() {
        return state;
    }

    public void doSomethingOnState() {
        state.doSomething(this);
    }

    public void goToState(State newState) {
        state = newState;
    }

    public List<State> getAllStates() {
        return allStates;
    }
    
    

}
