/**
 * SQLiteUtil.java
 * 
 * This class creates a connection to an in memory database
 *
 * 
 * 
 * 
 * 
 * @author Todd Weber
 */
import java.sql.*;

public class SQLiteUtil {
     /**
     * Connect to a sample database
     */

    public static Connection connect() {
        Connection conn = null;
        try {
        	
        	String url = "jdbc:sqlite::memory:";     
        	
            // create a connection to the database
            conn = DriverManager.getConnection(url);            
            System.out.println("Connection to SQLite has been established.");
            
        } catch (SQLException e) {
            System.out.println(e.getMessage());
        }
		return conn;
    }
}
    
 