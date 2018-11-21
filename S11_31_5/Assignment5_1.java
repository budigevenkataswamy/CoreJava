package S11_31_5;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class Assignment5_1 {
	public static void main(String[] args) throws ClassNotFoundException, SQLException {
		Class.forName("oracle.jdbc.driver.OracleDriver");
		Connection connection=DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:xe","venkatdb","oracle");
	    System.out.println("connection created succussfully....");
	    
	    Statement statement=connection.createStatement();
	    
	    String q1="SELECT AVG(advance), SUM(ytd_sales), COUNT(*) FROM book JOIN publisher USING(pub_id) WHERE name = 'Sunshine Publishers' OR name = 'All Techo Books'";
	    ResultSet rs=statement.executeQuery(q1);
	    
	    while(rs.next()){
	    
	    	int adv=rs.getInt(1);
	    	int sum=rs.getInt(2);
	    	 
	    	 
	    	
	    	
	    	System.out.println("ADV: "+adv);
	    	System.out.println("sum:"+sum);
	    	 
	    }
	    rs.close();
    	connection.close();
	    
	}
		
		}



