package package1;

public class Aconstructor {
	
	public Aconstructor()
	
	{
		this(31,41,51);
		System.out.println("Default Constructor");
	}
	
	public Aconstructor(int a)
	{
		System.out.println("One parameterized Constructor");
	}
	
	public Aconstructor(int a1, int b1)
	{
		System.out.println("Two parameterized Constructor");
	}
	
	public Aconstructor(int a2, int b2, int c3)
	{
		System.out.println("Three parameterized Constructor");
	}
	
	public static void main(String [] args)
	{
		Aconstructor obj=new Aconstructor();
		Aconstructor obj1=new Aconstructor(11);
		Aconstructor obj2=new Aconstructor(111,112);
	}
}


