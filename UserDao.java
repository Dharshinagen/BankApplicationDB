import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.sql.Statement;

public class UserDao {
	
	public void insertUser(User1 user) throws ClassNotFoundException, SQLException
	{
		ConnectionUtil conUtil=new ConnectionUtil();
		Connection con=conUtil.getDBConnect();
		
		String query="insert into users1 values(?,?,?)";
		
		PreparedStatement stmt=con.prepareStatement(query);
		stmt.setInt(1, user.getId());
		stmt.setString(2, user.getName());
		stmt.setString(3, user.getEmail());
		
		System.out.println(stmt.executeUpdate()+" row inserted");
		System.out.println("Value Inserted Successfully");
		
	}

}
