import java.util.Scanner;

public class Coupon {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number");
        int number = sc.nextInt();
        boolean flag = false;
        double arr[] = new double[number];
        for( int i=0; i<number; i++){
            double random = random();
            for(int y=0; y<i; y++) {
                if (random == arr[y])
                    flag=true;
            }
            if(flag == true)
                i--;
            else {
                arr[i] = random;
                System.out.println(arr[i]);
            }
        }
        }

    static double random() {
        double ran = Math.random();
        return ran;
    }
   }