package lab02;

/**
 * Capture a Can of Soda.
 * A Can of Soda has a type, amount (initially 250) and is initially closed.
 * Once opened, you can sip (take at most 10) or gulp (take at most 50) from
 * the can. Obviously, at all times, the amount of soda in the can is between 0 and 250.
 * An opened can can not be closed.
 */
public class SodaCan {
	
	
	 private String type;
	 private int amount;
	 private boolean isOpen;


	/**
	 * Construct a new SodaCan of the specified type.
	 * The new can has 250 units in it, and is closed.
	 * @param t the type of soda, for example "RootBeer", "Coke", "Cherry"
	 */
	 
	 public SodaCan(String t) {
	        this.type = t;
	        this.amount = 250;  // initial amount of soda
	        this.isOpen = false;  // soda can starts closed
	    }

        /**
         * open this SodaCan
         */
	 public void open() {
	        this.isOpen = true;
	    }

	/**
	 * @return whether this is open
	 */
	 public boolean isOpen() {
	        return this.isOpen;
	    }
	
        /**
         * remove up to 10cc of soda from this, provided this is open
         * @return the amount of soda actually removed
         */
	 
	 public int sip() {
	        if (this.isOpen) {
	            int sipAmount = Math.min(10, this.amount);  // remove up to 10cc
	            this.amount -= sipAmount;
	            return sipAmount;
	        }
	        return 0;  // cannot sip from a closed can
	    }

        /**
         * remove up to 50cc of soda from this, provided this is open
         * @return the amount of soda actually removed
         */
	 
	 public int gulp() {
	        if (this.isOpen) {
	            int gulpAmount = Math.min(50, this.amount);  // remove up to 50cc
	            this.amount -= gulpAmount;
	            return gulpAmount;
	        }
	        return 0;  // cannot gulp from a closed can
	    }

        /**
         * @return the amount of soda left in this
         */
	 public int getAmount() {
	        return this.amount;
	    }

        /**
         * @return a string representation of this
         */
        public String toString(){
		String openString = (this.isOpen)?"open":"closed";
		return this.type+" "+openString+" "+this.amount;
        }
}
