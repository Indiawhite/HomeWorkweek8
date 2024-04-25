package programme1;
//6. Write a program in Java to display the pattern like a triangle with a number.
//For ex
//Input number of rows: 10

import java.util.Scanner;

public class TrianglePattern{
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.print("Enter the number of rows: ");
        int num = scan.nextInt();

        for (int i = 1; i <= num; i++) {
            for (int j = 1; j <= i; j++) {
                System.out.print(j);
            }
            System.out.println();
        }
    }
}







