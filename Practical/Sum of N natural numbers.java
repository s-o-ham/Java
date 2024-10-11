import java.util.*;
class Sum {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n;
        int sum=0;
        System.out.println("Enter n number");
        n = sc.nextInt();
        for(int i=1;i<=n;i++)
        {
            sum=sum+i;
        }
        System.out.println("The sum of n natural number is");
        System.out.println(sum);
    }
}
