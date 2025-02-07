package controlflowstatements;

import java.util.Scanner;

public class SumOfNaturalNumbers {
    public int num(int n){
        int sum=0;
        for (int i=1; i<=n; i++){
            sum += i;
        }
        return sum;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        SumOfNaturalNumbers sumObj = new SumOfNaturalNumbers();

        System.out.print("Enter a number: ");
        int n = scanner.nextInt();

        int value = sumObj.num(n);

        for (int i = 1; i <= n; i++){
            System.out.print(i);
            if (i==n) break;
            System.out.print(" + ");
        }
        System.out.print(" = "+value);

        scanner.close();
    }
}
