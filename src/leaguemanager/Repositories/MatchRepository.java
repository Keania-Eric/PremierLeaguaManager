/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package leaguemanager.Repositories;
import leaguemanager.Contracts.IMatchRepository;
import java.util.ArrayList;
import java.util.stream.Collectors;
import leaguemanager.Match;
import leaguemanager.StoreManager.MatchStoreManager;

/**
 *
 * @author Keania
 */
public class MatchRepository implements IMatchRepository{
    
    MatchStoreManager manager;
    
     // Stores a match into the data store
    @Override
    public void storeMatch(Match match){
   
        // Get all matches append and store
        ArrayList<Match> matches = manager.getMatches();
        matches.add(match);
        manager.storeMatches(matches);
    }
    
    //find a matches for a team
    @Override
    public ArrayList<Match> findAllMatchesForTeam(String team){
        
        ArrayList<Match> allMatches = manager.getMatches();
        ArrayList<Match> teamMatches = manager.parseToMatches(allMatches.stream().filter(match -> match.teams.contains(team)).collect(Collectors.toList()));
        //ArrayList<Match> teamMatches = allMatches;
        return teamMatches;
    }   
    
    // All played matches
    public ArrayList<Match> allMatches(){
        
        return manager.getMatches();
    }
    
   
}
