/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package builder;

import component.fields.AbstractPanelInput;
import view.FrmPerson;

public abstract class Builder {

    protected AbstractPanelInput inputFirstName;
    protected AbstractPanelInput inputLastName;
    protected AbstractPanelInput inputGender;
    protected AbstractPanelInput inputDate;

    public static final String lbFIRSTNAME = "First name: ";
    public static final String lbLASTNAME = "Last name: ";
    public static final String lbGENDER = "Gender: ";
    public static final String lbDATE = "Date: ";

    public abstract void createPanelInputFirstName();

    public abstract void createPanelInputLastName();

    public abstract void createPanelInputGender();

    public abstract void createPanelInputDate();

    public FrmPerson buildForm() {
        return new FrmPerson(inputFirstName, inputLastName, inputGender, inputDate);
    }

}
