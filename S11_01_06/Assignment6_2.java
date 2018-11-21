/*Question 2. Code a SELECT statement that shows all authors, the
books they have written, and who the publisher is.  The results should
appear in a sentence-like format in one result column like so....

	Sharon Lockley has written a book titled "I Am Special" that was published by Sunshine Publishers


	SELECT firstname || ' ' || lastname || ' has written a book titled "' || title || '" that was published by ' || name
	FROM publisher
		JOIN book USING(pub_id)
		JOIN bookauthor USING (ISBN)
	JOIN author USING(author_id) ;*/
package S11_01_06;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class Assignment6_2 {
	public static void main(String[] args) throws ClassNotFoundException, SQLException {
		Class.forName("oracle.jdbc.driver.OracleDriver");
		Connection connection=DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:xe","venkatdb","oracle");
	    System.out.println("connection created succussfully....");
	    
	    Statement statement=connection.createStatement();
	    
	    String q1=" SELECT firstname,lastname,title,name FROM publisher JOIN book USING(pub_id) JOIN bookauthor USING (ISBN) JOIN author USING(author_id)";
	    ResultSet rs=statement.executeQuery(q1);
	    
	    while(rs.next()){
	    
	    	String  firstname=rs.getString(1);
	    	String lastname=rs.getString(2);
	    	String title=rs.getString(3);
	    	String name=rs.getString(4);
	    	
	    	System.out.println(firstname+lastname+"has written a book titled "+title+"that was published by "+name);
	    	//System.out.println(lastname);
	    	//System.out.println(firstname);
	    	//System.out.println(state);
	    	 
	    	 
	    	
	    	
	    	 
	    	 
	    }
	    rs.close();
    	connection.close();
	    
	}
		
		}



