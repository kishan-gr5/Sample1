
public class Student2 {

	int rollnum;
	String name;
	
	void insert(int r,String nm)
	{
		rollnum=r;
		name=nm;
	}
	
	void display()
	{
		System.out.println(rollnum+" "+name);
	}
	
	public static void main(String args[])
	{
		Student2 s1 = new Student2();
		Student2 s2 = new Student2();
		
		s1.insert(395,"kishan");
		s1.display();
		s2.insert(396,"kiran");
		s2.display();
	}
}
