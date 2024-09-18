/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Models;

/**
 *
 * @author d2tod
 */
public class Record {
    private Customer customer;
    private ResumeStack resume;

    public Customer getCustomer() {
        return customer;
    }

    public ResumeStack getResume() {
        return resume;
    }
    
    public Record(Customer customer){
        this.customer=customer;
        this.resume = new ResumeStack();
    }
    
    public Record(){
        this(new Customer());
    }
}
