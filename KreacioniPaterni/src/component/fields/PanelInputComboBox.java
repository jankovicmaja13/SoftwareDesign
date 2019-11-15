/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package component.fields;

import java.awt.Component;
import javax.swing.JComboBox;

public class PanelInputComboBox extends AbstractPanelInput {

    private JComboBox<String> cmb;

    public PanelInputComboBox(String lbName) {
        super(lbName);
    }

    @Override
    protected void abstractInitComponents() {
        cmb = new JComboBox<>();
        cmb.addItem("F");
        cmb.addItem("M");
    }

    @Override
    protected Component getPanel() {
        return cmb;
    }
    
    @Override
    protected String getNameOfPanel() {
            return "cmb";
      }
    
    @Override
    public Object getValue() {
        return cmb.getSelectedItem();
    }

    

}
