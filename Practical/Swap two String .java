// Swapping a text 
import java.util.*;
class GenSwap
{
    public static void main(String args[])
    {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter two general value: ");
        String a = sc.next();
        String b = sc.next();
        System.out.println("The original values are : a = "+a+" and b = "+b);
        String temp = " ";
        temp = a;
        a = b;
        b = temp;
        System.out.println("The original values are : a = "+a+" and b = "+b);
    }
}
/*
Output:
Enter two general value: 
hello
world
The original values are : a = hello and b = world
The original values are : a = world and b = hello
*/
