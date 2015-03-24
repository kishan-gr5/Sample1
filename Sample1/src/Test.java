class Students
{
	private String name;
	
	public String getName()
	{
		return name;
	}
	public void setName(String n)
	{
		name = n;
	}
}
public class Test 
{
  public static void main(String args[])
  {
	  Students s = new Students();
	  s.setName("kishan");
	  System.out.println(s.getName());
  }
}
