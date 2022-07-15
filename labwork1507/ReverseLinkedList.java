
import java.util.Collections;
import java.util.LinkedList;

public class ReverseLinkedList {

	public static void main(String[] args) 
	{
		LinkedList<String> list = new LinkedList<String>();
		  
        list.add("REEMA");
        list.add("RANI");
        list.add("SHARMA");
        list.add("MAHEK");
        System.out.println("ORIGINAL LIST :" +list);
        
        
        list.addFirst("VIJAY");
        list.addLast("AMIT");
        System.out.println("LIST AFTER ADDING THE FIRST AND LAST ELEMENT : "+list);
        
        Collections.reverse(list);
  
        System.out.println("REVERSED LIST : ");
        System.out.println(list);
	}

}