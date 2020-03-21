
// TODO: Auto-generated Javadoc
/**
 * The Class Car.
 */
public class Car {
	
	/** The model. */
	private String model; 
	
	/** The year. */
	private int year;
	
	/** The current year. */
	public static int currentYear = 2017;
	
	
	/**
	 * Instantiates a new car.
	 *
	 * @param model the model
	 * @param year the year
	 */
	public Car(String model, int year) {
		this.model = model;
		this.year = year;
	}

	/**
	 * Gets the model.
	 *
	 * @return the model
	 */
	public String getModel() {
		return model;
	}
	
	/**
	 * Gets the age in years.
	 *
	 * @return the age in years
	 */
	public int getAgeInYears() {
		return currentYear - year;
	}

	/**
	 * To string.
	 *
	 * @return the string
	 */
	@Override
	public String toString() {
		return model + " (" + year + ")";
	}
}

