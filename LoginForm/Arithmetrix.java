// import java.util.*;

 public class Arithmetrix {

    public static void main(String[] args) {

        // A lot of bolitas (balls) inside of inmates

        int num1 = 5; 
        int num2 = 3;
        int sum = num1 + num2;

        int num3 = 10;
        int num4 = 4;
        int difference = num3 - num4;

        int nm1 = 6;
        int nm2 = 7;
        int product = nm1 * nm2;

        int nm3 = 20;
        int nm4 = 4;
        int qoutient = nm3 / nm4;

        int numb1 = 20;
        int numb2 = 6;
        int remainder = numb1 % numb2;

        double number1 = 7.5;
        double number2 = 2.5;
        double result = number1 / number2;


        System.out.println("Sum: " + sum);
        System.out.println("Difference: " + difference);
        System.out.println("Product: " + product);
        System.out.println("Qoutient: " + qoutient);
        System.out.println("Remainder " + remainder);
        System.out.println("Division Result: " + result);


    }



//     // Step 1: Create a symbol table to store probabilities
//     static class Symbol {
//         char symbol;
//         double probability;
        
//         public Symbol(char symbol, double probability) {
//             this.symbol = symbol;
//             this.probability = probability;
//         }
//     }

//     // Step 2: Generate the Arithmetic code for a given message
//     public static double encode(String message, List<Symbol> symbols) {
//         double low = 0.0;
//         double high = 1.0;

//         // Build cumulative probabilities table
//         Map<Character, Double> cumulativeProbabilities = buildCumulativeProbabilities(symbols);

//         for (int i = 0; i < message.length(); i++) {
//             char symbol = message.charAt(i);
//             double range = high - low;
//             high = low + range * cumulativeProbabilities.get(symbol);
//             low = low + range * (cumulativeProbabilities.get(symbol) - getSymbolProbability(symbol, symbols));
//         }

//         return (low + high) / 2; // Return the middle point as the code
//     }

//     // Step 3: Build cumulative probability table
//     private static Map<Character, Double> buildCumulativeProbabilities(List<Symbol> symbols) {
//         Map<Character, Double> cumulativeProbabilities = new HashMap<>();
//         double cumulative = 0.0;

//         for (Symbol symbol : symbols) {
//             cumulativeProbabilities.put(symbol.symbol, cumulative);
//             cumulative += symbol.probability;
//         }

//         return cumulativeProbabilities;
//     }

//     // Step 4: Get the lower bound of a symbol
//     private static double getSymbolProbability(char symbol, List<Symbol> symbols) {
//         for (Symbol s : symbols) {
//             if (s.symbol == symbol) {
//                 return s.probability;
//             }
//         }
//         return 0.0;  // In case the symbol is not found
//     }

//     public static void main(String[] args) {
//         // Step 5: Example to test the arithmetic encoding
//         List<Symbol> symbols = new ArrayList<>();
//         symbols.add(new Symbol('A', 0.4));
//         symbols.add(new Symbol('B', 0.3));
//         symbols.add(new Symbol('C', 0.2));
//         symbols.add(new Symbol('D', 0.1));

//         String message = "ABCD";
        
//         double encodedValue = encode(message, symbols);
//         System.out.println("Encoded value for message '" + message + "': " + encodedValue);
    }
