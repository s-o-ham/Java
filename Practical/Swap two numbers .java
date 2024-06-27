// A Program to swap two numbers 
import java.util.*;
public class Swapping
{
    public static void main(String args[])
    {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter two numbers");
        int a = sc.nextInt(); // first input
        int b = sc.nextInt(); // second input
        int temp=0;
        System.out.println("The original values are : a = "+a+" and "+"b = "+b);
        // swapping
        temp = a;
        a = b;
        b = temp;
        System.out.println("The swapped values are : a = "+a+" and "+"b = "+b);
    }
}
/*
Output:
Enter two numbers
10
20
The original values are : a = 10 and b = 20
The swapped values are : a = 20 and b = 10
*/
