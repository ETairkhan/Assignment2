import java.util.*;

public class MyApplication {
    public static void main(String[] args) {
        Employee employee1 = new Employee("John", "Lennon", "Manager", 27045.78);
        Employee employee2 = new Employee("George", "Harrison", "Developer", 50000.0);

        Student student1 = new Student("Ringo", "Starr", 2.5);
        Student student2 = new Student("Paul", "McCartney", 3.9);

        ArrayList<Payable> payable = new ArrayList<>();
        payable.add(employee1);
        payable.add(employee2);
        payable.add(student1);
        payable.add(student2);

        payable.sort(Comparator.comparingDouble(Payable::getPaymentAmount));

        printData(payable);
    }

    public static void printData(Iterable<Payable> payables) {
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
