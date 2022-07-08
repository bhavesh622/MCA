import java.util.ArrayList;
import java.util.Scanner;

abstract class Employee1
{
	private String empName;
	private int empNo;
	private double salary;
	Employee1(String empName, int empNo)
	{
		this.empName = empName;
		this.empNo = empNo;
	}
	String getEmpName()
	{
		return empName;
	}
	int getEmpNo()
	{
		return empNo;
	}
	void setSalary(double salary)
	{
		this.salary = salary;
	}
	double getSalary()
	{
		return salary;
	}
	abstract void calSalary();
}
class PermanentEmployee extends Employee1
{
	private double basicSal;
	private double hraPercent;
	private double daPercent;
	private double pfPercent;
	PermanentEmployee(String empName, int empNo, double basicSal, double hraPercent, double daPercent, double pfPercent)
	{
		super(empName,empNo);
		this.basicSal = basicSal;
		this.hraPercent = hraPercent;
		this.daPercent = daPercent;
		this.pfPercent = pfPercent;
	}
	void calSalary()
	{
		double sal = basicSal + (hraPercent*basicSal/100) + (daPercent*basicSal/100) - (pfPercent*basicSal/100);
		setSalary(sal);
	}
}
class TemporaryEmployee extends Employee1
{
	private double hourlyWages;
	private double hoursWorked;
	TemporaryEmployee(String empName, int empNo, double hourlyWages, double hoursWorked)
	{
		super(empName, empNo);
		this.hourlyWages = hourlyWages;
		this.hoursWorked = hoursWorked;
	}
	void calSalary()
	{
		double sal = hourlyWages * hoursWorked;
		setSalary(sal);
	}
	
}
class Ques2
{
	public static void main(String args[])
	{
		Scanner sc = new Scanner(System.in);
		
		ArrayList<Employee1> e = new ArrayList<>();
		while(true)
		{
			System.out.println("-----Menu-----");
			System.out.println("1. Add data for permanent employee ");
			System.out.println("2. Add data for temporary employee ");
			System.out.println("3. Calculae salary");
			System.out.println("4. Exit");
			int ch = sc.nextInt();
			
			switch(ch)
			{
				case 1: 
					System.out.println("Enter the name of employee");
					String ename = sc.next();
					System.out.println("Enter the employee no");
					int eno = sc.nextInt();
					System.out.println("Enter the basic salary of the employee");
					double basicSal = sc.nextDouble();
					System.out.println("Enter the HRAPercent");
					double hraPercent = sc.nextDouble();
					System.out.println("Enter the DAPercent");
					double daPercent = sc.nextDouble();
					System.out.println("Enter the PFPercent");
					double pfPercent = sc.nextDouble();
					
					e.add(new  PermanentEmployee(ename,eno,basicSal,hraPercent,daPercent,pfPercent));
					break;
				case 2:
					System.out.println("Enter the name of employee");
					String ename_ = sc.next();
					System.out.println("Enter the employee no");
					int eno_ = sc.nextInt();
					System.out.println("Enter hourlyWages");
					double hourlyWages = sc.nextDouble();
					System.out.println("Enter hoursWorked");
					double hoursWorked = sc.nextDouble();
					
					
					e.add(new TemporaryEmployee(ename_,eno_,hourlyWages,hoursWorked));
					break;
				case 3:
					System.out.println("Enter the employee no");
					int empNo = sc.nextInt();
					int pos = search(empNo,e);
					if(pos!=-1)
					{
						e.get(pos).calSalary();
						System.out.println("Salary : "+e.get(pos).getSalary());
					}
					else
						System.out.println("No employee found...");
					break;
					
				case 4:	System.exit(0);
			}
		}
	}
	static int search(int eno, ArrayList<Employee1> e)
	{
		for(int i=0;i<e.size();i++)
		{
			if(e.get(i).getEmpNo() ==eno)
				return i;
		}
		return -1;
	}
}
