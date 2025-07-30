class StudentNode {
    String name;
    StudentNode next;

    StudentNode(String name) {
        this.name = name;
    }
}

class AdmissionQueue {
    private StudentNode front;
    private StudentNode rear;

    public void addStudent(String name) {
        StudentNode newNode = new StudentNode(name);
        if (rear == null) {
            front = rear = newNode;
        } else {
            rear.next = newNode;
            rear = newNode;
        }
    }

    public void addVIPStudent(String name) {
        StudentNode newNode = new StudentNode(name);
        if (front == null) {
            front = rear = newNode;
        } else {
            newNode.next = front;
            front = newNode;
        }
    }

    public String admitStudent() {
        if (front == null) {
            return "No students in queue";
        }
        String admitted = front.name;
        front = front.next;
        if (front == null) rear = null;
        return admitted;
    }

    public void displayQueue() {
        StudentNode current = front;
        while (current != null) {
            System.out.print(current.name + " ");
            current = current.next;
        }
        System.out.println();
    }

    public static void main(String[] args) {
        AdmissionQueue queue = new AdmissionQueue();
        queue.addStudent("John");
        queue.addStudent("Emma");
        queue.addVIPStudent("VIP_Alice");
        queue.addStudent("Liam");
        queue.addVIPStudent("VIP_Bob");

        System.out.println("Current Queue:");
        queue.displayQueue();

        System.out.println("Admitted: " + queue.admitStudent());
        queue.displayQueue();
    }
}
