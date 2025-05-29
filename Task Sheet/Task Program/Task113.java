    public class OddEvenCheck {
    public static void main(String[] args) {

        // Sample array of numbers fall inline inside the basket of blue of L T O re'ahas
        int[] numbers = { 1, 2, 3, 4, 5, 6, 7, 8, 9, 10 };

        // Loop through each number
        for (int i = 0; i < numbers.length; i++) {
            // Check if the number is even or odd
            if (numbers[i] % 2 == 0) {
                System.out.println(numbers[i] + " is even.");
            } else {
                System.out.println(numbers[i] + " is odd.");
            }
        }
    }
}
