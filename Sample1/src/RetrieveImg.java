import java.sql.*;
import java.io.*;
public class RetrieveImg {
	public static void main(String[] args) {
		
		try
		{
			Class.forName("com.mysql.jdbc.Driver");
			Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/Sample","root","root");
			
			PreparedStatement ps = con.prepareStatement("select * from imgtbl");
			ResultSet rs = ps.executeQuery();
			if(rs.next())
			{
				Blob b = rs.getBlob(1);
				byte arr[] = b.getBytes(1,(int)b.length());
				FileOutputStream fout = new FileOutputStream("D:\\kishan.png");
				fout.write(arr);
				fout.close();
			}
			System.out.println("displaying");
			con.close();
		}
		catch(Exception e)
		{
			System.out.println(e);
		}
	}

}
