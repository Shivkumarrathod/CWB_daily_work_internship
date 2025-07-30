class Node{
    int data;
    Node next;
    Node(int data){
        this.data=data;
        this.next=null;
    }
}

public class Stack {
    public Node top;
    public void push(int data){
        Node newNode = new Node(data);
        newNode.next=top;
        top = newNode;
    }
    public int pop(){
        if(top==null) return -1;
        int val = top.data;
        top = top.next;
        return val;
    }
    public int peek(){
        return (top!=null)?top.data:-1;
    }
    public boolean isEmpty(){
        return top==null;
    }
    public void clear(){
        while (top!=null){
            top = top.next;
        }
    }
    public void printStack() {
        Node temp = top;
        while (temp != null) {
            System.out.print(temp.data + " -> ");
            temp = temp.next;
        }
        System.out.println("NULL");
    }
    public static void main(String[] args) {
        Stack stack = new Stack();

        stack.push(10);
        stack.push(20);
        stack.push(30);
        stack.printStack();

        System.out.println("Top element: " + stack.peek());

        System.out.println("Popped: " + stack.pop());
        stack.printStack();

        System.out.println("Is empty? " + stack.isEmpty());

        stack.pop();
        stack.pop();
        System.out.println("Is empty? " + stack.isEmpty());
    }
}
