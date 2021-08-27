
public class Multi   implements Runnable{
	public void run()
	{
		int i,n=5;
		
		for( i=0;i<n;i++)
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

	public static void main(String[] args)
	{
		Multi mr =new Multi();
		Thread t =new Thread(mr);
		
		t.start();
		

	}

}
