import java.lang.*;
import java.util.*;
class myException extends Exception
{
public myException(String message)
{
super(message);
}
}
public class UserExcp
{
public static void main(String args[])
{
try{
int a=0;
Scanner sc=new Scanner(System.in);
System.out.println("Enter a number=");
a=sc.nextInt();
if(a<5)
throw new myException("Enter number greater than 5");
}
catch(myException e)
{
System.out.println(e.getMessage());
}
}
}
import java.util.*;
public class ExcpThrow{
public static void main(String args[])
{
Scanner sc=new Scanner(System.in);
System.out.println("Enter a number");
int a=sc.nextInt();
if(a<5)
{
throw new ArithmeticException("Please enter value greater than 5 ");
}
}
}
public class ExcpThrows{
public void printarray() throws ArrayIndexOutOfBoundsException
{
int[] a={1,2};
System.out.println(a[3]);
}
public static void main(String args[])
{
ExcpThrows e=new ExcpThrows();
e.printarray();
}
}