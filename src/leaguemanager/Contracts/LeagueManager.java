/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package leaguemanager.Contracts;
import java.util.*;
import leaguemanager.Fixture;
import leaguemanager.FootBallClub;
import leaguemanager.Match;
import leaguemanager.Player;
/**
 *
 * @author Keania
 */
public interface LeagueManager {
    
    // All matches played so far in the league
    ArrayList<Match> matchesPlayedThisSeason();
    
    // All league fixtures yet to be played
    ArrayList<Fixture>  leagueFixtures();
    
    // All players that plays in this league
    ArrayList<Player> leaguePlayers();
    
    // Return a list of league sponsors
    ArrayList<String> leagueSponsors();
    
    //Return a list of league teams
    ArrayList<FootBallClub> leagueTeams();
    
    // Returns the current position of teams in the league
    ArrayList<?> leagueStandings();
}
