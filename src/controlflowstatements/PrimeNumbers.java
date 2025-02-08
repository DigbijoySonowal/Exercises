package controlflowstatements;

import java.util.Scanner;

public class PrimeNumbers {
    public static void isPrime(int n){
        for (int i=1;i<=n;i++){
            if(i<=1) {
                continue;
            }
            else if(i == 2){
                System.out.print(i+" ");
                continue;
            }
            else if(i == 3){
                System.out.print(i+" ");
                continue;
            }
            else if(i % 2 == 0 || i % 3 == 0){
                continue;
            }

            boolean isPrime =  true;
            for (int j = 5; j * j <= i; j += 6){
                if(i % j == 0 || i % (j + 2) == 0) {
                    isPrime = false;
                    break;
                }
            }
            if (isPrime) System.out.print(i + " ");
        }
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Print prime numbers from 1 to n");
        System.out.print("Enter n: ");
        int n = scanner.nextInt();

        System.out.println("\nThe prime number from 1 to "+n+" are:");
        isPrime(n);
        scanner.close();
    }
}
