class Node {
    String data;
    Node next;

    Node(String data) {
        this.data = data;
    }
}

class Queue {
    private Node front, rear;

    public void enqueue(String data) {
        Node newNode = new Node(data);
        if (rear == null) {
            front = rear = newNode;
        } else {
            rear.next = newNode;
            rear = newNode;
        }
    }

    public String dequeue() {
        if (front == null) return null;
        String value = front.data;
        front = front.next;
        if (front == null) rear = null;
        return value;
    }

    public boolean isEmpty() {
        return front == null;
    }

    public void display() {
        Node current = front;
        while (current != null) {
            System.out.print(current.data + " ");
            current = current.next;
        }
        System.out.println();
    }
}

class Stack {
    private Node top;

    public void push(String data) {
        Node newNode = new Node(data);
        newNode.next = top;
        top = newNode;
    }

    public String pop() {
        if (top == null) return null;
        String value = top.data;
        top = top.next;
        return value;
    }

    public boolean isEmpty() {
        return top == null;
    }
}

public class ReverseQueue {

    public static void reverseQueue(Queue queue) {
        Stack stack = new Stack();
        while (!queue.isEmpty()) {
            stack.push(queue.dequeue());
        }
        while (!stack.isEmpty()) {
            queue.enqueue(stack.pop());
        }
    }

    public static void main(String[] args) {
        Queue customerQueue = new Queue();
        customerQueue.enqueue("Alice");
        customerQueue.enqueue("Bob");
        customerQueue.enqueue("Charlie");
        customerQueue.enqueue("Diana");

        System.out.println("Original Queue:");
        customerQueue.display();

        reverseQueue(customerQueue);

        System.out.println("Reversed Queue:");
        customerQueue.display();
    }
}
