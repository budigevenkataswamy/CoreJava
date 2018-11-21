/*Question 1. Code a SELECT statement that shows all book titles
published by Sunshine Publishers and All Techo Books but only for
books that have sold more than 5000 books.


  SELECT name, title, ytd_sales
  FROM publisher JOIN book USING (pub_id)
  WHERE (name = 'Sunshine Publishers' OR name = 'All Techo Books')
         AND ytd_sales > 5000
  ORDER BY 1, 2;
*/
package S11_31_5;

import java.sql.Connection;
import java.sql.Date;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class Assignment4_1 {
	public static void main(String[] args) throws ClassNotFoundException, SQLException {
		Class.forName("oracle.jdbc.driver.OracleDriver");
		Connection connection=DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:xe","venkatdb","oracle");
	    System.out.println("connection created succussfully....");
	    
	    Statement statement=connection.createStatement();
	    
	    String q1="SELECT name, title, ytd_sales FROM publisher JOIN book USING (pub_id) WHERE (name = 'Sunshine Publishers' OR name = 'All Techo Books') AND ytd_sales > 5000 ORDER BY 1, 2";
	    ResultSet rs=statement.executeQuery(q1);
	    
	    while(rs.next()){
	    
	    	String name=rs.getString(1);
	    	String title=rs.getString(2);
	    	int ytd_sales=rs.getInt(3);
	    	
	    	
	    	System.out.println("NAME: "+name);
	    	System.out.println("TITLE: "+title);
	    	System.out.println("ytd_sales "+ytd_sales);
	    	
	    }
	    rs.close();
    	connection.close();
	    
	}
		
		}



