package Lesson16;

import java.util.*;

public class PriorityQueueDemo {
    public static void main(String[] args) {

        Queue<Book> library = new PriorityQueue<>();

        Book a = new Book("smbd", "smbd", (short) 1000);
        Book b = new Book("Ivanho", "Scott", (short) 1987);
        Book c = new Book("Oliver Twist", "Dickens", (short) 1900);
        Book d = new Book("Holmes", "Doyle", (short) 1754);
        Book e = new Book("Bug", "Poe", (short) 1357);
        Book f = new Book("Luke", "lee", (short) 1856, Book.Genre.CLASSIC);


        List<Book> list = Arrays.asList(a, b, c, d, e, f);

        library.addAll(list);

        System.out.println(library.peek());

        Patient newPatient0 = new Patient("James", 1, Severity.LOW);
        Patient newPatient1 = new Patient("John", 45, Severity.MEDIUM);
        Patient newPatient2 = new Patient("John", 44, Severity.MEDIUM);
        Patient newPatient3 = new Patient("John", 1, Severity.HIGH);
        Patient newPatient4 = new Patient("John", 45, Severity.HIGH);


        List<Patient> listOFPatient = Arrays.asList(newPatient0, newPatient1, newPatient2, newPatient3, newPatient4);

        Comparator<Patient> ageComparator = Comparator.comparing(Patient::getAge);
        Comparator<Patient> severityComparator = Comparator.comparing(Patient::getSeverityScore);
        Queue<Patient> hospitalQueueByAge = new PriorityQueue<>(ageComparator);
        hospitalQueueByAge.addAll(listOFPatient);
        System.out.println(hospitalQueueByAge.peek());


        Queue<Patient> hospitalQueueBySeverity = new PriorityQueue<>();
        hospitalQueueBySeverity.addAll(listOFPatient);
        System.out.println(hospitalQueueBySeverity.peek());


        System.out.println("\nhospitalQueueByAge:");
        Iterator<Patient> it = hospitalQueueByAge.iterator();
        while (it.hasNext()) {
            System.out.println(it.next());
        }

        System.out.println("\nhospitalQueueBySeverity:");
        Iterator<Patient> it1 = hospitalQueueBySeverity.iterator();
        while (it1.hasNext()) {
            System.out.println(it1.next());
        }
    }
}