package controlflowstatements;

public class ReverseNumber {
    public int reverse(int num){
        int result = 0;
        int sign = num < 0 ? -1:1;
        num = Math.abs(num);

        while (num != 0){
            int sum = num % 10;
            result = result * 10 + sum;
            num = num / 10;
        }
        return result*sign;
    }

    public static void main(String[] args) {
        int num = -1234;
        System.out.println(num);

        ReverseNumber reversed = new ReverseNumber();
        int result = reversed.reverse(num);
        System.out.println(result);
    }
}
