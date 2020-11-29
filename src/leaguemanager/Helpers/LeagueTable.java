/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package leaguemanager.Helpers;
import java.util.ArrayList;
import java.util.List;
import leaguemanager.Contracts.LeagueManager;
/**
 *
 * @author Keania
 */
public class LeagueTable {
    
    ArrayList<String[]> leagueTable;
    
    public LeagueTable(LeagueManager league){
        // compute league table and return
        computeLeagueTable();
    }
    
  
    public final ArrayList<String[]> computeLeagueTable(){
        
        leagueTable = new ArrayList<>();
        //TODO: Get a couple of classes to compute this
        String[] teamStats = {"Manchester United", "3", "5", "20"};
        leagueTable.add(teamStats);
        
        return leagueTable;
        
    }
}
