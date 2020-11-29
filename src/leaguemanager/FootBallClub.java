/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package leaguemanager;

import leaguemanager.Abstract.SportsClub;

/**
 *
 * @author Keania
 */
public class FootBallClub extends SportsClub {
    
     String clubStadium;
     String stadiumCapacity;
     String league;
     
     public FootBallClub(String _name, String _location, String _league){
         
         super(_name, _location);
         league = _league;
     }
     
    // Compute goals scored by players of this team
    public int getGoalsScored(){
        return 1;
    }
    
    // Compute the current position of this team on the league table
    public int getPositionOnLeagueTable(){
        return 1;
    }
    
    // We compute goals scored against this team from matches played
    public int getGoalsConceeded(){
        return 1;
    }
}
