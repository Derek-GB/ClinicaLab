/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Models;

import java.time.LocalDate;

/**
 *
 * @author DYLAN
 */
public class Doctor {
    private String cedula;
    private int nMedico;
    private String nombre;
    private LocalDate fNacimiento;
    private String telefono;
    private String correo;
    private String especialidad;
    private double salario;

    public String getCedula() {
        return cedula;
    }

    public int getnMedico() {
        return nMedico;
    }

    public String getNombre() {
        return nombre;
    }

    public LocalDate getfNacimiento() {
        return fNacimiento;
    }

    public String getTelefono() {
        return telefono;
    }

    public String getCorreo() {
        return correo;
    }

    public String getEspecialidad() {
        return especialidad;
    }

    public double getSalario() {
        return salario;
    }

    public void setTelefono(String telefono) {
        this.telefono = telefono;
    }

    public void setCorreo(String correo) {
        this.correo = correo;
    }

    public void setSalario(double salario) {
        this.salario = salario;
    }
    

    public Doctor(String cedula, int nMedico, String nombre, LocalDate fNacimiento, String telefono, String correo, String especialidad, double salario) {
        this.cedula = cedula;
        this.nMedico = nMedico;
        this.nombre = nombre;
        this.fNacimiento = fNacimiento;
        this.telefono = telefono;
        this.correo = correo;
        this.especialidad = especialidad;
        this.salario = salario;
    }

    public Doctor() {
        this("",0,"",null,"","","",0.0);
    }
    
    
    
}
