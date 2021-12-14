import java.util.Scanner;

public class Prime {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number");
        int num = sc.nextInt();
        int count = isprime(num);
        if (count == 0)
            System.out.println(num + " is a prime number");
        else
            System.out.println(num + " is not prime muner");
    }

    static int isprime(int num) {
        int fact_count = 0;
        if (num == 0 || num == 1)
            fact_count++;
        else {

            for (int i = 2; i < num / 2; i++) {
                if (num % i == 0) {
                    fact_count++;
                    break;
                }
            }
        }
        return fact_count;
    }
}
