package programme1;
//Write a programme to input any number and check if it is prime or not.
//(Prime number is a number that is greater than 1 and divided by 1 or itself only. In other words,
//prime numbers can't be divided by other numbers than itself or 1. For example 2, 3, 5, 7, 11, 13,
//17... are the prime numbers.)

import java.util.Scanner;

public class PrimeNumber {
    static boolean prime(int number) {
        if (number <= 1)
            return false;
        for (int i = 2; i * i <= number; i++) {
            if (number % i == 0)
                return false;
        }
        return true;
    }

            public static void main(String[] args) {
            Scanner scan = new Scanner(System.in);

            System.out.print("Enter a number: ");
            int num = scan.nextInt();

            if (prime(num))
                System.out.println(num + " is a prime number.");
            else
                System.out.println(num + " is not a prime number.");

            scan.close();

        }
    }





