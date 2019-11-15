/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package abstractFactory.impl;

import abstractFactory.AbstractFactory;
import component.fields.AbstractPanelInput;
import component.fields.PanelInputTextFields;
import component.fields.PanelInputRadioButton;
import component.fields.PanelInputText;

public class ConcreteFactory2 implements AbstractFactory {

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
