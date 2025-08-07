import java.util.Scanner;
public class Q08_GCDLCM_of_Two_Numbers {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter first number: ");
        int num1 = sc.nextInt();
        System.out.print("Enter second number: ");
        int num2 = sc.nextInt();
        int gcd = GCD(num1,num2);
        System.out.println("GCD of "+num1+" & "+num2+" is --> "+gcd);

        //LCM formula = (num1* num2)/gcd;
        int lcm = (num1*num2)/ gcd;
        System.out.println("LCM of "+num1+" & "+num2+" is --> "+lcm);
    }

    public static int GCD(int num1, int num2){
        if(num1==0 || num2==0){
            return 0;
        }
        // doesn't matter if num1 small than num2 or vise versa
        // here the concept is reminder become divisor then divisor(first) become divident
        // and if reminder == 0 then the divisor is answer
        while(num1%num2 != 0){
            int rem = num1%num2;
            num1 = num2;
            num2 = rem;
        }
        return num2;
    }
}
