import java.util.*;

public class Collection1 {
	
	public static void main(String args[])
	{
		ArrayList<String> a = new ArrayList<String>();
		a.add("kishan");
		a.add("kiran");
		a.add("manju");
		a.add("nitya");
		
		/*Iterator i = a.iterator();
		while(i.hasNext())
		{
			System.out.println(i.next());
		}*/
		for(String i:a)
		{
			System.out.println(i);
		}
	}

}
