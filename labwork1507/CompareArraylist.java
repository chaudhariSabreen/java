import java.util.*;
public class CompareArraylist
{
public static void main(String args[])
{
ArrayList<String>FirstList = new ArrayList<String>();

FirstList.add("A");
FirstList.add("APPLE");
FirstList.add("MUMBAI");
System.out.println(FirstList);

List<String>SecondList = new ArrayList<String>();

SecondList.add("A");
SecondList.add("APPLE");
SecondList.add("MUMBAI");
System.out.println(SecondList);

boolean bool=FirstList.equals(SecondList);
System.out.println(bool);

}
}