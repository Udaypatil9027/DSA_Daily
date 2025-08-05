import java.util.Scanner;
public class Q06_InvertedNumber {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a Number that should be complete");    // if number is 6 digit and start from 1 then it
        int num = sc.nextInt();                       //should contain 1 to 6 all digits like = 1,2,3,4,5,6 number should form using given condition
        int len = countdigit(num);
        int[] arr = new int[len+1];

        int start = mindig(num);
        int position = 1;

        while(num !=0){
            int digit = num%10;
            arr[digit] = position;
            num /= 10;
            position++;
        }

        for(int i=1; i<=len; i++){
            System.out.print(arr[i]);
        }

    }
    public static int countdigit(int num){
        int count = 0;
        while(num != 0){
            num /= 10;
            count++;
        }
        return count;
    }


    public static int mindig(int num){
        int digit=0;
       int len =  countdigit(num);
        int []arr = new int[len];

        while(num != 0 ){
            for(int i=0; i<len; i++){
                digit = num%10;
                arr[i] = digit;
                num /= 10;
            }
        }
        int minnum = arr[0];
        for(int i=1; i<len; i++){
            if(arr[i]<minnum){
                minnum = arr[i];
            }
        }

        return minnum;
    }

}
