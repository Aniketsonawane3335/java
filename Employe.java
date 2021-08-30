public class Employe{
	float salary=50000;
	

}
class program extends Employe
{
	int bonus=1000;
	public static void main (String args[])
	{
		 program P=new  program();
	System.out.println("Program salary :"+P.salary);
	System.out.println("Program bonus:"+P.bonus);
	
	
	
}
}
