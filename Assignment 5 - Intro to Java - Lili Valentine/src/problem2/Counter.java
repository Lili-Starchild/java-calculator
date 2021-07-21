package problem2;

/****************************************************************************
 * Creates an object for counting                                           *
 * This gets around the need for a final variable in an ActionListener      *
 *     which cannot be modified                                             *
 ****************************************************************************/
public class Counter {
	//creates a count variable	
	private int count = 0;
	    
	//returns count
    int getCount() {
    	return count; 
	}
	    
    //increments count
    void increment() {
    	count += 1;
    }
	    
    //resets count
    void reset() {
    	count = 0; 
    }
}