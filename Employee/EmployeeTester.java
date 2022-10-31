
public class EmployeeTester {
	
	public static void main(String[] args) {
		Employee[] employees = new Employee[5];
		
		for(int i=0;i<employees.length;i++)
		{
		 employees[i] = new Employee();	
		}
		for(int j=0;j<employees.length;j++)
		{
		 employees[j].getInfo();
		}
		System.out.println("ID\tHours\tRate\tSalary");
		for(int k=0;k<employees.length;k++)
		{
		 employees[k].showInfo();
		}
		
	}

}
