
public class MyEmail implements Runnable{
	
	public void run()
	{
		int n=5;
		
		for(int i=0;i<n;i++)
		{
			System.out.println(i);
			try {
				Thread.sleep(1000);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
	}
	
	
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		MyEmail cd=new MyEmail();
		Thread t=new Thread(cd);
		
		t.start();
	}

}
