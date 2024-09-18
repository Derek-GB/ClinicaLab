/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Models;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

/**
 *
 * @author Fernando
 */
public class AppointmentMap implements IAppointment<Object>  {
     
   HashMap<LlaveCompuesta,Appointment> citas = new HashMap(); 
   
    @Override
    public boolean set(Object element) {
           if (element instanceof Appointment) {
            Appointment appointment = (Appointment) element;
            LlaveCompuesta key = appointment.getLlave();
            citas.put(key, appointment);
            return true;
        }
        return false;  
    
    }

    @Override
    public boolean add(Object element) {
       Appointment appointment = (Appointment) element;
       LlaveCompuesta key = appointment.getLlave();
        if (citas.containsKey(key)) {
            return false; 
        }
        citas.put(key, appointment); 
        return true;
    }

    @Override
    public Object get(Object element) {
        return citas.get(element); 
    }

    @Override
    public List getAll() {
         return new ArrayList<>(citas.values()); 
    }
    
}
