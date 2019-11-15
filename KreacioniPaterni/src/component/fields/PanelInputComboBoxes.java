/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package component.fields;

import java.awt.Component;
import java.awt.GridLayout;
import java.time.LocalDate;
import java.time.Month;
import java.util.Calendar;
import java.util.Date;
import java.util.GregorianCalendar;
import javax.swing.JComboBox;
import javax.swing.JPanel;

public class PanelInputComboBoxes extends AbstractPanelInput {

    private JPanel panel;
    private JComboBox<String> cmbDay;
    private JComboBox<String> cmbMonth;
    private JComboBox<String> cmbYear;

    public PanelInputComboBoxes(String lbName) {
        super(lbName);
    }

    @Override
    protected void abstractInitComponents() {
        panel = new JPanel();
        cmbDay = new JComboBox();
        cmbMonth = new JComboBox();
        cmbYear = new JComboBox();

        for (int i = 1; i <= 31; i++) {
            cmbDay.addItem(i + "");
        }
        for (int j = 1; j <= 12; j++) {
            cmbMonth.addItem(j + "");
        }
        for (int k = Calendar.getInstance().get(Calendar.YEAR); k >= 1930; k--) {
            cmbYear.addItem(k + "");
        }

        panel.setLayout(new GridLayout(1, 3));

        panel.add(cmbDay);
        panel.add(cmbMonth);
        panel.add(cmbYear);
    }

    @Override
    protected Component getPanel() {
        return panel;
    }

    @Override
    public Object getValue() {
        int day = Integer.parseInt((String) cmbDay.getSelectedItem());
        int month = Integer.parseInt((String) cmbMonth.getSelectedItem());
        int year = Integer.parseInt((String) cmbYear.getSelectedItem());

        //GregorianCalendar gc= new GregorianCalendar(year, month, day);
        //Date date = new Date(year, month, day);
        LocalDate lc = LocalDate.of(year, month, day);
        return lc;
    }

    @Override
    protected String getNameOfPanel() {
        return "cmbs";
    }
}
