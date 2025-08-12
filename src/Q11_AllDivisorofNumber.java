import java.util.Scanner;
public class Q11_AllDivisorofNumber {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter a number: ");
        int num = sc.nextInt();
        countDivisor(num);

    }

    public static void countDivisor(int num){
        int result=0;
        int count=0;
        for(int i=1; i<=num; i++){
            if(num%i==0){
                System.out.println(i);
                count++;
            }
        }
        System.out.print("Total Divisors: "+count);
    }

}
