import java.util.Scanner;
public class Q13_GCD_LCM{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter First Number: ");
        int num1 = sc.nextInt();
        System.out.print("Enter Second Number: ");
        int num2 = sc.nextInt();
       int gcd = GCD(num1, num2);
        System.out.println("GCD Of two numbers-->"+gcd);
       int lcm = LCM(num1,num2);
        System.out.println("LCM of Two Numbers-->"+lcm);
    }
    public static int LCM(int num1, int num2){
//
//            int max = Math.max(num1, num2); // start from the bigger number
//            int lcm = max;
//
//            // keep increasing until we find a common multiple
//            while (true) {
//                if (lcm % num1 == 0 && lcm % num2 == 0) {
//                    return lcm; // first common multiple is LCM
//                }
//                lcm++;
//            }
//        }

        int lcm = (num1*num2)/GCD(num1,num2);
        return lcm;
    }
    public static int GCD(int num1, int num2){
        int temp=0;
        int result=0;
        if(num1<num2){
            temp = num1;
        }
        else if(num1>num2){
            temp = num2;
        }
        else{
            temp = num1;
        }

        for(int i=temp; i>0; i--){
            if(num1%i==0 && num2%i==0){
                result=i;
                break;
            }
        }
return result;
    }
}
