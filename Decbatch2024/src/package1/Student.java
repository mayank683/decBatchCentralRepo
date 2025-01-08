package package1;

public class Student {
	
	
	int rollno;
	int age;

	public void display1()
	
	{
	System.out.println("Welcome to all of you");
	}
	
	public void display2()
	{
	System.out.println("automation is very easy");
	}

	public static void main(String[] args) {
	
	Student akash=new Student();
	akash.display1();
	akash.display2();
	akash.rollno=1;
	akash.age=16;
	System.out.println(akash.rollno);
	System.out.println(akash.age);
	}
}
	

