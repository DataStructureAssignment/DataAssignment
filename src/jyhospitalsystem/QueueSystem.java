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
public class QueueSystem<T> implements LinkedListInterface<T> {
    
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
    
    public QueueSystem(){
    firstNode = null;
    lastNode = null;
    lastHighPriorNode = null;
    }

    @Override
    public void add(T newPatient) {
        
        Patient enqueuedPatient = (Patient) newPatient;

        Node newNode = new Node(newPatient);

    if(!isEmpty()){
        
        
        if(enqueuedPatient.getPriority().equals("High")){
            if(lastHighPriorNode != null){   
                newNode.next = lastHighPriorNode.next;
                lastHighPriorNode.next = newNode;
                lastHighPriorNode = newNode;
            }else{
                newNode.next = firstNode;
                firstNode = newNode;
                lastHighPriorNode = newNode;
            }
        } else {
            lastNode.next = newNode;
        
            lastNode = newNode;
        }
     }
     else {
        
        firstNode = newNode;
        lastNode = newNode;
        
        if(enqueuedPatient.getPriority().equals("High")){
            lastHighPriorNode = newNode;
        } else {
            lastHighPriorNode = null;
        }
     }
}
    
    @Override
    public Patient dequeueHighPrior() {
               
        Patient dequeuedPatient = null;
        
        if(!isEmpty()){
            dequeuedPatient = (Patient)firstNode.patient;
            firstNode = firstNode.next;
        }
        
        return dequeuedPatient;
    }

    @Override
    public Patient dequeueLowPrior() {
        Patient dequeuedPatient = null;
        
        if(!isEmpty()){
            dequeuedPatient = (Patient)lastHighPriorNode.next.patient;
            lastHighPriorNode.next = lastHighPriorNode.next.next;
        }
        
        return dequeuedPatient;
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
        return (firstNode == null && lastNode == null && lastHighPriorNode == null);
    }

    @Override
    public void clear() {
        firstNode = null;
        lastNode = null;
        lastHighPriorNode = null;
    }
    
    @Override
    public void moveToHighPrior() {
        int lenghtOfStay = 0; //change lenght of stay to 5
        
        Node tempNode = lastHighPriorNode.next;
        Patient patient = (Patient)tempNode.patient;
        
        while(patient.getTime() >= lenghtOfStay && tempNode != null){
            
            long currentTime = System.currentTimeMillis();
            long duration = (currentTime - patient.getTime()) / 1000;

            System.out.println(duration);
            
            Patient selectedPatient = (Patient)tempNode.patient;
            
            selectedPatient.setPriority("High");
            lastHighPriorNode = lastHighPriorNode.next;  
            tempNode = tempNode.next;
        }
    }
    
   
}
