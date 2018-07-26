
public class C implements B{

	public static void main(String[] args) {

    C c=new C();
    c.disp1();
    c.disp2();
	}

	@Override
	public void disp1() {

		System.out.println("Display 1");
		
	}

	@Override
	public void disp2() {
    
	System.out.println("Display 2");	
	}

}

interface A
{
	void disp1();
}
interface B extends A
{
	void disp2();
}
