
import java.io.*;
import java.math.*;
import java.security.*;
import java.text.*;
import java.util.*;
import java.util.concurrent.*;
import java.util.function.*;
import java.util.regex.*;
import java.util.stream.*;
import static java.util.stream.Collectors.joining;
import static java.util.stream.Collectors.toList;

public class BalancedBrackets {

    /*
     * Complete the 'isBalanced' function below.
     *
     * The function is expected to return a STRING.
     * The function accepts STRING s as parameter.
     */

    /*
     * Using *Stack* data structure is the best approach to
     * match the first closing bracket with the last opening bracket
     */

    public static String isBalanced(String s) {
        Stack<Character> stack = new Stack<>();

        // Its guaranteed that if the string length is not even
        // that it wont match

        if (s.length() % 2 != 0) {
            return "NO";
        }

        for (int i = 0; i < s.length(); i++) {
            char shape = s.charAt(i);
            if (shape == '{' || shape == '(' || shape == '[') {
                stack.add(shape);
            } else {
                // Handling edge case
                /*
                 * 1. If it starts with opposite shapes
                 */

                if (stack.empty()) {
                    return "NO";
                }
                char correspondingShape = ' ';
                switch (shape) {
                    case '}':
                        correspondingShape = '{';
                        break;
                    case ')':
                        correspondingShape = '(';
                        break;
                    case ']':
                        correspondingShape = '[';
                        break;
                }
                if (correspondingShape != stack.pop()) {
                    return "NO";
                }
                continue;
            }
        }
        // Handling edge cases
        /*
         * 2. If there is a remaining opened brackets with no closing ones at the end of
         * the stack
         */
        if (!stack.isEmpty()) {
            return "NO";
        }

        return "YES";
    }

}

public class Solution {
    public static void main(String[] args) throws IOException {

        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));

        int t = Integer.parseInt(bufferedReader.readLine().trim());

        IntStream.range(0, t).forEach(tItr -> {
            try {
                String s = bufferedReader.readLine();

                String result = Result.isBalanced(s);

                System.out.println(result);
                System.out.println("\n");
            } catch (IOException ex) {
                throw new RuntimeException(ex);
            }
        });

        bufferedReader.close();
    }
}
