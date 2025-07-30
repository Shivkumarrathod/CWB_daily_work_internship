class Node{
    int data;
    Node next;
    Node(int data){
        this.data=data;
        this.next=null;
    }
}

public class Queue {
    Node front,rear;
    void enqueue(int data){
        Node newNode = new Node(data);
        if(rear==null){
            front=rear=newNode;
            return;
        }
        rear.next=newNode;
        rear=newNode;
    }
    int dequeue(){
        if(front==null) return -1;
        int val = front.data;
        front=front.next;
        if(front==null) rear=null;
        return val;
    }
    int peek(){
        return (front!=null)?front.data:-1;
    }
    boolean isEmpty(){
        return front==null;
    }
    public void clear(){
        while(front!=null){
            front=front.next;
        }
        if(front==null) rear=null;
    }
    public void printQueue() {
        Node temp = front;
        while (temp != null) {
            System.out.print(temp.data + " -> ");
            temp = temp.next;
        }
        System.out.println("NULL");
    }
    public static void main(String[] args) {
        Queue queue = new Queue();

        queue.enqueue(10);
        queue.enqueue(20);
        queue.enqueue(30);
        queue.printQueue();

        System.out.println("Top element: " + queue.peek());

        System.out.println("Dequeued: " + queue.dequeue());
        queue.printQueue();

        System.out.println("Is empty? " + queue.isEmpty());

        queue.dequeue();
        queue.dequeue();
        System.out.println("Is empty? " + queue.isEmpty());
    }
}
