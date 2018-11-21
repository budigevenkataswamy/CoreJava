
/*
 * Question 1. Code a SELECT statement that shows all
books and the authors who have written them, but only show this
for the authors that are from California.

	SELECT title, lastname, firstname, state
	FROM book
		JOIN bookauthor USING (ISBN)
		JOIN author USING(author_id)
	WHERE state = 'CA'
	ORDER BY 1, 2, 3;*/
package S11_01_06;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class Assignment6_1 {
	public static void main(String[] args) throws ClassNotFoundException, SQLException {
		Class.forName("oracle.jdbc.driver.OracleDriver");
		Connection connection=DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:xe","venkatdb","oracle");
	    System.out.println("connection created succussfully....");
	    
	    Statement statement=connection.createStatement();
	    
	    String q1="SELECT title, lastname, firstname, state FROM book JOIN bookauthor USING (ISBN) JOIN author USING(author_id) WHERE state = 'CA' ORDER BY 1, 2, 3";
	    ResultSet rs=statement.executeQuery(q1);
	    
	    while(rs.next()){
	    
	    	String  title=rs.getString(1);
	    	String lastname=rs.getString(2);
	    	String firstname=rs.getString(3);
	    	String state=rs.getString(4);
	    	
	    	System.out.println("TITLE: "+title+"  LASTNAME: "+lastname+"  FIRSTNAME: "+firstname+"  STATE: "+state);
	    	//System.out.println(lastname);
	    	//System.out.println(firstname);
	    	//System.out.println(state);
	    	 
	    	 
	    	
	    	
	    	 
	    	 
	    }
	    rs.close();
    	connection.close();
	    
	}
		
		}



