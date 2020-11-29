/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package leaguemanager.Repositories;
import java.util.*;
import leaguemanager.Player;
import leaguemanager.Contracts.LeagueManager;
import leaguemanager.StoreManager.PlayerStoreManager;
import leaguemanager.Contracts.IPlayerRepository;
import leaguemanager.FootBallClub;
/**
 *
 * @author Keania
 */
public class PlayersRepository implements IPlayerRepository {
    
    PlayerStoreManager manager;
    ArrayList<Player> players;
    
    PlayersRepository(){
        
        players = manager.getPlayers();
    }
    
    // Filters through and returns players for only this league
    public ArrayList<Player> allLeaguePlayers(LeagueManager leagueManager){
        return players;
    }
    
    @Override
    public void addPlayer(Player player){
        players.add(player);
    }
    
    // Get players for a team
    @Override
    public ArrayList<Player> getTeamPlayers(FootBallClub team){
        
        return players;
    }
}
