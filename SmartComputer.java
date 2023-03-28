/*
 * Mohamed Elmurtada Baker
 * NimGame
 * I affirm that this program is entirely my own work and none of it is the 
 * work of any other person.
 */
package nimgame;

/**
 * This class smart computer implements player 
 * @author mohamedelmurtadabaker
 */
public class SmartComputer implements Player {
    
    private Pile gamePile;
    private int [] powers = {1,3,7,15,31,63};
    private String name;
    /**
     * 
     * @param p is the game pile
     * @param pname name of the player
     */
    public SmartComputer(Pile p, String pname)
    {
        gamePile = p;
        name = pname;
    }
    /**
     * makes a move for the smart computer to remove marbles and know size
     * @return removes the number of marbles
     */
    public int move()
    {
        int numOfMarbles = gamePile.GetMarbles();
        if(numOfMarbles == 1)
        {
            return 1;
        }
        int removeNum = 0;
        for(int i=powers.length-1; i>=0; i--)
        {
            removeNum = numOfMarbles - powers[i];
            if(removeNum > 0 && removeNum <= (numOfMarbles/2))
                break;
        }
        if(removeNum > numOfMarbles/2)
            removeNum = 1;
        return removeNum;
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
