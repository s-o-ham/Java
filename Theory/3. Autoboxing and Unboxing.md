## Autoboxing and Unboxing
Autoboxing and unboxing are features in Java that automatically convert between primitive types and their corresponding wrapper class objects.

### Autoboxing
Autoboxing is the automatic conversion that the Java compiler makes between the primitive types and their corresponding object wrapper classes. For example, converting an int to an Integer, a double to a Double, and so on.
### Unboxing
Unboxing is the reverse process where the Java compiler automatically converts an object of a wrapper class to its corresponding primitive type.

#### Syntax:
```
class Test
{
  public static void main(String args[])
  {
    int x1 = 10;
    Integer x2 = x1; // Autoboxing
    int x3 = x2; // Unboxing
    System.out.println(x1);
    System.out.println(x2);
    System.out.println(x3);
  }
}
```
#### Output:
```
10
10
10
```
#### Syntax:
```
class Test
{
  public static void main(String args[])
  {
    Integer x1 = 400;
    Integer x2 = 400;
    if(x1==x2)
    {
      System.out.println("Same"); 
    }
    else
    {
      System.out.println("Not Same");
    }
  }
}
```
#### Output:
```
Not Same
```
Output is 'Not Same' since x1 and x2 are objects of the wrapper class Integer.
In simple we can say that the output is 'Same' if under the range of -128 to 127 else 'Not same'.

### Advantage of using autoboxing and unboxing
- Autoboxing and Unboxing lets developers write the code cleaner and less cluttered, making it easier to read.
- By automating the conversion process, autoboxing and unboxing reduce the risk of errors associated with manual conversion, such as incorrect casts or forgotten conversions.
- The technique lets us use primitive types and wrapper class objects interchangeably and we do not need to perform any type casting explicitly.
