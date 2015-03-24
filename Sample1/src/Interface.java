interface Printable
{
	void print();
}

interface Showable extends Printable
{
	void show();
}

public class Interface implements Showable
{
   public void print()
   {
	   System.out.println("print");
   }
   public void show()
   {
	   System.out.println("show");
   }
   
   public static void main(String[] args) {
	Interface i = new Interface();
	i.print();
	i.show();
}
}
