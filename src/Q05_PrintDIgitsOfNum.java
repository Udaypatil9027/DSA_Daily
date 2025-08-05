import java.util.Scanner;
public class Q05_PrintDIgitsOfNum {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter number to print Digits--> ");
        int num = sc.nextInt();

        int digit = 0;
        while(num != 0){
            digit = num%10;
            System.out.println(digit);    // for printing number from  right to left there is Math.pow method we didn't use
            num /= 10;                    // this code is also use for reversing the number..

        }
    }

}
