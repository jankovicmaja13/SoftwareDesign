/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package component.fields;

import java.awt.Component;
import java.awt.GridLayout;
import java.time.LocalDate;
import java.util.Date;
import javax.swing.JPanel;
import javax.swing.JTextField;

public class PanelInputTextFields extends AbstractPanelInput {

    private JPanel panel;
    private JTextField txtDay;
    private JTextField txtMonth;
    private JTextField txtYear;

    public PanelInputTextFields(String lbName) {
        super(lbName);
    }

    @Override
    protected void abstractInitComponents() {

        panel = new JPanel();
        txtDay = new JTextField("");
        txtMonth = new JTextField("");
        txtYear = new JTextField("");

        panel.setLayout(new GridLayout(1, 3));

        panel.add(txtDay);
        panel.add(txtMonth);
        panel.add(txtYear);
    }

    @Override
    protected Component getPanel() {
        return panel;
    }

    @Override
    public Object getValue() {
        int day = Integer.parseInt(txtDay.getText());
        int month = Integer.parseInt(txtMonth.getText());
        int year = Integer.parseInt(txtYear.getText());
        
//      Date date = new Date(year, month, day);
        LocalDate lc= LocalDate.of(year, month, day);
        return lc;
    }

    @Override
    protected String getNameOfPanel() {
        return "text fields";
    }

    
}
