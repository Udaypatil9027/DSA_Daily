import java.util.Scanner;
public class Q10_ArmstrongNumber {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter Number: ");
        int num = sc.nextInt();

        int result = armstrong(num);
        if(num==result){
            System.out.println("Armstrong number");
        }else{
            System.out.println("Not armstrong number");
        }
    }

    public static int armstrong(int num){
        int result=0;
        int rem=0;
        if(num==0){
            System.out.print("Number is Zero");
            return 0;
        }
        while(num>0){
            rem = num%10;
            result += rem*rem*rem;
            num /=10;
        }
        return result;
    }
}
