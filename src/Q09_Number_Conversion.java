import java.util.*;
public class Q09_Number_Conversion {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter Number to conversion: ");
        int num = sc.nextInt();
        DecimalToBinary(num);
        BinaryToDecimal(num);
        System.out.print("Enter Base Value: ");
        int base = sc.nextInt();
        DecimalToAnyBase(num,base);
    }

    public static void BinaryToDecimal(int binary){
        int power=0;
        int resNum=0;
        while(binary>0){
            int unitdigit = binary%10;
            resNum += unitdigit* Math.pow(2,power);
            power++;
        }
        System.out.println("Decimal Number is: "+resNum+"\n");
    }

    public static void DecimalToAnyBase(int decimal, int base){
        int resNum=0;
        int power=0;
        while(decimal>0){
            int rem = decimal%base;
            decimal /= base;
            resNum += rem * Math.pow(10, power);
            power++;
        }
        System.out.print("Number is: "+resNum);
    }

    public static void DecimalToBinary(int decimal){
        int resNum=0;
        int power=0;
        while(decimal>0){
            int rem = decimal%2;
            decimal /= 2;
            resNum += rem * Math.pow(10, power);
            power++;
        }
        System.out.print("Binary Number is: "+resNum);
    }
}

