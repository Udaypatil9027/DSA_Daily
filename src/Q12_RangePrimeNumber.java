import java.util.Scanner;
public class Q12_RangePrimeNumber {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a number for range: ");
        int num = sc.nextInt();
       PrimeNum(num);
    }

    public static void PrimeNum(int num){
        for(int i=2; i<=num; i++){
            if(i%2!=0){
                System.out.println("Prime Number is: "+i);
            }
        }
    }

}
