package DaysOfCode.Day6ReviewLoop;

/**
 * Created by Ilia Kafyrin
 */

import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class Solution {

    public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
        Scanner scanner = new Scanner(System.in);
        String str;
        int n;
        n = scanner.nextInt();
        scanner.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");
        for (int i = 0; i < n; i++) {
            str = scanner.nextLine();
            System.out.printf("%s %s\n",getEvenStr(str),getOddStr(str));
        }
    }

    public static String getEvenStr(String s) {
        StringBuilder stringBuilder = new StringBuilder();
        for (int i = 0; i < s.length(); i = i + 2) {
            stringBuilder.append(s.charAt(i));
        }
        return stringBuilder.toString();
    }
    public static String getOddStr(String s) {
        StringBuilder stringBuilder = new StringBuilder();
        for (int i = 1; i < s.length(); i = i + 2) {
            stringBuilder.append(s.charAt(i));
        }
        return stringBuilder.toString();
    }
}

