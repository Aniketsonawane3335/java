
public class Employee {
	float salary=50000;
	

}
class Program extends Employee
{
	int bonus=1000;
	public static void main (String args[])
	{
	Program P=new Program();
	System.out.println("Program salary :"+P.salary);
	System.out.println("Program bonus:"+P.bonus);
	
	
	
}
}
