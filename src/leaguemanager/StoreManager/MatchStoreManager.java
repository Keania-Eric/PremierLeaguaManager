/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package leaguemanager.StoreManager;
import java.io.*;
import java.util.*;
import leaguemanager.Match;
import leaguemanager.Abstract.StoreManager;
/**
 *
 * @author Keania
 */
public class MatchStoreManager extends StoreManager{
    
    protected String filename = "matches.txt";
    
    // Store matches back into the store
    public void storeMatches(ArrayList<Match> matches){
        
        this.store(matches, filename);
    }
    
    
    // Retrieve Matches an parse them into an array of matches
    public ArrayList<Match> getMatches(){
        
        ArrayList<Match> matches = new ArrayList<Match>();
        // We get the entries read from the file and convert them into a match object
        matches = parseToMatches(this.getItems(filename));
        
        return matches;
    }
    
    public ArrayList<Match> parseToMatches(ArrayList<?> entries){
        
        ArrayList<Match> matches = new ArrayList<Match>();
        
        for (Object item : entries){
            List<String> teams = new ArrayList<String>();
            teams.add("Chelsea");
            teams.add("Bolton");
            List<Integer> score = new ArrayList<Integer>();
            score.add(2);
            score.add(1);
            matches.add(new Match(teams, score));
        }
        return matches;
    }
}
