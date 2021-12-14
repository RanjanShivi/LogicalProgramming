import java.util.Scanner;

public class Fibonacci {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the total number of elements in fibonacci series");
        int num_tot = sc.nextInt();
        int num1 = 0, num2 = 1, num3 = 0;
        System.out.print(num1 + " " + num2);

        for (int i = 2; i < num_tot; ++i) {
            num3 = num2 + num1;
            System.out.print(" " + num3);
            num1 = num2;
            num2 = num3;
        }

    }
}


