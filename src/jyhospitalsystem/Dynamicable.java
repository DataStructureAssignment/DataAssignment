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
public interface Dynamicable<T> {
    public void queueToHighPrio(T newEntry);
    
    public void queueToLowPrio(T newEntry);
}
