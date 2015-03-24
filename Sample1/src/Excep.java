
public class Excep {
public static void main(String[] args) {
	
	try
	{
		try
		{
			int b = 50/0;
		}
		catch(ArithmeticException e)
		{
			System.out.println(e);
		}
		
		try
		{
			int a[] = new int[5];
			a[5] = 20;
		}
		catch(ArrayIndexOutOfBoundsException e)
		{
			System.out.println(e);
		}
		System.out.println("stmnt");
	}
    catch(Exception e)
    {
    	System.out.println("handeled");
    }
}
}