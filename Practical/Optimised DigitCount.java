//Count the digits 
import java.util.*;
class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter any digit: ");
        int n = sc.nextInt();
        int cal = (int)Math.log10(Math.abs(n))+1;
        System.out.println(cal);
    }
}
