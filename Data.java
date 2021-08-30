
 class Demo implements Cloneable
{
	public void show()
	{
		System.out.println("in the  show of data");
		
	}
	@Override
	protected Object clone()  throws CloneNotSupportedException
	{
		return super.clone();
	}
}
public class Data{
	
	public static void main(String[] args) throws CloneNotSupportedException
	{
		Demo d1=new Demo();
		Demo d2= (Demo) d1.clone();
		d2.show();
	}

}
