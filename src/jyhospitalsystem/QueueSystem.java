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
public class QueueSystem<T> implements LinkedListInterface<T>, Dynamicable<T> {
    
    class Node{
        private T patient;
        private Node next; //reference to next node, 
        //it will point to the next node
        private Node previous;
        
        public Node(T patient){
            this.patient = patient;
            this.next = null;
            this.previous = null;
        }
        
        public Node(T patient, Node next, Node previous){
            this.patient = patient;
            this.next = next;
            this.previous = previous;// link to next
        }
    }
    
    private Node firstNode;
    private Node lastNode;
    private Node lastHighPriorNode;
    private Node lastLowPriorNode;
    
    public QueueSystem(){
    firstNode = null;
    lastNode = null;
    lastHighPriorNode = null;
    lastLowPriorNode = null;
    }

    @Override
    public void add(T newPatient) {
        
        Patient enqueuedPatient = (Patient) newPatient;

        Node newNode = new Node(newPatient);

    if(!isEmpty()){
        
        
        if(enqueuedPatient.getPriority().equals("High")){
            if(lastHighPriorNode == null){
                newNode.next = firstNode;
                firstNode = newNode;
                lastHighPriorNode = newNode;
            }else{
            newNode.next = lastHighPriorNode.next;
            lastHighPriorNode.next = newNode;
            lastHighPriorNode = newNode;
            }
        } else {
            lastNode.next = newNode;
        
            lastNode = newNode;
        }
     }
     else {
//        newNode.next = firstNode;
        
        firstNode = newNode;
        lastNode = newNode;
        
        if(enqueuedPatient.getPriority().equals("High")){
//            lastHighPriorNode.next = newNode;
//            newNode.next = lastHighPriorNode;
            lastHighPriorNode = newNode;
        } else {
            lastHighPriorNode = null;
        }
//        
//        firstNode = newNode;
//        lastNode = newNode;
     }
         

}
    @Override
    public T removeInfront() {
        T data = null;
        data = firstNode.patient;
        firstNode = firstNode.next;
        return data;
    }

    @Override
    public String toString(){
    String queueOutput = "";
    Node tempNode = firstNode;
    while (tempNode != null){
        queueOutput += tempNode.patient + "\n";
        tempNode = tempNode.next;
    }
    return queueOutput;
}
    @Override
    public boolean isEmpty() {
        return (firstNode == null && lastNode == null && lastHighPriorNode == null && lastLowPriorNode == null);
    }

    @Override
    public void clear() {
        firstNode = null;
        lastNode = null;
        lastHighPriorNode = null;
        lastLowPriorNode = null;
    }
    
    @Override
    public void queueToHighPrio(T newEntry) {
        Node newNode = new Node(newEntry);
        
        if(!isEmpty()){
            lastHighPriorNode.next = newNode;
        }
        else {
            firstNode = newNode;
            lastNode = newNode;
        }
         
            lastHighPriorNode = newNode;
    }

    @Override
    public void queueToLowPrio(T newEntry) {
        Node newNode = new Node(newEntry);
        
        if(!isEmpty()){
            lastHighPriorNode.next = newNode;
        }
        else {
            firstNode = newNode;
            newNode.next = lastNode;
        }
        
            lastNode = newNode;
    }
        
        
}
