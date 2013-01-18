import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;

// Notice, do not import com.mysql.jdbc.*
// or you will have problems!

public class MysqlHandler {
	
	private Connection conn;
	
    public MysqlHandler() {

    	conn = null;
    	
    	try {
            // The newInstance() call is a work around for some
            // broken Java implementations

            conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/car_dealer","root","root");
            
        } catch (SQLException ex) {
            System.out.println("SQLException: " + ex.getMessage());
            System.out.println("SQLState: " + ex.getSQLState());
            System.out.println("VendorError: " + ex.getErrorCode());        // handle the error
        }
    }
    
    public Connection getConnection() {
    	return conn;
    }

	
	public void executeQuery(String query) {
	    String sql = query;
        System.out.println(sql);
	    Statement stmt;

	    try {
			stmt = getConnection().createStatement();
			stmt.execute(sql);
		} catch (SQLException e) {
			e.printStackTrace();
		}
	}
	
	public ResultSet fetchQuery(String query) {
	    String sql = query;

	    Statement stmt;
	    ResultSet result = null;

	    try {
			stmt = getConnection().createStatement();
			result = stmt.executeQuery(sql);
		} catch (SQLException e) {
			e.printStackTrace();
		}
		
	    return result;
	}
	
    private static ArrayList<ArrayList<String>> extract(ResultSet resultSet)  
    throws SQLException {  
        ArrayList<ArrayList<String>> table;  
        int columnCount = resultSet.getMetaData().getColumnCount();  
          
        if(resultSet.getType() == ResultSet.TYPE_FORWARD_ONLY)   
            table = new ArrayList<ArrayList<String>>();  
        else {    
            resultSet.last();  
            table = new ArrayList<ArrayList<String>>(resultSet.getRow());  
            resultSet.beforeFirst();  
        }  
    
        for(ArrayList<String> row; resultSet.next(); table.add(row)) {  
            row = new ArrayList<String>(columnCount);  
      
            for(int c = 1; c <= columnCount; ++ c)  
                row.add(resultSet.getString(c).intern());  
        }  
          
        return table;  
    }
}