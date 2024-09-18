/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Controllers;

import Models.Customer;
import Models.IManager;
import Models.Record;
import Models.Resume;
import Views.IView;
import java.time.LocalDate;
import java.util.List;

/**
 *
 * @author jprod
 */
public class CustomerController {

    private IManager<Record> model;
    private IView<Record> view;

    public CustomerController(IManager model, IView view) {
        this.model = model;
        this.view = view;
    }

    public void insert(Customer customer) {
        Record record;
        record = new Record(customer);
        if (model.add(record)) {
            view.showMessage("Agregado.");
        } else {
            view.showErrorMessage("El cliente ya se encuentra registrado.");
        }
    }
}
