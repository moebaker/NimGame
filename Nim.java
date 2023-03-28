/*
 * Mohamed Elmurtada Baker
 * NimGame
 * I affirm that this program is entirely my own work and none of it is the 
 * work of any other person.
 */
package nimgame;

/**
 * Nim class depends only on the Player interface and Pile class, and not on 
 * any of the classes that implement Player.  
 */
public class Nim {
    
    private Player[] players;
    private Pile gamePile;
    /**
     * 
     * @param p1 player 1
     * @param p2 player 2
     * @param p pile
     */
    public Nim(Player p1, Player p2, Pile p)
    {
        players = new Player[] {p1, p2};
        gamePile = p;
    }
    /**
     * This is the play method and prints out output
     */
    public void Play()
    {
        System.out.println("The pile has " + gamePile.GetMarbles() + 
                           " marble(s).");
        while(true)
        {            
            for(int i=0; i<players.length; i++)
            {
                int removed = players[i].move();     
                gamePile.Remove(removed);
                System.out.println(players[i].getName() + " takes " + removed +
                  " -- pile now has " + gamePile.GetMarbles() + " marble(s).");
                
                if(gamePile.GetMarbles() < 1)
                {
                    int w = i == 0 ? 1 : 0;
                    System.out.println("Game over! The winner is the " + 
                   players[w].getClass() + " object, " + players[w].getName() );
                    return;
                }
            }
        }        
    }    
}
