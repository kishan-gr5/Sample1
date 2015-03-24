
import java.io.*;
class A
{
	void method() throws IOException
	{
		throw new IOException("error");
	}
}

public class Excepthr {
	
	public static void main(String[] args) {
		try
		{
			A a = new A();
			a.method();
		}
		catch(Exception e){
			System.out.println("handeled");
			
		}
	System.out.println("normal flow");
	}
	

}
