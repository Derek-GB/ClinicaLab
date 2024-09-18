/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Controllers;

import Models.Appointment;
import Models.IAppointment;
import Views.IView;

/**
 *
 * @author Fernando
 */
public class CustomerAppointment {
    private IAppointment<Appointment> model;
    private IView<Appointment> view;

    public CustomerAppointment(IAppointment model, IView view) {
        this.model = model;
        this.view = view;
    }
    
    

    
}
