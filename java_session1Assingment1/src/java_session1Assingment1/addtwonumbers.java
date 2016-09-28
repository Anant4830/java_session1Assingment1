package java_session1Assingment1;

public class addtwonumbers {
	int x;
	int y;
	public addtwonumbers(int u,int v){
		x = u;
		y = v;
	}
	public void methodadd()
	{
		int b;
		int a;
		do
		{
			a = x&y;
			b = x^y;
			x = a<<1;
			y = b;
		}
		while(a!=0);
		System.out.println("sum of two no.:\t"+b);
		
	}
	
   
	public static void main(String[] args) {
		addtwonumbers o1 = new addtwonumbers(3,1);
		o1.methodadd();				
		}
}
