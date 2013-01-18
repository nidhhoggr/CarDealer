
public class BaseEmployee {
	
	
	  protected int id;
	  protected EmployeeType Type;
	  protected String fname;
	  protected String lname;
	
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
	   * Set the value of Type
	   * @param newVar the new value of Type
	   */
	  protected void setType ( EmployeeType newVar ) {
	    Type = newVar;
	  }

	  /**
	   * Get the value of Type
	   * @return the value of Type
	   */
	  protected EmployeeType getType ( ) {
	    return Type;
	  }

	  /**
	   * Set the value of fname
	   * @param newVar the new value of fname
	   */
	  protected void setFname ( String newVar ) {
	    fname = newVar;
	  }

	  /**
	   * Get the value of fname
	   * @return the value of fname
	   */
	  protected String getFname ( ) {
	    return fname;
	  }

	  /**
	   * Set the value of lname
	   * @param newVar the new value of lname
	   */
	  protected void setLname ( String newVar ) {
	    lname = newVar;
	  }

	  /**
	   * Get the value of lname
	   * @return the value of lname
	   */
	  protected String getLname ( ) {
	    return lname;
	  }
}
