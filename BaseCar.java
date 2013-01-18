
public class BaseCar {

	  protected int id;
	  protected String make;
	  protected String model;
	  protected int year;
	  protected CarCondition Condition;
	  protected float commission;
	  protected float price;
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
	   * Set the value of make
	   * @param newVar the new value of make
	   */
	  protected void setMake ( String newVar ) {
	    make = newVar;
	  }

	  /**
	   * Get the value of make
	   * @return the value of make
	   */
	  protected String getMake ( ) {
	    return make;
	  }

	  /**
	   * Set the value of model
	   * @param newVar the new value of model
	   */
	  protected void setModel ( String newVar ) {
	    model = newVar;
	  }

	  /**
	   * Get the value of model
	   * @return the value of model
	   */
	  protected String getModel ( ) {
	    return model;
	  }

	  /**
	   * Set the value of year
	   * @param newVar the new value of year
	   */
	  public void setYear ( int newVar ) {
	    year = newVar;
	  }

	  /**
	   * Get the value of year
	   * @return the value of year
	   */
	  protected int getYear ( ) {
	    return year;
	  }

	  /**
	   * Set the value of Condition
	   * @param newVar the new value of Condition
	   */
	  protected void setCondition ( CarCondition newVar ) {
	    Condition = newVar;
	  }

	  /**
	   * Get the value of Condition
	   * @return the value of Condition
	   */
	  public CarCondition getCondition ( ) {
	    return Condition;
	  }

	  /**
	   * Set the value of commission
	   * @param newVar the new value of commission
	   */
	  protected void setCommission ( float newVar ) {
	    commission = newVar;
	  }

	  /**
	   * Get the value of commission
	   * @return the value of commission
	   */
	  protected float getCommission ( ) {
	    return commission;
	  }

	  /**
	   * Set the value of price
	   * @param newVar the new value of price
	   */
	  protected void setPrice ( float newVar ) {
	    price = newVar;
	  }

	  /**
	   * Get the value of price
	   * @return the value of price
	   */
	  protected float getPrice ( ) {
	    return price;
	  }
}
