package jyhospitalsystem;


public class doctorList<T> implements LinkedListInterface1<T> {

    private Node firstNode = null;
    private Node lastNode = null;
    private int entry = 0;
    
    class Node{
        private T doctor;
        private Node next; //reference to next node, 
        //it will point to the next node
        private Node previous;
        
        
        public Node(T doctor){
            this.doctor = doctor;
            this.next = null;
            this.previous = null;
        }
        
        public Node(T doctor, Node next, Node previous){
            this.doctor = doctor;
            this.next = next;
            this.previous = previous;// link to next
        }
    }
    
        
    @Override
    public boolean add(T newDoctor) {

        Node newNode = new Node(newDoctor);

    if(!isEmpty()){
            lastNode.next = newNode;
            lastNode = newNode;
            entry++;
        }
        else
        {
            firstNode = newNode;
            lastNode = newNode;
            entry++;
        }
        
        return true;
    }
    
    @Override
    public boolean isEmpty() {
        return (firstNode == null && lastNode == null);
    }
   
    @Override
    public int size() {
        return entry;
    }
    
    @Override
    public T get(int index) {
        Node temperory = firstNode;
        for(int i = 0; i != index; i++){
            temperory = temperory.next;
        }
        T info = temperory.doctor;
        return info;
    }
}
