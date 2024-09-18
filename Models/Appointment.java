/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Models;

import java.time.LocalDate;
/**
 *
 * @author Fernando
 */
public class Appointment {
    private Customer customer;
    private String reason;
    private LlaveCompuesta llave;

    public LlaveCompuesta getLlave() {
        return llave;
    }



    public Customer getCustomer() {
        return customer;
    }


    public String getReason() {
        return reason;
    }

    public Appointment(Customer customer, String reason, LlaveCompuesta llave) {
        this.customer = customer;
        this.reason = reason;
        this.llave = llave;
    }


      
      
}
