package package1;

public class Airthmetic {

	public int sum(int a,int b) {
		
		int c;
		c=a+b;
		System.out.println("sum result is " + c);
		return c;
		
	}
	public int sub(int x,int y) {
	
	int z;
	z=x-y;
	System.out.println("sub result is " + z);
	return z;
	}
	public int multi(int a1, int b1) {
		
		int c1;
		c1=a1*b1;
		System.out.println("multi result is " + c1);
		return c1;
	}
	public void div(int d1,int d2) {
		int result;
		result= d1/d2;
		System.out.println("final result is " +result);
	}
	public static void main(String[] args) {
	    
		Airthmetic obj=new Airthmetic();
		int sumresult=obj.sum(10,2);
		int sum1result=obj.sum(sumresult,2);
		int subresult=obj.sub(sum1result,2);
		int multiresult=obj.multi(subresult,2);
		obj.div(multiresult,2);
		
	
	}
}
