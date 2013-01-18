
import java.util.*;


/**
 * Class Employee
 */
public class Employee extends BaseEmployee {

  private MysqlHandler conn;

  public Employee () { 
	  
	  super();
	  conn = new MysqlHandler();
  };

  /**
   * @return       boolean
   * @param        Type
   * @param        fname
   * @param        lname
   */
  public void Create( EmployeeType Type, String fname, String lname )
  {
      String sql = "INSERT INTO Employees(`employee_type`,`fname`,`lname`) " +
 		       "VALUES('"+ Type.toString() +"','"+ fname +"','" + lname + "')";
      
      conn.executeQuery(sql);
  }


  /**
   * @return       void
   * @param        Car
   * @param        sale_amount
   */
  public void SellCar( Car Car, int sale_amount )
  {
	  Sale sale = new Sale();
	  sale.Create(Car, this, sale_amount); 
  }


}
