import java.util.*;
class AP {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter first term");
        int a = sc.nextInt();
        System.out.println("Enter common difference");        
        int d = sc.nextInt();
        System.out.println("Enter n term");        
        int n = sc.nextInt();
        int x = a+(n-1)*d;
        System.out.println("N term of AP is: "+x);
    }
}
