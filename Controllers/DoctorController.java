/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Controllers;

import Models.Doctor;
import Models.IManager;
import Views.IView;
import java.time.LocalDate;
import java.util.List;

/**
 *
 * @author DYLAN
 */
public class DoctorController {
    private IManager<Doctor> model;
    private IView<Doctor> view;

    public DoctorController(IManager model, IView view) {
        this.model = model;
        this.view = view;
    }

    public void insert(String cedula, int nMedico, String nombre, LocalDate fNacimiento, String telefono, String correo, String especialidad, double salario){
        Doctor doctor;
        if(telefono!=null){
            doctor=new Doctor(cedula,nMedico,nombre,fNacimiento,telefono,correo,especialidad,salario);
        }else{
            doctor=new Doctor(cedula,nMedico,nombre,fNacimiento,telefono,correo,especialidad,salario);
        }
        if (model.add(doctor)){
           view.showMessage("Agregado.");
        }else{
           view.showErrorMessage("El id ya se encuentra registrado.");
        }
    }
    
    public void readAll(){
        List<Doctor> doctor=model.getAll();
        if(doctor!=null){
            view.displayAll(doctor);
        }else{
            view.showErrorMessage("No hay datos");
        }
    }

}
