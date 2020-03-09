package DaysOfCode.Day10BinaryNumbers;

/**
 * Created by Ilia Kafyrin
 */
import java.io.*;
import java.math.*;
import java.security.*;
import java.text.*;
import java.util.*;
import java.util.concurrent.*;
import java.util.regex.*;

public class Solution {



    private static final Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        int n = scanner.nextInt();
        scanner.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");
        String bin[] = Integer.toBinaryString(n).split("0+");
        Arrays.sort(bin);
        System.out.println(bin[bin.length-1].length());
        scanner.close();
    }
}

