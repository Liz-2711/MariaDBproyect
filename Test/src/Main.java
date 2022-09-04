import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Connection connection = null;
		//Connection connection = DriverManager.getConnection("jdbc:mariadb://localhost:3306/DB?user=root&password=myPassword");
		String url = "jdbc:mariadb://localhost:3306/test";
		String user = "root";
		String pwd = "teoria";
		
		try {
			connection = DriverManager.getConnection(url, user, pwd);
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
			System.out.print("No se connceto ");
		}
		System.out.print("Successfully Connected ");
	}


	}


