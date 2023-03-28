/*
 * Mohamed Elmurtada Baker
 * NimGame
 * I affirm that this program is entirely my own work and none of it is the 
 * work of any other person.
 */
package nimgame;

/**
 * Player interface will declare two abstract methods  a move method that 
 * returns the number of marbles taken a method that returns the player’s name  
 * 
 */

public interface Player {
    
    int move();
    String getName();
}
