/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Models;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;

/**
 *
 * @author d2tod
 */
public class RecordList implements IAppointment<Record>{
    private HashSet<Record> recordList;
    
    public RecordList(){
        this.recordList = new HashSet<>();
    }
    
    @Override
    public boolean set(Record element) {
        for (Record current : recordList) {
            if (current.getCustomer().getId() == element.getCustomer().getId()) {
                recordList.remove(current);
                return recordList.add(element);
            }
        }
        return false;

    }

    @Override
    public boolean add(Record element) {
        return recordList.add(element);
    }

    @Override
    public Record get(Record element) {
        for (Record current : recordList) {
            if (current.getCustomer().getId() == element.getCustomer().getId()) {
                return current;
            }
        }
        return null;
    }

    @Override
    public List getAll() {
        return new ArrayList<>(recordList);
    }
    
}
