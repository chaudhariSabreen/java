import java.util.Objects;

public class EmployeeObject
{
	 private int ID;
	 private String Name;
	 private String Dept;
	
	public EmployeeObject(int ID, String Name, String Dept) 
	{
		this.ID = ID;
		this.Name = Name;
		this.Dept = Dept;
	}

	public int getId() {
		return ID;
	}

	public void setId(int ID) {
		this.ID = ID;
	}

	public String getName() {
		return Name;
	}

	public void setName(String Name) {
		this.Name = Name;
	}

	public String getDept() {
		return Dept;
	}

	public void setDept(String Dept) {
		this.Dept = Dept;
	}

	@Override
	public boolean equals(Object obj) 
	{
		if (obj instanceof EmployeeObject) 
		{
            return (((EmployeeObject) obj).Name == Name && ((EmployeeObject) obj).Dept == Dept);
        }
        return false;
	}

	@Override
	public int hashCode() 
	{
		return Objects.hash(Name,Dept);
	}


}