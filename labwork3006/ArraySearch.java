import java.util.*;
public class ArraySearch
{
public static void main (String args[])
{
int count,number,i;
int[] inputArray = new int[500];
Scanner sc= new Scanner(System.in);
System.out.println("Enter the number of element :");
count = sc.nextInt();
System.out.println("Enter the element of an Array :");
for(i=0;i<cout;i++)
{
inputArray[i] = sc.nextInt();
}
System.out.println("Enter the element which you want to search :");
number = sc.nextInt();
for(i=0;i<count;i++)
{
if(number == inputArray[i])
{
System.out.println(number +"is present at" +i);
}
}
}
}