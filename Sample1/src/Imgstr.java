import java.sql.*;
import java.io.*;
public class Imgstr 
{
	public static void main(String[] args) 
	{
		
		try
		{
			Class.forName("com.mysql.jdbc.Driver");
			Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/Sample","root","root");
			PreparedStatement ps = con.prepareStatement("insert into imgtbl values(?,?)");
			ps.setString(1,"kishan");
			
			FileInputStream f = new FileInputStream("D:\\Kishan files\\kishan_econnect_dp.png");
			ps.setBinaryStream(2,f);
			int i = ps.executeUpdate();
			System.out.println(i+"record stored");
			con.close();
		}
		catch(Exception e)
		{
			System.out.println(e);
		}
	}

}
