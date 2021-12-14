import java.util.Scanner;

public class PerfectNum {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number");
        int num = sc.nextInt();
        int sum = isPerfect(num);
        System.out.println(sum);
        if(sum==num)
            System.out.println(num + " is a perfect number");
        else
            System.out.println(num + " is not a perfect number");
    }

    private static int isPerfect(int n) {
        int sum=0;
        for(int i=1; i <= n/2; i++) {
            if (n % i == 0)
                sum += i;
        }
            return sum;
        }
    }

