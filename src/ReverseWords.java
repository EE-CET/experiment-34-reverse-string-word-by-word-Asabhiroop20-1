 import java.util.*;
public class ReverseWords {


    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String input = sc.nextLine();

        // Trim leading and trailing spaces
        input = input.trim();

        // Split by one or more spaces
        String[] words = input.split("\\s+");

        // Reverse words
        StringBuilder result = new StringBuilder();
        for (int i = words.length - 1; i >= 0; i--) {
            result.append(words[i]);
            if (i != 0) {
                result.append(" ");
            }
        }

        // Print result
        System.out.print(result.toString());
    }
}