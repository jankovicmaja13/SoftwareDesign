/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package abstractFactory.impl;

import abstractFactory.AbstractFactory;
import component.fields.AbstractPanelInput;
import component.fields.PanelInputComboBox;
import component.fields.PanelInputComboBoxes;
import component.fields.PanelInputText;
import static abstractFactory.AbstractFactory.lbLASTNAME;
import static abstractFactory.AbstractFactory.lbFIRSTNAME;

public class ConcreteFactory3 implements AbstractFactory {

    @Override
    public AbstractPanelInput createPanelInputFirstName() {
        return new PanelInputText(lbFIRSTNAME);
    }

    @Override
    public AbstractPanelInput createPanelInputLastName() {
        return new PanelInputText(lbLASTNAME);
    }

    @Override
    public AbstractPanelInput createPanelInputGender() {
        return new PanelInputComboBox(lbGENDER);
    }

    @Override
    public AbstractPanelInput createPanelInputDate() {
        return new PanelInputComboBoxes(lbDATE);
    }

    @Override
    public String toString() {
        return "Form-3";
    }
}
