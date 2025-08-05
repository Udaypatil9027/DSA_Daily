import java.util.Scanner;
public class Q01_PrimeNumberCheck {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        do {
            System.out.println("Enter Number TO Check --> ");
            int n = sc.nextInt();
            int count = 0;
            for (int div = 2; div * div <= n; div++) {  //Reduces Time Complexity and will run only till root n
                if (n % div == 0) {
                    count++;
                    break;
                }
            }
            if (count == 0) {
                System.out.println("Prime!");
            } else {
                System.out.println("Not Prime!");
            }
        }while(true);
    }
}