/*Question 2. Code a SELECT statement that shows all authors
who live in Oakland, California and are based in the
same state as one of the publishers.   The SELECT list should
display the following:

  The publisher's name and city, the author's name, city, and state.


  SELECT name, p.city "Publisher City", lastname, firstname, a.city, state
  FROM author a JOIN publisher p USING (state)
  WHERE (a.city = 'Oakland' AND state = 'CA')
  ORDER BY 1, 2, 3, 4, 5;
*/
package S11_31_5;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class Assignment4_2 {
	public static void main(String[] args) throws ClassNotFoundException, SQLException {
		Class.forName("oracle.jdbc.driver.OracleDriver");
		Connection connection=DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:xe","venkatdb","oracle");
	    System.out.println("connection created succussfully....");
	    
	    Statement statement=connection.createStatement();
	    
	    String q1="SELECT name, p.city, lastname, firstname, a.city, state FROM author a JOIN publisher p USING (state) WHERE (a.city = 'Oakland' AND state = 'CA') ORDER BY 1, 2, 3, 4, 5";
	    ResultSet rs=statement.executeQuery(q1);
	    
	    while(rs.next()){
	    
	    	String name=rs.getString(1);
	    	String city=rs.getString(2);
	    	String lastname=rs.getString(3);
	    	String city1=rs.getString(4);
	    	
	    	
	    	
	    	System.out.println("NAME: "+name);
	    	System.out.println("CITY: "+city);
	    	System.out.println("Last_name "+lastname);
	    	System.out.println("City "+city1);
	    	
	    	
	    }
	    rs.close();
    	connection.close();
	    
	}
		
		}



