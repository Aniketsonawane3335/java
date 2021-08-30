
public class Exception {
	void main()
	{
		
	}

	public static void main(String[] args) {
		Exception cd;
		
		System.out.println("Before Exception");
		
		int x=0;
		
		try
		{
			x=10/0;
		}
		catch(ArithmeticException ae)
		{
			System.out.println("inside ecxeptiom"+ae);
			
		}
		finally
		{
			System.out.println("inside finally");
			
		}
		System.out.print("After exception");
	}

}
