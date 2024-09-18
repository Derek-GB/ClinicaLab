/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Controllers;

import Models.Customer;
import Models.IManager;
import Views.IView;

/**
 *
 * @author d2tod
 */
public class RecordController {
    
    private IManager<Models.Record> model;
    private IView<Models.Record> view;

    public RecordController(IManager model, IView view) {
        this.model = model;
        this.view = view;
    }

    public void insert(Customer customer) {
        Models.Record record;
        record = new Models.Record(customer);
        if (model.add(record)) {
            view.showMessage("Agregado.");
        } else {
            view.showErrorMessage("El cliente ya se encuentra registrado.");
        }
    }
}
