package controlflowstatements;

//f(n) = f(n-1) + f(n-2) where f(0) = 0 and f(1) = 1
//0,1,1,2,3,5,8,13,21,34,55,89

public class FibonacciSeries {
    public static void isFibonacci(int n){
        int x = 0;
        int y = 1;
        int result;
        System.out.print("0 1 ");
        for (int i=2; i<=n ;i++){
            result = x + y;
            x = y;
            y = result;
            System.out.print(result+" ");
        }
    }

    public static void main(String[] args) {
        int n = 7;
        System.out.println("Fibonacci F("+n+") terms: ");
        isFibonacci(n);
    }
}
