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
     private LocalDate date;
    private int time;
    private Customer customer;
    private Doctor doctor;
    private String reason;

    public LocalDate getDate() {
        return date;
    }

    public int getTime() {
        return time;
    }

    public Customer getCustomer() {
        return customer;
    }

    public Doctor getDoctor() {
        return doctor;
    }

    public String getReason() {
        return reason;
    }

    public void setDate(LocalDate date) {
        this.date = date;
    }

    public void setTime(int time) {
        this.time = time;
    }

    public Appointment(LocalDate date, int time, Customer customer, Doctor doctor, String reason) {
        this.date = date;
        this.time = time;
        this.customer = customer;
        this.doctor = doctor;
        this.reason = reason;
    }
    
      public Appointment() {
        this(LocalDate.now(),0,null,null,"");
        
    }

    @Override
    public String toString() {
        return "Appointment{" + "date=" + date + ", time=" + time + ", customer=" + customer + ", doctor=" + doctor + ", reason=" + reason + '}';
    }
      
      
}
