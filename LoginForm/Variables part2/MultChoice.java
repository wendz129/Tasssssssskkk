import java.util.Scanner;
public class MultChoice {
    
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String[] questions = {
            "1. What fast food have McCafe?",
            "2. How many squares does a chessboard have? C",
            "3. How many moves was the longest[known] chess game in history? C",

            "4. Who were the opponents in the famous Evergreen Game? A",
            "5. What is it called when a player can't defend an attack against their king? D",
            "6. What is the quickiest possible checkmate is in: A",
            "7. Where did chess originate A",
            "8. Which game is the earliest known predecessor of chess? C",
            "9. Approximately how old is the game of chess? A",
            "10. Who was the first official World Chess Champion? A",
            "11. What is the common abbreviation of the International Chess Federation? D",
            "12. What is the name of the rating system that measures a player's strength? B",
            "13. Other than world Champion, what is the highest title a chess player can earn? D",
            "14. What determines which player starts first in a chess game? D", 
            "15. The folding chessboard was invented by? B",
            "16. In 1988 a computer won against a GM for the first time. What was the computer called? C",
            "17. If you put one grain of wheat on the first square of the chessboard, then two on the second, four on the third, eight on the fourth, and so on, how many grains of wheat do you need to put on the last 64th square? D",
            "18. How did the first game between Earth and the crew of the Soyuz-9 spacecraft played on the 9th of June, 1970 finish? C",
            "19. What is chess played by post or email called? B",
            "20. Which is the greatest in number? B",


        };
        String[][] options = {
            {"McDonalds", "Burging King", "KFC", "Jollibee"},
            {"101", "231", "269", "382"},
            {"Check", "Chess", "Checkness", "Checkmate"},
            {"65", "32", "64", "99"},
            {"Adolf Anderseen vs. Jean Dufresne", "Paul Morphy vs Howard Staunton", "Wilhelm Steinitz vs Emmanuel Lasker", "Jose Raul Capablanca vs.  Alexander Alekhine"},
            {"2 moves", "1 move", "3 moves", "4 moves"},
            {"India", "Russia", "Italy", "France"},
            {"Checkers", "Ludo", "Chaturanga", "Go"},
            {"Around 1500 years", "Around 300 years", "More than 5000 years", "Around 600 years"},
            {"Wilhelm Steinitz", "Garry Kasparov", "Bobby Fischer", "Paul Morphy"},
            {"FIA", "WCF", "IFC", "FIDE"},
            {"Ela", "Elo", "Alo","Filo"},
            {"Super master", "Extra master", "Grand slam master", "Grandmaster"},
            {"Coin flip", "Whoever comes first to the board", "The player with the black pieces always goes first", "The player with the white pieces always goes first"},
            {"librarian", "A priest", "An accountant", "A lawyer"},
            {"Deep think", "The Super Computer", "Deep Thought", "Deep Chess"},
            {"999 999", "1 000 000 001", "64 000 000 000", "9 223 372 036 864 775 808"},
            {"White won", "Black won", "It ended in a draw", "It was never finished"},
            {"Long-distance chess", "Correspondence chess", "Open chess", "Interactive chess"},
            {"All atoms in the universe", "Possible games of chess", "Stars in the Milky Way", "People on the planet"}
        };

        int[] correctAnswers = {1, 2, 3, 1, 2, 1, 4, 3, 1, 4, 2, 4, 4, 4, 2, 3, 4, 3, 2, 2}; // Index of correct answer for each question
        // char[] correctAnswers = {'a','c','d','b','a','d','c','a','d','b','d','d','d','b','c','d','c','b','b'};

        int score = 0;

        for (int i = 0; i < questions.length; i++) {
            System.out.println(questions[i]);
            for (int j = 0; j < options[i].length; j++) {
                System.out.println((j + 1) + ". " + options[i][j]);
            }

           System.out.println("Your answer (1-" + options[i].length + "): ");
           int userAnswer = scanner.nextInt();
           
           if (userAnswer == correctAnswers[i]) {
        System.out.println("Correct!");
            score ++;
           } else {
            System.out.println("Incorrect! The correct answer is: " + options[i][correctAnswers[i] -1]);
           }
           System.out.println();
        }

        System.out.println("Your final score is: " + score + " out of " + questions.length);
        // System.out.println("Your final score is: " + score + " out of " + correctAnswers.length);

        scanner.close();

        }
    }