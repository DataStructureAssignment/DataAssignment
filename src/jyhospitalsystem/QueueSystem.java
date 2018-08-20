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
        private Node previous;//reference to previous node, 
        //it will point to the previous node
        
        public Node(T patient){
            this.patient = patient;
            this.next = null;
            this.previous = null;
        }
        
        public Node(T patient, Node next, Node previous){
            this.patient = patient;
            this.next = next; // link to next
            this.previous = previous; // link to previous
        }
    }
    
    private Node firstNode;
    private Node lastNode;
    private Node lastHighPrioNode;
    private Node lastLowPrioNode;
    
    public QueueSystem(){
    firstNode = null;
    lastNode = null;
    lastHighPrioNode = null;
    lastLowPrioNode = null;
    }

    @Override
    public void addToInfront(T newPatient) {
        Node newNode = new Node (newPatient);

     if(!isEmpty()){
         newNode.next = firstNode; 
         firstNode.previous = newNode; //link the newNode to firstNode
     }
     else{
         lastNode = newNode; // If is empty, newNode is the lastNode
         }
         firstNode = newNode; 
    }

    @Override
    public void addToBehind(T newPatient) {
        Node newNode = new Node(newPatient);

     if(!isEmpty()){
         lastNode.next = newNode;
         newNode.previous = lastNode;
     }
     else {
         newNode.next = lastNode;
         firstNode = newNode;
     }
         
     lastNode = newNode;
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
    String s1 = "";
    Node tempNode = firstNode;
    while (tempNode.next != null){
        s1 = tempNode.patient + "\n";
        tempNode = tempNode.next;
    }
    return s1;
}
    @Override
    public boolean isEmpty() {
        return (firstNode == null && lastNode == null && lastHighPrioNode == null && lastLowPrioNode == null);
    }

    @Override
    public void clear() {
        firstNode = null;
        lastNode = null;
        lastHighPrioNode = null;
        lastLowPrioNode = null;
    }
    
    @Override
    public void queueToHighPrio(T newEntry) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public void queueToLowPrio(T newEntry) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    
    
}
