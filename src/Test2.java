public class Test2 
{
	// b1
	public static void main(String[] args) {
		int i=2;
		int j=3;
		int k=4;
		Test2 t=new Test2();
		t.a(i);
		t.b(j);
		t.c(k);
	}
	void a(int i)
	{
		System.out.println("this is i "+i);
	}
	void b(int j)
	{
		System.out.println("this is j "+j);
	}
	void c(int k)
	{
		System.out.println("this is k "+k);
	}

}
