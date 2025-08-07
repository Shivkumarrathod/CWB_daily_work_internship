public class student {
    static class Student{
        String name;
        Student next;

        Student(String name){
            this.name= name;
            this.next = null;
        }
    }

    //add the student at the end of the list
    static  Student head = null;
    static  Student tail = null;
    
    public static void addStudent(String name) {
        Student newStudent = new Student(name);

        if (head == null) {
            head = tail = newStudent;
        } else {
            tail.next = newStudent;
            tail = newStudent;
        }
        System.out.println("Added Student:"+tail.name);
    }
    public static void addVIP(String name) {
        Student newStudent = new Student(name);

        if (head == null) {
            head = tail = newStudent;
        } else {
            newStudent.next = head;
            head = newStudent;
        }
        System.out.println("Added Student:"+head.name);
    }
    public static void removeStudent(){
        if (head == null) {
            System.out.println("No students to remove.");
            return;
        }

        System.out.println(head.name + " has been removed.");
        head = head.next;
    }

    public static void displayStudents(){
        if (head == null) {
            System.out.println("No students currently enrolled.");
            return;
        }
        Student temp = head;

        while (temp != null) {
            System.out.print("-->" + temp.name);
            temp = temp.next;
        }
        System.out.println("-->null");
    }

    public static void main(String[] args) {
        addStudent("rathod");
        addStudent("rathod1");
        addStudent("rathod2");
        addStudent("rathod3");
        displayStudents();
        addVIP("VIP1");
        displayStudents();
        removeStudent();
        displayStudents();
        removeStudent();
        displayStudents();
        removeStudent();
        displayStudents();
        removeStudent();
        displayStudents();
        removeStudent();

    }
}
