class BookNode {
    String book;
    BookNode next;

    BookNode(String book) {
        this.book = book;
        this.next = null;
    }
}

class BookStack {
    private BookNode top;

    public void push(String book) {
        BookNode newNode = new BookNode(book);
        newNode.next = top;
        top = newNode;
    }

    public String pop() {
        if (top == null) {
            return "No books to remove";
        }
        String removedBook = top.book;
        top = top.next;
        return removedBook;
    }

    public String peek() {
        if (top == null) {
            return "No books in stack";
        }
        return top.book;
    }

    public void displayStack() {
        BookNode current = top;
        while (current != null) {
            System.out.print(current.book + " ");
            current = current.next;
        }
        System.out.println();
    }

    public static void main(String[] args) {
        BookStack stack = new BookStack();
        stack.push("Book A");
        stack.push("Book B");
        stack.push("Book C");
        stack.displayStack();
        System.out.println("Top Book: " + stack.peek());
        System.out.println("Removing: " + stack.pop());
        stack.displayStack();
    }
}
