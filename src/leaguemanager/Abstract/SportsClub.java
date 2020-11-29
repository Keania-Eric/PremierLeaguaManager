/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package leaguemanager.Abstract;

/**
 *
 * @author Keania
 */
public abstract class SportsClub {
    
    String clubName;
    String clubLocation;
    String clubCoach;
    protected int yearFounded;
    
    
    public SportsClub(String _name, String _location){
        clubName = _name;
        clubLocation = _location;
    }
    
    // The year a team was founded is not always vivid on the surface . You just have to look again
    public int getYearFounded(){
        return this.yearFounded;
    }
    
    // Set the founded year
    protected void setYearFounded(int _year){
        this.yearFounded = _year;
    }
    
    
    // Set the head coach name
    protected void setHeadCoach(String _coachName){
        this.clubCoach = _coachName;
    }
    
    // We compute all wins the club has gooten from matches played
    public int getClubWins(){
        return 1;
    }
    
    // We compute the losses of the club from matches played
    public int getClubLoses(){
        return 1;
    }
    
    // We compute draws on this team from the matches played
    public int getClubDraws(){
        return 1;
    }
    
 
    
    // Get matches played by the team
    public int getMatchesPlayed(){
        return 1;
    }
    
    // Number of playes on team
    public int getNumberOfPlayersOnTeam(){
        return 1;
    }
    
    
}
