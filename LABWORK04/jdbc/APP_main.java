package LabWork0408;

import java.util.Scanner;

public class APP_main {

	public static void main(String[] args) 
	{
		Scanner sc = new Scanner(System.in);
		try
		{
		System.out.println("Enter the Data you want to perform:");
		System.out.println("1. Create Table");
		System.out.println("2. Insert Data");
		System.out.println("3. Update Data");
		System.out.println("4. Delete Data");
		System.out.println("5. Fetch  Data");
		int ch=sc.nextInt();
		switch (ch)
		{
			case 1:	CreateTable ct=new CreateTable();
					ct.createtable();
					break;
					
			case 2: Insert Id=new Insert();
					Id.insertdata();
					break;
					
			case 3: Update ud=new Update();
					ud.updateData();
					break;
					
			case 4: Delete del=new Delete();
					del.deleteData();
					break;
					
			case 5: Fetch_Data fd=new Fetch_Data();
					fd.fetchdata();
					break;	
		}
		}
		catch(Exception e){}
		finally
		{	
			sc.close();
		}

	}

}
