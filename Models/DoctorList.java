/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Models;

import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author DYLAN
 */
public class DoctorList implements IManager<Doctor> {
    private List<Doctor> doctorList;

    public DoctorList() {
        doctorList = new ArrayList<>();
    }

    @Override
    public boolean remove(Doctor doctor) {
        if (doctor != null && get(doctor)!=null) {
            doctorList.remove(doctor);
            return true;
        }
        return false;
    }

    @Override
    public boolean set(Doctor doctor) {
        if (doctor != null) {
            Doctor current=get(doctor);
            if (current != null){
                doctorList.remove(current);
                doctorList.add(doctor);
                return true;
            }
        }
        return false;
    }

    @Override
    public boolean add(Doctor doctor) {
        Doctor current = get(doctor);
        if(current!=null)
            return false;
        doctorList.add(doctor);
        return true;
    }

    @Override
    public Doctor get(Doctor doctor) {
        for (Doctor current : doctorList) {
            if (current.getCedula()== doctor.getCedula()) {
                return current;
            }
        }
        return null;
    }

    @Override
    public List getAll() {
        if (doctorList.isEmpty()) {
            return null;
        }
        return doctorList;
    }
    
    
}
