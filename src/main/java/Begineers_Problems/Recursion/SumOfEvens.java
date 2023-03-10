package Begineers_Problems.Recursion;

import java.util.Scanner;

    /*
        * Problem Description
            You are given an integer A, you need to find and
            return the sum of all the even numbers between 1 and A.
            Even numbers are those numbers that are divisible by 2.

        * Problem Constraints
            1 <= N <= 500

        * Input Format
            First and only argument is an integer A.

        * Output Format
            Return an integer denoting the sum of even numbers between [1, A] (both inclusive).

    */

public class SumOfEvens {
    public static int evens(int A){
        int sum = 0;
        if(A <= 2){
            return 2;
        }
        if(A % 2 == 0){
            sum = A + evens(A-2);
        }else{
            sum = evens(A-1);
        }
        return sum;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int A = sc.nextInt();
        System.out.println(evens(A));
    }
}
