package lab02;

/**
 * Capture a person who can drink soda.
 * A person can sip or gulp from a can of soda. 
 * The person knows how much soda they have consumed,
 * and know how thirsty they are.
 */
public class Person {
	
	// Instance variables
    private String name;
    private int amountDrunk;  // the amount of soda the person has drunk (in cc)

	/**
	 * Construct a new Person with the given name.
	 * So far they will have consumed 0 soda
	 * @param name the name given to this person
	 */
    
    
    public Person(String name) {
        this.name = name;
        this.amountDrunk = 0;  // initially, the person has drunk no soda
    }

	/**
	 * Take a sip from s, modifying the amount this has consumed
	 * @param s the can of soda this will gulp from
	 */
    
    public void sipFrom(SodaCan s) {
        if (s.isOpen()) {
            int sipAmount = s.sip();  // person drinks 10cc or less if the can has less soda
            this.amountDrunk += sipAmount;
        }
    }


	/**
	 * Take a gulp from s, modifying the amount this has consumed
	 * @param s the can of soda this will gulp from
	 */
    
    public void gulpFrom(SodaCan s) {
        if (s.isOpen()) {
            int gulpAmount = s.gulp();  // person drinks 50cc or less if the can has less soda
            this.amountDrunk += gulpAmount;
        }
    }

	/**
	 * A person is 
 	 * "very thirsty" if they drank less than 175,
 	 * "thirsty" if they drank less than 375, 
 	 * "satisfied" if they drank at least 375
	 * @return the thirst status of this
	 */
    
    public String getThirstStatus() {
        if (this.amountDrunk < 175) {
            return "very thirsty";
        } else if (this.amountDrunk < 375) {
            return "thirsty";
        } else {
            return "satisfied";
        }
    }


	/**
	 * @return a string representation of this
	 */
    @Override
	public String toString(){
		return "I am "+this.name+", and I am "+this.getThirstStatus();
	}
}


