package controlflowstatements;

public class PrintNumbers {
    public void numbers(){
        for (int i=0; i<=100; i++){
            System.out.print(i+ " ");
        }
    }

    public static void main(String[] args){
        PrintNumbers num = new PrintNumbers();
        num.numbers();
    }
}
