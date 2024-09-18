/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package Models;

import java.util.List;

/**
 *
 * @author Tony
 */
public interface IResume<T> {
     public boolean add(T element);
     
     public T get(T element);
     
      public List getAll();
}
