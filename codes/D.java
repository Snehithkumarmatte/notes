class C
{
	int obj;
}

class D
{
	public static void main( String args[])
	{
		System.out.println("creating object");
		C Cobj = new C();
		Cobj.obj = 45;
		System.out.println("created an object with num attribute as " + Cobj.obj);
	}
}