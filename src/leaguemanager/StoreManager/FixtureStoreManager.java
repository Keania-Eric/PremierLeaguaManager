/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package leaguemanager.StoreManager;

import java.util.ArrayList;
import leaguemanager.Fixture;
import leaguemanager.Abstract.StoreManager;
import java.util.List;
/**
 *
 * @author Keania
 */
public class FixtureStoreManager extends StoreManager{
    
    protected String filename = "fixtures.txt";
    
    // Store matches back into the store
    public void storeMatches(ArrayList<Fixture> fixtures){
        
        this.store(fixtures, filename);
    }
    
    
    // Retrieve Matches an parse them into an array of matches
    public ArrayList<Fixture> getMatches(){
        
        ArrayList<Fixture> matches = new ArrayList<Fixture>();
        // We get the entries read from the file and convert them into a match object
        matches = parseToFixtures(this.getItems(filename));
        
        return matches;
    }
    
    public ArrayList<Fixture> parseToFixtures(ArrayList<?> entries){
        
        ArrayList<Fixture> fixtures = new ArrayList<Fixture>();
        
        for (Object item : entries){
            List<String> teams = new ArrayList<String>();
            teams.add("Chelsea");
            fixtures.add(new Fixture(teams));
        }
        return fixtures;
    }
}
