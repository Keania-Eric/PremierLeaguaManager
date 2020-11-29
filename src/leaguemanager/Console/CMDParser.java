/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package leaguemanager.Console;
import java.util.*;
/**
 * @desc Receive user inputs and handles them
 * @author Keania
 */
public class CMDParser {
    
    String screen = "MENU";
    ScreenNavigationGuide screenGuide = new ScreenNavigationGuide();
    
    
    // Sets the users current location
    final void setScreen(String menu){
        
        screen = menu;
        printScreenGuides();
    }
    
    // Prints the navigations and helps needed to access a screen
    void printScreenGuides(){
        
        switch(screen){
            case "MENU":
                screenGuide.printMenuGuide();
            break;
            
            case "CREATE_CLUB":
                screenGuide.printCreateClubGuide();
            break;
            
            case "DELETE_CLUB":
                screenGuide.printDeleteClubGuide();
            break;
            
            case "DISPLAY_CLUB_STATS":
                screenGuide.printClubStatsGuide();
            break;
            
            case "ADD_MATCH":
                screenGuide.printMatchPlayedGuide();
            break;
            
            case "SAVE_CHANGES":
                screenGuide.printSaveFileGuide();
            break;
            
            case "RESUME":
                screenGuide.printResumeSavedGuide();
            break;
                
        }
    }
    
    // Parses what the user entered
    void parse(String userInput){
        
        switch(screen){
            case "MENU":
                resolveMenuInput(userInput);
            break;
            
            case "CREATE_CLUB":
                resolveCreateClubInput(userInput);
            break;
            
            case "DELETE_CLUB":
                resolveDeleteClubInput(userInput);
            break;
            
            case "DISPLAY_CLUB_STATS":
                resolveDisplayClubInput(userInput);
            break;
            
            case "ADD_MATCH":
                resolveDisplayClubStatsInput(userInput);
            break;
            
            case "SAVE_CHANGES":
                resolveSaveChangesInput(userInput);
            break;
            
            case "RESUME":
                resolveResumePreviousInput(userInput);
            break;
                
        }
        
    }
    
    void resolveMenuInput(String input){
              
        if (input.equals("A")){
            setScreen("CREATE_CLUB");
        }else if (input.equals("B")){
            setScreen("DELETE_CLUB");
        }else if (input.equals("C")){
            setScreen("DISPLAY_CLUB_STATS");
        }else if (input.equals("D")){
            setScreen("DISPLAY_LEAGUE_TABLE");
        }else if (input.equals("E")) {
            setScreen("ADD_MATCH");
        }else if (input.equals("F")) {
            setScreen("SAVE_CHANGES");
        }else if (input.equals("G")) {
            setScreen("RESUME");
        }else if(input.equals("H")) {
            System.exit(0);
        }else {
            System.err.println("You have entered an invalid option");
        }
        
    }
    
    public void resolveCreateClubInput(String userInput){
        System.out.println("Resolving ....");
    }
    
    public void resolveDeleteClubInput(String userInput){
        System.out.println("Resolving ....");
    }
    
    public void resolveDisplayClubInput(String userInput){
        System.out.println("Resolving ....");
    }
    
    public void resolveDisplayClubStatsInput(String userInput){
        System.out.println("Resolving ....");
    }
    
    public void resolveSaveChangesInput(String userInput){
        System.out.println("Resolving ....");
    }
    
    public void resolveResumePreviousInput(String userInput){
        System.out.println("Resolving ....");
    }
}
