/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package leaguemanager.Repositories;
import leaguemanager.StoreManager.TeamStoreManager;
import leaguemanager.Contracts.IFootBallClubRepository;
import java.util.ArrayList;
import leaguemanager.FootBallClub;
import leaguemanager.Contracts.LeagueManager;
/**
 *
 * @author Keania
 */
public class FootBallClubRepository implements IFootBallClubRepository {
    
    TeamStoreManager manager;
    ArrayList<FootBallClub> teams;
    
    FootBallClubRepository(){
        teams = manager.getTeams();
    }
    
    // Get all clubs for a particular team
    @Override
    public ArrayList<FootBallClub> getAllClubs(LeagueManager league){
        return teams;
    }
    
    //Add a new Team
    @Override
    public void addClub(FootBallClub team){
        teams.add(team);
    }
}
