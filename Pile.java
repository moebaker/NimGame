/*
 * Mohamed Elmurtada Baker
 * NimGame
 * I affirm that this program is entirely my own work and none of it is the 
 * work of any other person.
 */
package nimgame;

import java.util.Random;

/**
 * Pile class creates and maintains pile and 
 * remove number of marbles in a pile as well as getting them
 * @author mohamedelmurtadabaker
 */
public class Pile {
    
    int marbles;
    private static final Random gen = new Random() ;
    /**
     * Creates random pile with marbles between 20 and 95
     */
    public Pile()
    {
        Random numbers = new Random();
        marbles = 20 + numbers.nextInt(76);        
    }
    /**
     * This removes number of marbles
     * @param num remove marbles - number
     */
    public void Remove(int num)
    {
        marbles = marbles - num;
    }
    /**
     * This method gets the number of marbles available on pile.
     * 
     * @return marble size
     */
    public int GetMarbles()
    {
        return marbles;
    }
    
}
