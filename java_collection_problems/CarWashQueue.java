class CarNode {
    String car;
    CarNode next;

    CarNode(String car) {
        this.car = car;
        this.next = null;
    }
}

class CarWashQueue {
    private CarNode head;
    private CarNode tail;

    public void addNormalCar(String car) {
        CarNode newNode = new CarNode(car);
        if (tail == null) {
            head = tail = newNode;
        } else {
            tail.next = newNode;
            tail = newNode;
        }
    }

    public void addVIPCar(String car) {
        CarNode newNode = new CarNode(car);
        if (head == null) {
            head = tail = newNode;
        } else {
            newNode.next = head;
            head = newNode;
        }
    }

    public String washCar() {
        if (head == null) {
            return "No cars to wash";
        }
        String washedCar = head.car;
        head = head.next;
        if (head == null) {
            tail = null;
        }
        return washedCar;
    }

    public void displayQueue() {
        CarNode current = head;
        while (current != null) {
            System.out.print(current.car + " ");
            current = current.next;
        }
        System.out.println();
    }

    public static void main(String[] args) {
        CarWashQueue queue = new CarWashQueue();
        queue.addNormalCar("Car1");
        queue.addNormalCar("Car2");
        queue.addVIPCar("VIPCar1");
        queue.displayQueue();
        System.out.println("Washing: " + queue.washCar());
        queue.displayQueue();
    }
}
