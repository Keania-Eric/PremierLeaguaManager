/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package leaguemanager.StoreManager;

import java.util.ArrayList;
import leaguemanager.Player;
import leaguemanager.Abstract.StoreManager;

/**
 *
 * @author Keania
 */
public class PlayerStoreManager extends StoreManager {
    
     protected String filename = "players.txt";
    
    // Store matches back into the store
    public void storePlayers(ArrayList<Player> players){
        
        this.store(players, filename);
    }
    
    
    // Retrieve Matches an parse them into an array of matches
    public ArrayList<Player> getPlayers(){
        
        ArrayList<Player> players;
        // We get the entries read from the file and convert them into a match object
        players = parseToPlayers(this.getItems(filename));
        
        return players;
    }
    
    
    public ArrayList<Player> parseToPlayers(ArrayList<?> entries){
        
        ArrayList<Player> players = new ArrayList<>();
        
        for(Object item : entries){
            
            players.add(new Player());
        }
        return players;
    }
}
