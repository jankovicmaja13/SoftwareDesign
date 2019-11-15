/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package factoryMethod;

import component.fields.AbstractPanelInput;
import view.FrmPerson;

public abstract class Creator {

    public abstract AbstractPanelInput createPanelInputFirstName();

    public abstract AbstractPanelInput createPanelInputLastName();

    public abstract AbstractPanelInput createPanelInputGender();

    public abstract AbstractPanelInput createPanelInputDate();

    public FrmPerson createForm() {
        AbstractPanelInput inputFirstName = createPanelInputFirstName();
        AbstractPanelInput inputLastName = createPanelInputLastName();
        AbstractPanelInput inputGender = createPanelInputGender();
        AbstractPanelInput inputDate = createPanelInputDate();

        return new FrmPerson(inputFirstName, inputLastName, inputGender, inputDate);
    }

}
