/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package jyhospitalsystem;

/**
 *
 * @author User
 */
public interface LinkedListInterface<T> {
    
    public void add(T newEntry);
    
    public T removeInfront();
    
    public boolean isEmpty();
    
    public void clear();
    
    public String toString();

    public void moveToHighPrior();
    
}
