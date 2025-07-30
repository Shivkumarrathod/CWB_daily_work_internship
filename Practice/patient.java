class BedList {
    class PatientNode {
        String name;
        int id;
        PatientNode next;

        PatientNode(String name, int id) {
            this.name = name;
            this.id = id;
            this.next = null;
        }
    }
    private PatientNode head = null;

    public void assignBed(String name, int id) {
        PatientNode newPatient = new PatientNode(name, id);
        if (head == null) {
            head = newPatient;
        } else {
            PatientNode temp = head;
            while (temp.next != null) {
                temp = temp.next;
            }
            temp.next = newPatient;
        }
        System.out.println("Assigned bed to patient: " + name + " (ID: " + id + ")");
    }

    public void discharge(String key) {
        if (head == null) {
            System.out.println("No patients to discharge.");
            return;
        }

        if (head.name.equals(key) || String.valueOf(head.id).equals(key)) {
            System.out.println("Discharged: " + head.name + " (ID: " + head.id + ")");
            head = head.next;
            return;
        }

        PatientNode temp = head;
        while (temp.next != null) {
            if (temp.next.name.equalsIgnoreCase(key) || String.valueOf(temp.next.id).equals(key)) {
                System.out.println(temp.next.name + "id: " + temp.next.id );
                temp.next = temp.next.next;
                return;
            }
            temp = temp.next;
        }
        System.out.println("Patient not found: " + key);
    }
    public void displayBeds() {
        if (head == null) {
            System.out.println("No patients currently admitted.");
            return;
        }
        PatientNode temp = head;
        while (temp != null) {
            System.out.println("#" + temp.name + " (ID: " + temp.id + ")");
            temp = temp.next;
        }
    }
     public static void main(String[] args) {
        BedList hospital = new BedList();

        hospital.displayBeds();

        hospital.assignBed("Alice", 101);
        hospital.assignBed("Bob", 102);
        hospital.assignBed("Charlie", 103);

        hospital.displayBeds();

        hospital.discharge("Bob");       
        hospital.discharge("103");       

        hospital.displayBeds();

        hospital.discharge("999");       
        hospital.discharge("Alice");     

        hospital.displayBeds();  
    }
}

