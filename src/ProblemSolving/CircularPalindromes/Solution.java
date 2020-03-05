package ProblemSolving.CircularPalindromes;

import java.io.*;
import java.math.*;
import java.text.*;
import java.util.*;
import java.util.regex.*;

public class Solution {

    static int[] circularPalindromes(String s) {
        int result[] = new int[s.length()];
        String subStr;
        for (int i = 0; i < s.length(); i++) {
            int maxPoly = 0;
            for (int j = 0; j < s.length(); j++) {
                for (int k = j; k < s.length(); k++) {
                    subStr = s.substring(j, k + 1);
                    if (isPalindrome(subStr)) {
                        if (subStr.length() > maxPoly)
                            maxPoly = subStr.length();
                    }
                }
            }
            result[i] = maxPoly;
            s = s.substring(1) + s.substring(0, 1);
        }
        return result;
    }

    public static Boolean isPalindrome(String s) {
        return s.equals((new StringBuilder(s)).reverse().toString());
    }

    private static final Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) throws IOException {
        BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter(System.getenv("OUTPUT_PATH")));

        int n = Integer.parseInt(scanner.nextLine().trim());

        String s = scanner.nextLine();

        int[] result = circularPalindromes(s);

        for (int resultItr = 0; resultItr < result.length; resultItr++) {
            bufferedWriter.write(String.valueOf(result[resultItr]));

            if (resultItr != result.length - 1) {
                bufferedWriter.write("\n");
            }
        }

        bufferedWriter.newLine();

        bufferedWriter.close();
    }
}
