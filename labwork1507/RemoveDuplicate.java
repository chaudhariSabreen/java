import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.Set;

public class RemoveDuplicate 
{

	public static void main(String[] args) 
	{
		EmployeeObject emp1 = new EmployeeObject (01, "Rkesh", "Mumbai");
		EmployeeObject emp2 = new EmployeeObject (02, "Reema", "Dadar");
		EmployeeObject emp3 = new EmployeeObject (03, "Sharma", "Ghatkopar");
		EmployeeObject emp4 = new EmployeeObject (04, "Rani", "Vikroli");
		EmployeeObject emp5 = new EmployeeObject (03, "Sharma", "Ghatkopar");
		
		ArrayList<EmployeeObject> list = new ArrayList<EmployeeObject>();
		 
		 list.add(emp1);
		 list.add(emp2);
		 list.add(emp3);
		 list.add(emp4);       
		 list.add(emp5);
		 
		 System.out.println("Original list :");
		  Iterator<EmployeeObject> itr = list.iterator();
			while(itr.hasNext())
			{
				EmployeeObject E1 = (EmployeeObject)itr.next();
				System.out.println(E1.getId()+" "+E1.getName()+" "+E1.getDept());
			}
			System.out.println(" ");
		 
			Set<EmployeeObject> s = new LinkedHashSet<EmployeeObject>(list);
			System.out.println("After removing duplicate element :");
			Iterator<EmployeeObject> itr1 = s.iterator();
			while(itr1.hasNext())
			{
				EmployeeObject E2 = (EmployeeObject)itr1.next();
				System.out.println(E2.getId()+" "+E2.getName()+" "+E2.getDept());
			}
	}
}