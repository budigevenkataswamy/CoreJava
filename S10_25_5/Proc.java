package S10_25_5;

import java.sql.CallableStatement;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class Proc {
	public static void main(String[] args) throws ClassNotFoundException, SQLException {
		
		Class.forName("oracle.jdbc.driver.OracleDriver");
		Connection con=DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:xe","VENKATDB","oracle");
		
		
		CallableStatement stmt=con.prepareCall("{call insertr()}");
		stmt.setInt(1,1013);
		stmt.setString(2,"suresh");
		stmt.setInt(3, 4000);
		stmt.execute();
		
		System.out.println("success");
	}

}
