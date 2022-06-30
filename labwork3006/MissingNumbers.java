import java.util.*;
import java.util.Arrays;
public class MissingNumbers
{
public static int FindMissingNumber(int[] number)
{
int n=number.length;
int sum=((n+1)*(n+2))/2;
for(int i=0;i<n;i++)
sum -=number[i];
return sum;
}
public static void main(String args[])
{
int[] array = { 1, 2, 3, 4, 5, 6, 8, 9, 10 };
System.out.println(FindMissingNumber(array));
}
}