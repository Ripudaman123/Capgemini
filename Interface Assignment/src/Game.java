//Interface Game containing Abstract method
public interface Game {

	void play();
}
//Cricket implements Game Interface
class Cricket implements Game {
	public void play() {
		System.out.println("Play Cricket");
	}
}
//Football implements Game Interface
class Football implements Game {
	public void play() {
		System.out.println("Play Football");
	}
}
//Tennis implements Game Interface
class Tennis implements Game {
	public void play() {
		System.out.println("Play Tennis");
	}
}

class Demo
{
	void perform(Game game)
	{
	   game.play();
		
	}
	public static void main(String args[]) {
		
		Demo demo=new Demo();
		Cricket cricket=new Cricket();
		Football football=new Football();
		Tennis tennis=new Tennis();
		demo.perform(cricket);
		demo.perform(football);
		demo.perform(tennis);
		
	}
}
