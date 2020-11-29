/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package leaguemanager.StoreManager;
import java.util.ArrayList;
import leaguemanager.Abstract.StoreManager;
import leaguemanager.FootBallClub;
/**
 *
 * @author Keania
 */
public class TeamStoreManager extends StoreManager {
    
    protected String filename = "teams.txt";
    
    // Store matches back into the store
    public void storeTeams(ArrayList<FootBallClub> teams){
        
        this.store(teams, filename);
    }
    
    
    // Retrieve Matches an parse them into an array of matches
    public ArrayList<FootBallClub> getTeams(){
        
        ArrayList<FootBallClub> teams;
        // We get the entries read from the file and convert them into a match object
        teams = parseToClubs(this.getItems(filename));
        
        return teams;
    }
    
    
    public ArrayList<FootBallClub> parseToClubs(ArrayList<?> entries){
        
        ArrayList<FootBallClub> teams = new ArrayList<>();
        
        for (Object item : entries){
            
            String name = "Manchester United";
            String location = "England";
            String league = "Premier League";
            teams.add(new FootBallClub(name, location, league));
        }
        return teams;
    }
}
