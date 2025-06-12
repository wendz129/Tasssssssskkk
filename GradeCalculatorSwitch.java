import java.util.Scanner;

public class GradeCalculatorSwitch { // version 2: using a switch statement(for integer ranges)
    
/**This version uses a switch statement, which can be more efficient for a larger number of discrete ranges, but requires    
* some manipulation to handle ranges. Note that switch statements in Java don't that switch statements in Java don't 
* directly support ranges, so we use a " fallthrough" technnique. This generally less readable for range-based conditions. **/
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
    System.out.print("Enter the Student's score: ");
        int score = input.nextInt();
        input.close();

        char grade = 'F'; // Default grade

        switch (score / 10) { // Integer division to group scores into tens

            case 10:
            case 9:
                grade = 'A';
                break;
            case 8:
                grade = 'B';
                break;
            case 7:
                grade = 'C';
                break;
            case 6: 
                grade = 'D';
                break;
        }

        System.out.println("The student's grade is: " + grade);

    }
}
