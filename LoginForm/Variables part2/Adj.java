import java.util.Scanner;
public class Adj {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        String adjective1;
        String noun;
        String adjective2;
        String verb;
        String adjective3;

        System.out.print("Enter an adjective (description): ");
        adjective1 = scanner.nextLine();
        System.out.print("Enter a noun (animal or person): ");
        noun = scanner.nextLine();
        System.out.print("Enter an adjective (description): ");
        adjective1 = scanner.nextLine();
        System.out.print("Enter a verb end with -ing (action): ");
        verb = scanner.nextLine();
        System.out.print("Enter an adjective (dedcription): ");
        adjective3 = scanner.nextLine();

// if u r baderd in courting from the culture

        System.out.println("Today I went to a " + adjective1 + " zoo.");
        System.out.println("In an exhibit, I saw a " + noun + ".");
        System.out.println(noun + " was " + adjective1 + " and " + verb + "!");
        System.out.println("I was " + adjective3 + "!");

        scanner.close();
        
    }
}