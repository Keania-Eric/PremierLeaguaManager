/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package leaguemanager.Contracts;
import leaguemanager.FootBallClub;
import java.util.*;
import leaguemanager.Player;

/**
 *
 * @author Keania
 */
public interface IPlayerRepository {
    
    // Add players to a team
    void addPlayer(Player playerRecord);
    
    // Gets an array of team players
    ArrayList<Player> getTeamPlayers(FootBallClub team);
}
