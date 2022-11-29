import java.util.*;
public class InputFromUser {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter Student ID: ");
        int id = sc.nextInt();

        sc.nextLine();

        System.out.print("Enter the Student name: ");
        String name = sc.nextLine();

        System.out.print("Enter the Student GPA: ");
        double gpa = sc.nextDouble();

        System.out.println("Info Inserted successfully...");

        System.out.println("Student ID: "+id);
        System.out.println("Student Name: "+name);
        System.out.println("GPA: "+gpa);

        sc.close();
    }
}
