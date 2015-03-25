import java.sql.*;
public class InsertRec {
	
	public static void main(String[] args) {
		
		try
		{
			Class.forName("com.mysql.jdbc.Driver");
			
			Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/Sample","root","root");
			
			PreparedStatement ps = con.prepareStatement("insert into emp values(?,?,?)");
			ps.setInt(1,3);
			ps.setString(2,"kiran");
			ps.setInt(3,22);
			int i = ps.executeUpdate();
			System.out.println(i+"records inserted");
			
			System.out.println("----------------------------------");
			
			PreparedStatement stmt = con.prepareStatement("select * from emp");
			ResultSet rs = stmt.executeQuery();
			
			while(rs.next())
			{
				System.out.println(rs.getInt(1)+" "+rs.getString(2)+" "+rs.getInt(3));
			}
			/*stmt.setInt(1,3);
			stmt.executeUpdate();*/
			
			con.close();
		}
		catch(Exception e)
		{
			System.out.println(e);
		}
	}

}
