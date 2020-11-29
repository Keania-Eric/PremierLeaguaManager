/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package leaguemanager;
import java.io.Serializable;
import java.util.*;
/**
 *
 * @author Keania
 */
public class Match implements Serializable {
    
    public List<String> teams;
    public List<Integer> scores;
    public String winner;
    public Match(List<String> _teams, List<Integer> _scores){
        teams  = _teams;
        scores = _scores;
        
        calculateTheMatchWinner();
    }
    
    // Find out who won the match from scores
    void calculateTheMatchWinner(){
        if(scores.get(0) > scores.get(1)){
            winner = teams.get(0);
        }
        else if(scores.get(1)> scores.get(0)){
            winner = teams.get(1);
        }else {
            // The match was a draw
            winner = "N/A";
        }
    }
    
    
    
    
}
