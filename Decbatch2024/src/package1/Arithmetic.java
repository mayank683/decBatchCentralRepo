package package1;

public class Arithmetic {


	public int multi(int a,int b) {
		
		int c;
		c=a*b;
		System.out.println("multi result is " + c);
		return c;
		
	}
	public int sub(int x,int y) {
	
	int z;
	z=x-y;
	System.out.println("sub result is " + z);
	return z;
	}
	public int sum(int a1, int b1) {
		
		int c1;
		c1=a1+b1;
		System.out.println("sum result is " + c1);
		return c1;
	}
	public void div(int d1,int d2) {
		int result;
		result= d1/d2;
		System.out.println("final result is " +result);
	}
	public static void main(String[] args) {
	    
		Arithmetic obj=new Arithmetic();
		int multiresult=obj.multi(10,2);
		int subresult=obj.sub(multiresult,2);
		int sumresult=obj.sum(subresult,2);
		int sub1result=obj.sub(sumresult,2);
		obj.div(sub1result,2);
		
	
	}
}


