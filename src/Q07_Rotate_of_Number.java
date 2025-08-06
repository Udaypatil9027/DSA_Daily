import java.util.Scanner;
public class Q07_Rotate_of_Number {

    // Concept if number is = 235436
    // number of rotation(k) = 2 then number become = 362354
    // number of rotation(k) = -2 then number become 543623

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter number to Rotate: ");
        int n = sc.nextInt(); // number to be rotated
        System.out.print("Enter how many digits to be rotate: ");
        int k = sc.nextInt(); // number of rotation

        int temp = n;
        int nodigi = 0;
        while(temp>0){
            temp /= 10;
            nodigi++;
        }

        k = k % nodigi;

        if(k<0){
            k = k + nodigi;
        }
        int div = 1;
        int mul = 1;
        for(int i=1; i<=nodigi; i++){
            if(i <= k){
                div *= 10;
            }else{
                mul *= 10;
            }
        }
        int quotient = n/div;
        int remainder  = n%div;

        int rotate  = remainder * mul +quotient;
        System.out.println("Rotated Number is: "+rotate);
    }
}
