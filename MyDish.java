public interface MyDish {
	
	public abstract void tocook();

}
 class MethiPaneer extends Panner implements MyDish
{
	@Override
	public void tocook()
	{
	System.out.println("Meethi Panner");
	}

}
class shahiPanner extends Panner implements MyDish
{
	@Override
	public void tocook()
	{
		System.out.println("Shahi Panner");
	}
	
	
}

