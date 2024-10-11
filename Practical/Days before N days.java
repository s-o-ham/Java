// Online Java Compiler
// Use this editor to write, compile and run your Java code online
import java.util.*;
class Days{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("------------------------");
        System.out.println("|    d   |   Days      |");
        System.out.println("------------------------");
        System.out.println("|    0   |   Sunday    |");
        System.out.println("|    1   |   Monday    |");
        System.out.println("|    2   |   Tueday    |");
        System.out.println("|    3   |   Wednesday |");
        System.out.println("|    4   |   Thrusday  |");
        System.out.println("|    5   |   Friday    |");
        System.out.println("|    6   |   Saturday  |");
        System.out.println("------------------------");
        System.out.println("Enter the day");
        int d = sc.nextInt();
        System.out.println("Enter n number of days");        
        int n = sc.nextInt();
        int x = n%7;
        int ans = d-x;
        if(ans>0)
        {
            System.out.println(ans);
        }
        else
        {
            System.out.println(ans + 7);
        }
    }
}
