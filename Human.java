/*
 * Mohamed Elmurtada Baker
 * NimGame
 * I affirm that this program is entirely my own work and none of it is the 
 * work of any other person.
 */
package nimgame;

import java.io.BufferedReader;
import java.io.InputStreamReader;

/**
 * This class Human computer implements player
 */
public class Human implements Player {
    
    private Pile gamePile;
    private String name;
    
    /**
     * 
     * @param p is the game pile
     * @param pname is the player name
     */
    public Human (Pile p, String pname)
    {
        gamePile = p;
        name = pname;
    }
    /**
     * makes a move for human to remove marbles
     * @return 
     */
    public int move()
    {
        try
        {
            int numOfMarbles = gamePile.GetMarbles();
            int num = 0;
            do
            {
                System.out.print("Enter num of marbles to remove: ");
                BufferedReader reader = new BufferedReader(new InputStreamReader(
                System.in));
                String numStr = reader.readLine();
                num = Integer.parseInt(numStr);
            }while(num < 0 || num > (numOfMarbles / 2));                           
            return num;
        }
        catch(Exception ex)
        {
            return 0;
        }        
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
