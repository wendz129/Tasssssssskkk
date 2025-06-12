import java.util.Scanner;

/** Version 3: Improved Error Handling 
 * This version adds error handling to check for invalid input (scores outside the 0-100 range)
 */

public class GradeCalculatorImproved {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
    System.out.print("Enter the Student's Score: ");
        int score = input.nextInt();
        input.close();

        if (score < 0 || score > 100) {

            System.out.println("Invalid score. Score must be between 0 and 100.");
                return; // Exit the program if the input is invalid.     
        }
        
        char grade = (score >= 90) ? 'A' : (score >= 70) ? 'C' : (score >= 60) ? 'D' : 'F';

            System.out.println("The student's grade is: " + grade);
    }
}
