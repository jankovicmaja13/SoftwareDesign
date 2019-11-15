/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package component.fields;

import java.awt.Component;
import java.awt.GridLayout;
import javax.swing.ButtonGroup;
import javax.swing.JPanel;
import javax.swing.JRadioButton;


public class PanelInputRadioButton extends AbstractPanelInput {

    private static final String GENDER_M = "M";
    private static final String GENDER_F = "F";
    
    private JPanel panel;
    private ButtonGroup group;
    private JRadioButton btnM;
    private JRadioButton btnF;

    public PanelInputRadioButton(String lbName) {
        super(lbName);
    }

    @Override
    protected void abstractInitComponents() {
        panel = new JPanel();
        group = new ButtonGroup();
        btnM = new JRadioButton();
        btnF = new JRadioButton();
        
        btnF.setSelected(true);
        btnM.setText(GENDER_M);
        btnF.setText(GENDER_F);

        panel.setLayout(new GridLayout(1, 2));

        group.add(btnM);
        group.add(btnF);
        panel.add(btnM);
        panel.add(btnF);
    }

    @Override
    protected Component getPanel() {
        return panel;
    }

    @Override
    public Object getValue() {
        return btnM.isSelected() ? GENDER_M : GENDER_F;
    }

    

    @Override
    protected String getNameOfPanel() {
            return "rbtn";
    }
}
