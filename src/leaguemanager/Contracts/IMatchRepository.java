/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package leaguemanager.Contracts;
import java.util.*;
import leaguemanager.Match;
/**
 *
 * @author Keania
 */
public interface IMatchRepository {
    
    // Stores a match into the data store
    void storeMatch(Match match);
    
    //find a matches for a team
    ArrayList<Match> findAllMatchesForTeam(String $team);
    
    
}
