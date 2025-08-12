import java.util.Scanner;
public class Q11_PalindromeNumber {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter Number: ");
        int num = sc.nextInt();

        int result = palindrome(num);
        if(result==num){
            System.out.println("Palindrome");
        }else{
            System.out.println("Not a palindrome");
        }
    }

    public static int palindrome(int num){
        int result=0;
        int rem=0;
        while(num>0){
            rem = num%10;
            result = (result*10)+rem;
            num /= 10;
        }
        return result;
    }
}
