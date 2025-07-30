class Node{
    int data;
    Node next;
    Node(int data){
        this.data=data;
        this.next=null;
    }
}

class Stack {
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
}
public class DocEdit {
    Stack undoStack = new Stack();
    Stack redoStack = new Stack();
    public void performAction(int pageid){
        undoStack.push(pageid);
        redoStack.clear();
        System.out.println("Performed an Action:"+pageid);
    }
    public void undo(){
        int pageid = undoStack.pop();
        redoStack.push(pageid);
        System.out.println("Undo acion to:"+undoStack.top.data);
    }
    public void redo(){
        int pageid = redoStack.pop();
        undoStack.push(pageid);
        System.out.println("Redo action to:"+pageid);
    }
    public static void main(String[] args) {
        DocEdit de = new DocEdit();
        de.performAction(1);
        de.performAction(2);
        de.performAction(3);
        de.undo();
        de.redo();
    }
}
