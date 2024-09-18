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
public class LlaveCompuesta {
    
private LocalDate fecha;
private int hora;
private Doctor doctor;

    public LocalDate getFecha() {
        return fecha;
    }

    public int getHora() {
        return hora;
    }

    public Doctor getDoctor() {
        return doctor;
    }

    public void setFecha(LocalDate fecha) {
        this.fecha = fecha;
    }

    public void setHora(int hora) {
        this.hora = hora;
    }

    public LlaveCompuesta(LocalDate fecha, int hora, Doctor doctor) {
        this.fecha = fecha;
        this.hora = hora;
        this.doctor = doctor;
    }
    
        public LlaveCompuesta() {
        this(LocalDate.now(),0,null);
    }


    
    
}
