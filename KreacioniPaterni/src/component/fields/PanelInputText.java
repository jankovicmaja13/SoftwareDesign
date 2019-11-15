/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package component.fields;

import java.awt.Component;
import javax.swing.JTextField;


public class PanelInputText extends AbstractPanelInput {

    private JTextField txtField;

    public PanelInputText(String lbName) {
        super(lbName);
    }

    @Override
    protected void abstractInitComponents() {
        txtField = new JTextField("");
    }

    @Override
    public Object getValue() {
        return txtField.getText().trim();
    }

    @Override
    protected Component getPanel() {
        return txtField;
    }

    @Override
    protected String getNameOfPanel() {
            return "text field";
    }
}
