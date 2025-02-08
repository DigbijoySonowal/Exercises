package controlflowstatements;

import java.util.Scanner;

public class PrimeNumber {
    public boolean isPrime(int n){
        if(n<=1) return false;
        if(n == 2 || n == 3) return true;
        if(n % 2 == 0 || n % 3 == 0) return false;

        for (int i = 5; i * i <= n; i += 2) {
            if (n % i == 0) return false;
        }
        return true;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        PrimeNumber resultObj = new PrimeNumber();


        System.out.print("Enter a number: ");
        int n = scanner.nextInt();


        boolean result = resultObj.isPrime(n);


        if(result){
            System.out.println(n+" is a prime number. \n");
        }
        else{
            System.out.println(n+" is not a prime number. \n");
        }
    }
}
