/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package leaguemanager;
import leaguemanager.Contracts.LeagueManager;
import leaguemanager.Repositories.MatchRepository;
import leaguemanager.Repositories.PlayersRepository;
import leaguemanager.Repositories.FootBallClubRepository;
import java.util.*;
import leaguemanager.Contracts.IFixtureRepository;
import leaguemanager.Helpers.LeagueTable;
/**
 *
 * @author Keania
 */
public class PremierLeagueManager implements LeagueManager {
    
    MatchRepository matchRepository;
    IFixtureRepository fixtureRepository;
    PlayersRepository playersRepository;
    FootBallClubRepository footballClubRepository;
    ArrayList<String> sponsors;
    
    // All matches played so far in the league
    @Override
    public ArrayList<Match> matchesPlayedThisSeason(){
        
        return matchRepository.allMatches();
    }
    
    // All league fixtures yet to be played
    @Override
    public ArrayList<Fixture>  leagueFixtures(){
        return fixtureRepository.allFixtures();
    }
    
    // All players that plays in this league
    @Override
    public ArrayList<Player> leaguePlayers(){
        return playersRepository.allLeaguePlayers(this);
    }
    
    // Return a list of league sponsors
    @Override
    public ArrayList<String> leagueSponsors(){
        return sponsors;
    }
    
    //Return a list of league teams
    @Override
    public ArrayList<FootBallClub> leagueTeams(){
        
        return footballClubRepository.getAllClubs(this);
    }
    
    // Returns the current position of teams in the league
    @Override
    public ArrayList<?> leagueStandings(){
        return new LeagueTable(this).computeLeagueTable();
    }
}
