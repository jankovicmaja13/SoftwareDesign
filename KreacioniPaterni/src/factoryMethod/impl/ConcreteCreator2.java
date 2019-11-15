/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package factoryMethod.impl;

import component.fields.AbstractPanelInput;
import component.fields.PanelInputTextFields;
import component.fields.PanelInputRadioButton;
import component.fields.PanelInputText;
import factoryMethod.Creator;
import static abstractFactory.AbstractFactory.lbLASTNAME;
import static abstractFactory.AbstractFactory.lbFIRSTNAME;
import static abstractFactory.AbstractFactory.lbGENDER;
import static abstractFactory.AbstractFactory.lbDATE;

public class ConcreteCreator2 extends Creator {

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
        return new PanelInputRadioButton(lbGENDER);
    }

    @Override
    public AbstractPanelInput createPanelInputDate() {
        return new PanelInputTextFields(lbDATE);
    }

    @Override
    public String toString() {
        return "Form-2";
    }
}
