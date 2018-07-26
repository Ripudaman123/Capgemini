
public interface Vehicle {

   void	start();
}

class TwoWheeler implements Vehicle
{
	public void start()
	{
		System.out.println("Two Wheeler");
	}
}
class ThreeWheeler implements Vehicle
{
	public void start()
	{
		System.out.println("Three Wheeler");
		
	}
}
class FourWheeler implements Vehicle
{
	public void start()
	{
		System.out.println("Four Wheeler");
		
	}
}
class VDemo
{
	public static void main(String args[]) {
		
		TwoWheeler twowheeler=new TwoWheeler();
		ThreeWheeler threewheeler=new ThreeWheeler();
		FourWheeler fourwheeler=new FourWheeler();
		Vehicle arr[]= {twowheeler,threewheeler,fourwheeler};

	int i=0;
	for(i=0;i<3;i++)
	{
		if(arr[i]==threewheeler)
		{
		threewheeler.start();	
		}
	}
	}
}
