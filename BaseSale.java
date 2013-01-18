
public class BaseSale {

	  protected int id;
	  protected Car Car;
	  protected Employee Employee;
	  protected String date;
	  protected float sale_amount;
	
	  /**
	   * Set the value of id
	   * @param newVar the new value of id
	   */
	  protected void setId ( int newVar ) {
	    id = newVar;
	  }

	  /**
	   * Get the value of id
	   * @return the value of id
	   */
	  protected int getId ( ) {
	    return id;
	  }

	  /**
	   * Set the value of Car
	   * @param newVar the new value of Car
	   */
	  protected void setCar ( Car newVar ) {
	    Car = newVar;
	  }

	  /**
	   * Get the value of Car
	   * @return the value of Car
	   */
	  protected Car getCar ( ) {
	    return Car;
	  }

	  /**
	   * Set the value of Employee
	   * @param newVar the new value of Employee
	   */
	  protected void setEmployee ( Employee newVar ) {
	    Employee = newVar;
	  }

	  /**
	   * Get the value of Employee
	   * @return the value of Employee
	   */
	  protected Employee getEmployee ( ) {
	    return Employee;
	  }

	  /**
	   * Set the value of date
	   * @param newVar the new value of date
	   */
	  protected void setDate ( String newVar ) {
	    date = newVar;
	  }

	  /**
	   * Get the value of date
	   * @return the value of date
	   */
	  protected String getDate ( ) {
	    return date;
	  }

	  /**
	   * Set the value of sale_amount
	   * @param newVar the new value of sale_amount
	   */
	  protected void setSale_amount ( float newVar ) {
	    sale_amount = newVar;
	  }

	  /**
	   * Get the value of sale_amount
	   * @return the value of sale_amount
	   */
	  protected float getSale_amount ( ) {
	    return sale_amount;
	  }
}
