class Stack {
    private int[] data;
    public int top;
    private int capacity;

    public Stack() {
        capacity = 100;
        data = new int[capacity];
        top = -1;
    }

    public void push(int value) {
        if (top == capacity - 1) {
            throw new RuntimeException("Stack overflow");
        }
        data[++top] = value;
    }

    public int pop() {
        if (isEmpty()) {
            throw new RuntimeException("Stack underflow");
        }
        return data[top--];
    }

    public int peek() {
        if (isEmpty()) {
            throw new RuntimeException("Stack is empty");
        }
        return data[top];
    }

    public void clear() {
        top = -1;
    }

    public boolean isEmpty() {
        return top == -1;
    }
}

public class BrowserHistory {
    Stack backStack = new Stack();
    Stack forwardStack = new Stack();

    public void visitNewPage(int pageid) {
        backStack.push(pageid);
        forwardStack.clear();
        System.out.println("Visited a new Page Number: " + pageid);
    }

    public void goBack() {
        if (backStack.isEmpty()) {
            System.out.println("No pages to go back to.");
            return;
        }
        int current = backStack.pop();
        forwardStack.push(current);
        if (!backStack.isEmpty()) {
            System.out.println("Went back to the page Number: " + backStack.peek());
        } else {
            System.out.println("Went back, but no previous page available.");
        }
    }

    public void goForward() {
        if (forwardStack.isEmpty()) {
            System.out.println("No pages to go forward to.");
            return;
        }
        int pageid = forwardStack.pop();
        backStack.push(pageid);
        System.out.println("Went forward to the page Number: " + pageid);
    }

    public static void main(String[] args) {
        BrowserHistory bh = new BrowserHistory();
        bh.visitNewPage(1);
        bh.visitNewPage(2);
        bh.visitNewPage(3);
        bh.goBack();
        bh.goForward();
    }
}
