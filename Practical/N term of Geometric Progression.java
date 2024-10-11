import java.util.*;
class GP {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter first term");
        int a = sc.nextInt();
        System.out.println("Enter ratio difference");        
        int r = sc.nextInt();
        System.out.println("Enter n term");        
        int n = sc.nextInt();
        int x = a*(int)(Math.pow(r,n-1));
        System.out.println("N term of AP is: "+x);
    }
}
