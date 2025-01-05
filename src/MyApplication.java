import java.util.*;

public class MyApplication {
    public static void main(String[] args) {
        Employee employee1 = new Employee("John", "Lennon", "Manager", 27045.78);
        Employee employee2 = new Employee("George", "Harrison", "Developer", 50000.0);

        Student student1 = new Student("Ringo", "Starr", 2.5);
        Student student2 = new Student("Paul", "McCartney", 3.9);

        ArrayList<Person> payable = new ArrayList<>();
        payable.add(employee1);
        payable.add(employee2);
        payable.add(student1);
        payable.add(student2);

        Collections.sort(payable);

        printData(payable);
    }

    public static void printData(Iterable<Person> payables) {
        for (Payable payable : payables) {
            if (payable instanceof Employee) {
                Employee emp = (Employee) payable;
                System.out.println(emp + " earns " + emp.getPaymentAmount() + " tenge");
            } else if (payable instanceof Student) {
                Student stu = (Student) payable;
                System.out.println(stu + " earns " + stu.getPaymentAmount() + " tenge");
            }
        }
    }
}
