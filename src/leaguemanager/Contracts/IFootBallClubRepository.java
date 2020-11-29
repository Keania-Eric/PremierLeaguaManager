/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package leaguemanager.Contracts;
import leaguemanager.FootBallClub;
import java.util.ArrayList;

/**
 *
 * @author Keania
 */
public interface IFootBallClubRepository {
    
    // Get all clubs for this league
    ArrayList<FootBallClub> getAllClubs(LeagueManager league);
    
    // Adds a new team to the list of teams
    void addClub(FootBallClub team);
}
