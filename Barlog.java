
/**
 * The Barlog class implements a wrapper for the Demon class with the following additions
 * Implements a maximum/minimum strength for the creature type [100/50]
 * Implements a maximum/minimum hitpoint total for the creature type [200/80]
 *
 * @author Jessica Nagar
 * @version 04.05.2021
 */
public class Barlog extends Demon
{
    // instance variables - replace the example below with your own
    private static final int MAX_BARLOG_HP = 200;
    private static final int MIN_BARLOG_HP = 80;
    private static final int MAX_BARLOG_STR = 100;
    private static final int MIN_BARLOG_STR = 50;

    /**
     * Constructor for objects of class Barlog -
     * Note that the calling class does not need to know anything about the 
     * requirements of barlog minimum and maximum values
     * 
     * The instantiating class asks for a Barlog and the barlog class is responsible for
     * return a Barlog object with values in the appropriate range
     * 
     */
    public Barlog()
    {
        // note how the class uses the static randomizer class to
        // generate the values. This localizes the need to know 
        // max and min values to this class only
        // max-min is range of values
        // range + min ensures that the values don't start at one.
        super(
            Randomizer.nextInt(MAX_BARLOG_HP-MIN_BARLOG_HP)+MIN_BARLOG_HP,    
            Randomizer.nextInt(MAX_BARLOG_STR-MIN_BARLOG_STR)+MIN_BARLOG_STR
            );
          
    }
    
    
    // attack() - not overridden because Humans generate basic damage
    // takeDamage(int) - not overridden, because Humans take all damage assigned to them

    
}
