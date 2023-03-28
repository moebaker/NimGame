/*
 * Mohamed Elmurtada Baker
 * NimGame
 * I affirm that this program is entirely my own work and none of it is the 
 * work of any other person.
*/
package nimgame;

import java.util.Random;

/**
 * This class below average computer implements player 
 */
public class BelowAverageComputer implements Player {
    
    private static final Random gen = new Random() ;
    private Pile gamePile;
    private String name;
    /**
     * 
     * @param p is the game pile
     * @param pname is the player name
     */
    public BelowAverageComputer(Pile p, String pname)
    {
        gamePile = p;
        name = pname;
    }
    /**
     * makes a move for the below average computer to remove marbles
     * @return removes the number of marbles
     */
    public int move()
    {        
        int pileMarbles = gamePile.GetMarbles();
        if(pileMarbles == 1)
        {
            return 1;
        }
        
        int numOfMarbles = 0;
        do
        {
            Random numbers = new Random();
            numOfMarbles = 1 + numbers.nextInt(pileMarbles/2);
        }while(numOfMarbles < pileMarbles/2);        
        return numOfMarbles;
    }
    /**
     * 
     * @return name
     */
    public String getName()
    {
        return name;
    }
}
