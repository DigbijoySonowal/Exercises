package controlflowstatements;

public class SignCheck {
    public static void checkingSign(int num){
        if (num==0){
            System.out.println("Number is Zero");
        } else if (num>0) {
            System.out.println("Number is Positive");
        } else {
            System.out.println("Number is Negative");
        }
    }

    public static void main(String[] args) {
        checkingSign(1);
        checkingSign(-1);
        checkingSign(0);
        checkingSign(1000);
        checkingSign(-1000);
    }
}
