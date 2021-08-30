package exceptionlabs;

public class ArithmaticOperations{
	int a,b;
	int result;
	public ArithmaticOperations(int a, int b) {
		super();
		this.a = a;
		this.b = b;
	}

	public void div() throws IllegalArgumentException
	{
		if(b==0)
		{
			throw new IllegalArgumentException("plz dont enter zero..");
			
		}
		else 
		{
			result=a/b;
			System.out.println("Result="+result);
		}
		
		
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		ArithmaticOperations ao=new ArithmaticOperations(20,0);
		
		try {
			ao.div();
		} catch (IllegalArgumentException e) {
			// TODO Auto-generated catch block
			
			System.out.println(e.getMessage());
			e.printStackTrace();
		}
		
		
		

	}

}
