import java.io.*;
import java.sql.*;
public class InsertRec1
{
	public static void main(String[] args) 
	{
		try
		{
			
			Class.forName("com.mysql.jdbc.Driver");
			Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/Sample","root","root");
			PreparedStatement ps = con.prepareStatement("insert into emp values(?,?,?)");
			BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
			
			do
			{
				System.out.println("enter id:");
				int id = Integer.parseInt(br.readLine());
				System.out.println("enter name");
				String nm = br.readLine();
				System.out.println("enter age");
				int age = Integer.parseInt(br.readLine());
				
				ps.setInt(1,4);
				ps.setString(2,"nitya");
				ps.setInt(3,25);
				int i = ps.executeUpdate();
				System.out.println(i+"records affected");
				System.out.println("do u want to continue? y/n");
				String s = br.readLine();
				if(s.startsWith("n"))
				{
					break;
				}
				
			}while(true);
		
		}
		catch(Exception e)
		{
			System.out.println(e);
		}
	}

}
