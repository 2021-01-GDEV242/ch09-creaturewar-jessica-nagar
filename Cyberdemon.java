
/**
 * The Cyberdemon class implements a wrapper for the Demon class with the following additions
 * Implements a maximum/minimum strength for the creature type [40/20]
 * Implements a maximum/minimum hitpoint total for the creature type [100/20]
 *
 * @author Jessica Nagar
 * @version 04.05.2021
 */
public class Cyberdemon extends Demon
{
    // instance variables
    private static final int MAX_CYBERDEMON_HP = 30;
    private static final int MIN_CYBERDEMON_HP = 10;
    private static final int MAX_CYBERDEMON_STR = 18;
    private static final int MIN_CYBERDEMON_STR = 5;

    /**
     * Constructor for objects of class Cyberdemon -
     * Note that the calling class does not need to know anything about the 
     * requirements of Cyberdemon minimum and maximum values
     * 
     * The instantiating class asks for a Cyberdemon and the cyberdemon class is responsible for
     * return a Cyberdemon object with values in the appropriate range
     * 
     */
    public Cyberdemon()
    {
        // note how the class uses the static randomizer class to
        // generate the values. This localizes the need to know 
        // max and min values to this class only
        // max-min is range of values
        // range + min ensures that the values don't start at one.
        super(
            Randomizer.nextInt(MAX_CYBERDEMON_HP-MIN_CYBERDEMON_HP)+MIN_CYBERDEMON_HP,    
            Randomizer.nextInt(MAX_CYBERDEMON_STR-MIN_CYBERDEMON_STR)+MIN_CYBERDEMON_STR
            );
          
    }
    
    
    // attack() - not overridden because Cyberdemons generate basic damage
    // takeDamage(int) - not overridden, because Cyberdemons take all damage assigned to them

    
}
