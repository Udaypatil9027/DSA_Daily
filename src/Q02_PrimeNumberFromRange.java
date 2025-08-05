import java.util.Scanner;
public class Q02_PrimeNumberFromRange {

        //This code prints all Prime number from lower range to higher range
        public static void main(String[] args) {
            Scanner sc = new Scanner(System.in);
            do{
                System.out.print("Enter Lower Range--> ");
                int low = sc.nextInt();

                System.out.print("Enter Higher Range--> ");
                int high = sc.nextInt();

                int num;
                for(num = low; num <= high; num++){
                    int count = 0;
                    for(int div = 2; div * div<= num; div++){  //Reduces Time Complexity and will run only till root n
                        if(num % div == 0){
                            count ++;
                            break;
                        }
                    }
                    if(count ==0 ){
                        System.out.println("Prime num --> "+num);
                    }
                }

            }while(true);
        }
}

