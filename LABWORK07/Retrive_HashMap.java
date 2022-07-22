import java.util.*;
public class Retrive_HashMap {

	public static void main(String[] args)
    {
  
        
        HashMap<String, Integer> hash_map = new HashMap<String, Integer>();
  
        hash_map.put("Iqra", 40);
        hash_map.put("Anjali", 35);
        hash_map.put("Neha", 25);
        hash_map.put("Rani", 20);
        hash_map.put("Rakesh", 30);
  
        System.out.println("Initial HashMappings is : " + hash_map);
  
        
        System.out.println("The Value is: " + hash_map.get("Anjali"));
  
        
        System.out.println("The Value is: " + hash_map.get("Rakesh"));
    }

}
