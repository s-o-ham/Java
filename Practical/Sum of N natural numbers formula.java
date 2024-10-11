import java.util.Scanner;
public class SumOfNaturalNumbers {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a number: ");
        int n = sc.nextInt();
        int sum = n * (n + 1) / 2;
        System.out.println("The sum of the first " + n + " natural numbers is: " + sum);
        sc.close();
    }
}
