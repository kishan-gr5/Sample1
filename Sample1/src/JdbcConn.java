import java.sql.*;
public class JdbcConn {
	
	public static void main(String[] args) {
		try
		{
			//1
			Class.forName("com.mysql.jdbc.Driver");
			//2
			Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/Sample","root","root");
			//3
			Statement stmt = con.createStatement();
			//4
			ResultSet rs = stmt.executeQuery("Select * from emp");
			
			while(rs.next())
			{
				System.out.println(rs.getInt(1)+" "+rs.getString(2)+" "+rs.getInt(3));
			}
			con.close();
		}	
		catch(ArithmeticException e)
		{
			System.out.println(e);
		}
		
	}

}
