/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package abstractFactory;

import component.fields.AbstractPanelInput;
import view.FrmPerson;

public interface AbstractFactory {

    public static final String lbFIRSTNAME = "First name: ";
    public static final String lbLASTNAME = "Last name: ";
    public static final String lbGENDER = "Gender: ";
    public static final String lbDATE = "Date: ";

    AbstractPanelInput createPanelInputFirstName();

    AbstractPanelInput createPanelInputLastName();

    AbstractPanelInput createPanelInputGender();

    AbstractPanelInput createPanelInputDate();
}
