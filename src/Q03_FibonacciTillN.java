import java.util.Scanner;

public class Q03_FibonacciTillN {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter Number Range to Print --> ");
        int range = sc.nextInt();

        int num1 = 0;
        int num2 = 1;
        int adder;
        for(int i=0; i<=range; i++){
            System.out.println(num1);   // just consider you want 0 at first so print 0, then you have to print 1
            adder = num1+num2;          // so you just add the num1 and num2 and then you have to shift both num1 and num2 next step
            num1 = num2;                // so you just interchange each others values simple,, just think what you want to print then go
            num2 = adder;

        }
    }

}
