
/**
 * The Demon class implements a wrapper for the base Creature class with the following additions
 * It is the super class of any other demon classes such as Cyberdemon and Barlog
 *
 * @author Jessica Nagar
 * @version 04.05.2021
 */
public class Demon extends Creature
{
    // instance variables
    private static final int MAX_DEMON_HP = 10;
    private static final int MIN_DEMON_HP = 10;
    private static final int MAX_DEMON_STR = 10;
    private static final int MIN_DEMON_STR = 10;

    /**
     * Constructor for objects of class Demon -
     * Note that the calling class does not need to know anything about the 
     * requirements of demon minimum and maximum values
     * 
     * The instantiating class asks for a Demon and the demon class is responsible for
     * return a Demon object with values in the appropriate range
     * 
     */
    public Demon(int hp, int str)
    {
        
          
    }
    
    
    public int attack() 
    {
        int attack = damage();
        
        var d = Math.random();
        if(d < 0.05)
        {
            attack = attack + 50;
        }
        else if (d < 0.95)
        {
            attack = attack;
        }
        
        return attack;
    }
    // takeDamage(int) - not overridden, because Humans take all damage assigned to them

    
}
