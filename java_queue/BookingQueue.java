class Person {
    String name;
    Person next;

    public Person(String name) {
        this.name = name;
        this.next = null;
    }
}

public class BookingQueue {
    private Person front;
    private Person rear;

    public BookingQueue() {
        this.front = null;
        this.rear = null;
    }

    public void enqueue(String name) {
        Person newPerson = new Person(name);
        if (rear == null) {
            front = rear = newPerson;
        } else {
            rear.next = newPerson;
            rear = newPerson;
        }
        System.out.println(name + " added to the booking queue.");
    }
    public void dequeue() {
        if (front == null) {
            System.out.println("No one is in the queue.");
            return;
        }
        System.out.println(front.name + " has been served.");
        front = front.next;
        if (front == null) {
            rear = null;
        }
    }

    public void cancel(String name) {
        if (front == null) {
            System.out.println("Queue is empty. Cannot cancel.");
            return;
        }

        Person current = front;
        Person prev = null;

        while (current != null) {
            if (current.name.equals(name)) {
                if (prev == null) {
                    front = current.next;
                    if (front == null) {
                        rear = null;
                    }
                } else {
                    prev.next = current.next;
                    if (current == rear) {
                        rear = prev;
                    }
                }
                System.out.println(name + "'s booking has been cancelled.");
                return;
            }
            prev = current;
            current = current.next;
        }

        System.out.println(name + " not found in the queue.");
    }

    public void displayQueue() {
        if (front == null) {
            System.out.println("Queue is empty.");
            return;
        }
        System.out.print("Current Booking Queue: ");
        Person current = front;
        while (current != null) {
            System.out.print(current.name + " ");
            current = current.next;
        }
        System.out.println();
    }
    public static void main(String[] args) {
        BookingQueue queue = new BookingQueue();

        queue.enqueue("Alice");
        queue.enqueue("Bob");
        queue.enqueue("Charlie");
        queue.displayQueue();

        queue.dequeue();
        queue.displayQueue();

        queue.cancel("Charlie"); 
        queue.displayQueue();

        queue.cancel("David");
    }
}

