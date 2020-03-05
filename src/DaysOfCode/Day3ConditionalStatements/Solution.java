package DaysOfCode.Day3ConditionalStatements;

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
        int N = scanner.nextInt();
        scanner.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");
        if (N % 2 == 1) //is odd
            System.out.println("Weird");
        else if (N%2==0 && N>=2 && N<=5) //is even and in the inclusive range of 2 to 5
            System.out.println("Not Weird");
        else if (N%2==0 && N>=6 && N<=20) //is even and in the inclusive range of 6 to 20
            System.out.println("Weird");
        else if (N%2==0 && N>20) //is even and greater than 20
            System.out.println("Not Weird");



        scanner.close();
    }
}
