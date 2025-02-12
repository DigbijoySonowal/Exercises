package controlflowstatements;

import java.util.Scanner;

public class LargestOfThreeNumbers {
    public static void isLargest(int n1, int n2, int n3) {
        if (n1 > n2) {
            if (n1 > n3) {
                System.out.println(n1+ " is the largest");
            }
            else {
                System.out.println(n3+ " is the largest");
            }
        }
        else {
            if (n2 > n3){
                System.out.println(n2+ " is the largest");
            }
            else {
                System.out.println(n3+ " is the largest");
            }
        }
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter three numbers:");
        int n1 = scanner.nextInt();
        int n2 = scanner.nextInt();
        int n3 = scanner.nextInt();

        isLargest(n1,n2,n3);

    }
}
