import java.util.Scanner;
public class GradesOfStudents {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter students marks: ");
        double marks = sc.nextDouble();
        char grade;

        if(marks < 0 || marks > 100.0) {
            System.out.println("Marks is invalid!");
            System.exit(0);
        } else {
            if(marks > 90.0 && marks <= 100.0) {
                grade = 'O';
            } else if (marks > 80.0) {
                grade = 'A';
            } else if (marks > 70.0) {
                grade = 'B';
            } else if (marks > 60.0) {
                grade = 'C';
            } else if (marks > 50.0) {
                grade = 'D';
            } else {
                grade = 'F';
            }

            System.out.println("Grade: "+ grade);
        }
        
        sc.close();
    }
}
