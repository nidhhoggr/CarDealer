import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.*;


/**
 * Class Car
 */
public class Car extends BaseCar {


  private MysqlHandler conn;
  
  
  public Car() {
	  super();
	  conn = new MysqlHandler();
  }

  /**
   * @return       boolean
   * @param        make
   * @param        model
   * @param        year
   * @param        Condition
   * @param        commission
   * @param        price
   */
  public boolean Create( String make, String model, int year, CarCondition Condition, float commission, float price )
  {
      String sql = "INSERT INTO Cars(`make`,`model`,`year`,`carcondition`,`price`,`commission`) " +
      		       "VALUES('"+ make +"','"+ model +"'," + year + ",'" + Condition + "'," + commission + "," + price + ")";
      return conn.executeQuery(sql);
  };
 
/*

  /**
   * @return       ArrayList<ArrayList<String>>
   * @param        id
   */
  public void GetById( int id )
  {
	  String sql ="SELECT * FROM Cars WHERE id = " + id;
	  
	  ResultSet result = conn.fetchQuery(sql);
	  
	  SetCarFromResultSet(result);
  }
  
  public void SetCarFromResultSet(ResultSet rs) {
	  
	  try {
		  while(rs.next()) {
			  setId(rs.getInt(1));
			  setMake(rs.getString(2)); 
			  setModel(rs.getString(3)); 
			  setYear(rs.getInt(4)); 
			  setCondition(CarCondition.valueOf(rs.getString(5))); 
			  setCommission(rs.getFloat(6));
			  setPrice(rs.getFloat(7));
		  } 
	  }
      catch (SQLException e) {
				e.printStackTrace();
	  }
  }

  /**
   * @return       ArrayList<Car>
   * @param        make
   */
  public void GetByMake( String make ){
	  String sql ="SELECT * FROM Cars WHERE make = " + make;
	  
	  ResultSet result = conn.fetchQuery(sql);
	  
	  SetCarFromResultSet(result);
  }


  /**
   * @return       ArrayList<Car>
   * @param        model
   */
  public void GetByModel( String model ){
	  String sql ="SELECT * FROM Cars WHERE model = " + model;
	  
	  ResultSet result = conn.fetchQuery(sql);
	  
	  SetCarFromResultSet(result);
  }


  /**
   * @return       ArrayList<Car>
   * @param        year
   */
  public void GetByYear( int year )
  {
	  String sql ="SELECT * FROM Cars WHERE year = " + year;
	  
	  ResultSet result = conn.fetchQuery(sql);
	  
	  SetCarFromResultSet(result);
  }


  /**
   * @return       ArrayList<Car>
   * @param        Condition
   */
  public void GetByCondition( CarCondition Condition )
  {
      String sql ="SELECT * FROM Cars WHERE carcondition = " + Condition;
  
      ResultSet result = conn.fetchQuery(sql);
  
      SetCarFromResultSet(result);
  }


  /**
   * @return       ArrayList<Car>
   * @param        price
   * @param        range
   */
  public void GetByPriceRange( float price, int range )
  {
	  
	  String appendSql = null;
	  
	  if(range>0) {
		  range = range / 2;
		  float least = price - range;
		  float most  = price + range;
		  appendSql = " WHERE price <= " + most + " AND price >= " + least; 
	  }
	  else {
		  appendSql = " WHERE price = " + price;
	  }
	  
	  
	  String sql ="SELECT * FROM Cars " + appendSql;
	  
	  ResultSet result = conn.fetchQuery(sql);
	  
	  SetCarFromResultSet(result);
  }
}
