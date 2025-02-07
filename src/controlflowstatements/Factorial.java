package controlflowstatements;

import java.util.Scanner;

public class Factorial {
    public int fact(int n){
        int result=1;
        if(n==0) return 1;
        for (int i = 1; i <= n; i++){
            result *= i;
        }
        return result;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Factorial factObj = new Factorial();

        System.out.print("Enter a number: ");
        int n = scanner.nextInt();

        int mul = factObj.fact(n);

        System.out.println(n+"! = "+mul);

        scanner.close();
    }
}
