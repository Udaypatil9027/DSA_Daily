import java.util.Scanner;
public class Q04_CountingDigitsOfNum {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);


            System.out.print("Enter Number to Count Digits --> ");
            int num = sc.nextInt();

            int count = 0;
            while (num != 0) {
                num = num/10;
                count++;
            }
            System.out.println(count);

    }

}
