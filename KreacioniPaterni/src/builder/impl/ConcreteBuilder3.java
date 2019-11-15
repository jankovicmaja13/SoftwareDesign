/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package builder.impl;

import builder.Builder;
import component.fields.PanelInputComboBox;
import component.fields.PanelInputComboBoxes;
import component.fields.PanelInputText;
import static abstractFactory.AbstractFactory.lbLASTNAME;
import static abstractFactory.AbstractFactory.lbFIRSTNAME;
import static abstractFactory.AbstractFactory.lbGENDER;
import static abstractFactory.AbstractFactory.lbDATE;

public class ConcreteBuilder3 extends Builder {

    @Override
    public void createPanelInputFirstName() {
        inputFirstName = new PanelInputText(lbFIRSTNAME);
    }

    @Override
    public void createPanelInputLastName() {
        inputLastName = new PanelInputText(lbLASTNAME);
    }

    @Override
    public void createPanelInputGender() {
        inputGender = new PanelInputComboBox(lbGENDER);
    }

    @Override
    public void createPanelInputDate() {
        inputDate = new PanelInputComboBoxes(lbDATE);
    }

    @Override
    public String toString() {
        return "Form-3";
    }
}
