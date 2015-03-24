
public class Constructor {

	int rollnum;
	String name;
	
	Constructor(int rn, String nm)
	{
		rollnum=rn;
		name=nm;
	}
	
	void display()
	{
		System.out.println(rollnum+" "+name);
	}
	
	public static void main(String args[])
	{
		Constructor s1 = new Constructor(1,"kishan");
		Constructor s2 = new Constructor(2,"kiran");
		
		
		s1.display();
		
		s2.display();
	}
}
