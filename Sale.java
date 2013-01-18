
import java.util.*;


/**
 * Class Sale
 */
public class Sale extends BaseSale {

  private MysqlHandler conn;

  public Sale () { 
	  
	  super();
	  conn = new MysqlHandler();
  };
  

  /**
   * @return       boolean
   * @param        Car
   * @param        Employee
   * @param        sale_amount
   */
  public void Create( Car Car, Employee Employee, float sale_amount )
  {
	  
      String sql = "INSERT INTO Sales(`car_id`,`employee_id`,`sale_amount`) " +
		       "VALUES("+ Car.getId() +","+ Employee.getId() +"," + sale_amount + ")";
      
      conn.executeQuery(sql);
  }


  /**
   * @return       float
   * @param        Employee
   */
  public float GetEmployeeComissions( Employee Employee )
  {
	  return (float) 0.0;
  }


  /**
   * @return       ArrayList<Sale>
   * @param        Employee
   * @param        date
   */
  private void GetByEmployeeAndDate( Employee Employee, String date )
  {
  }


}
