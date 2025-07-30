class Bed {
    int data;
    String name;
    Bed next;

    Bed(int pid, String name) {
        this.data = pid;
        this.name = name;
        this.next = null;
    }
}

public class HospitalBed {
    Bed head;

    public void assignBed(int pid, String name) {
        Bed newBed = new Bed(pid, name);
        System.out.println("Assigned Bed to " + newBed.data + " " + newBed.name);
        if (head == null) {
            head = newBed;
        } else {
            Bed temp = head;
            while (temp.next != null) {
                temp = temp.next;
            }
            temp.next = newBed;
        }
    }

    public void dischargeBed(int pid) {
        if (head == null) return;
        if (head.data == pid) {
            System.out.println("Discharged patient: " + head.data + " " + head.name);
            head = head.next;
            return;
        }
        Bed temp = head;
        while (temp.next != null && temp.next.data != pid) {
            temp = temp.next;
        }
        if (temp.next != null) {
            System.out.println("Discharged patient: " + temp.next.data + " " + temp.next.name);
            temp.next = temp.next.next;
        } else {
            System.out.println("Patient not found.");
        }
    }

    public void displayOcc() {
        if (head == null) {
            System.out.println("No patients assigned.");
            return;
        }
        Bed temp = head;
        System.out.println("Current Occupancy:");
        while (temp != null) {
            System.out.print(temp.data + " (" + temp.name + ")");
            if (temp.next != null) {
                System.out.print(" -> ");
            }
            temp = temp.next;
        }
        System.out.println();
    }

    public static void main(String[] args) {
        HospitalBed hb = new HospitalBed();
        hb.assignBed(1, "Ram");
        hb.assignBed(2, "Shyam");
        hb.assignBed(3, "Yam");
        hb.displayOcc();
        hb.dischargeBed(2);
        hb.displayOcc();
    }
}
