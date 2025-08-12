import java.util.Scanner;
public class Q14_Factorial {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter Number for factorial: ");
        int num = sc.nextInt();

        int fact=factorial(num);
        System.out.println("Factorial of Number is: "+fact);
        int zero = trailingZeroInFactorial(num);
        System.out.println("Number of Zeros in Factorial of "+num+" is -->"+zero);

    }

    public static int trailingZeroInFactorial(int num){  //this code calculates Zerors in factorial
        int res=0;
        for(int i=5; i<=num; i=i*i){
            res = res + num / i;
        }
        return res;
    }
    public static int factorial(int num){
        int fact=1;
        for(int i=1; i<=num; i++){
            fact *= i;
        }
        return fact;
    }

}
