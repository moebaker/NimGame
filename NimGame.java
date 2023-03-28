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
 *
 * @author mohamedelmurtadabaker
 */
public class NimGame {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) throws Exception {
        String ans;
        do
        {
            PlayGame();
            System.out.print("\nAnother game: ");
            BufferedReader reader = new BufferedReader(new InputStreamReader
        (System.in));
            ans = reader.readLine();
        }while(ans.equalsIgnoreCase("YES") );
        
    }
    /**
     * 
     * @throws Exception 
     */
    public static void PlayGame() throws Exception
    {
        Pile p = new Pile();
        
        System.out.println("\n\n1: SmartComputer ");
        System.out.println("2: BelowAverageComputer ");
        System.out.println("3: Human \n\n");
        
        System.out.print("Who is the first player: ");
        BufferedReader reader = new BufferedReader(new InputStreamReader
        (System.in));
        String numStr = reader.readLine();
        int num = Integer.parseInt(numStr);
        System.out.print("What is the first player called: ");
        reader = new BufferedReader(new InputStreamReader(System.in));
        String pname = reader.readLine();
        Player p1 = num == 1 ? new SmartComputer(p, pname) : num == 2 ? 
                new BelowAverageComputer(p, pname) : new Human(p, pname);
        
        System.out.print("Who is the second player: ");
        reader = new BufferedReader(new InputStreamReader(System.in));
        numStr = reader.readLine();
        num = Integer.parseInt(numStr);
        System.out.print("What is the second player called: ");
        reader = new BufferedReader(new InputStreamReader(System.in));
        pname = reader.readLine();
        Player p2 = num == 1 ? new SmartComputer(p, pname) : num == 2 ? 
                new BelowAverageComputer(p, pname) : new Human(p, pname);
        
        Nim nim = new Nim(p1, p2, p);
        nim.Play();
         
        
    }
    
    
}
