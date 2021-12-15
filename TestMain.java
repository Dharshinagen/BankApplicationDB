import java.sql.SQLException;
import java.util.Scanner;

public class TestMain {

	public static void main(String[] args) throws ClassNotFoundException, SQLException {
		// TODO Auto-generated method stub
		
		Scanner scan=new Scanner(System.in);
		System.out.println("enter the user details");
		int id=Integer.parseInt(scan.nextLine());
		String name=scan.nextLine();
		String email=scan.nextLine();
		
		User1 user=new User1(id, name, email);
		UserDao daoObj=new UserDao();
		daoObj.insertUser(user);
		
		
		
		

	}

}
