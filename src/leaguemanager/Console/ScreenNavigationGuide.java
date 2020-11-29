/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package leaguemanager.Console;

/**
 *
 * @author Keania
 */
public class ScreenNavigationGuide {
    
    // General Headers for command line
    public void displayHeaders(){
        System.out.println("Welcome to The Premier League Manager Menu");
    }
    
    // General Footers for command line
    public void displayFooters(){
        System.out.println("99) Main Menu");
        System.out.println("H) Exit Application");
    }
    
    // Print the guide for the main menu
    public void printMenuGuide(){
        
        displayHeaders();
        String guideString = new StringBuilder()
                .append("A) Create a new football club\n")
                .append("B) Delete an existing club\n")
                .append("C) Display Club Statistics\n")
                .append("D) Display Premier League Table\n")
                .append("E) Add Match Player\n")
                .append("F) Save Information to file\n")
                .append("G) Resume previously saved\n")
                .append("H) Exit Application").toString();
                
        System.out.println(guideString);
        //displayFooters();
    }
    
    // Print guide for create club
    public void printCreateClubGuide(){
        
        displayHeaders();
        String guideString = new StringBuilder()
                .append("To create a new Team simply Enter Name, Team Location and League \n")
                .append("Eg. Manchester United, England, Premier League").toString();
        System.out.println(guideString);
        displayFooters();
    }
    
    // Print guide for delete club
    public void printDeleteClubGuide(){
        
        displayHeaders();
        String guideString = new StringBuilder()
                .append("To delete team simply enter the name of the team \n")
                .append("Eg. Manchester United").toString();
        System.out.println(guideString);
        displayFooters();
    }
    
    // Print guide for display club statistics
    public void printClubStatsGuide(){
        
        displayHeaders();
        String guideString = new StringBuilder()
                .append("To display club statistics, simply enter club name \n")
                .append("Eg. Manchester United").toString();
        System.out.println(guideString);
        displayFooters();
    }
    
    // Print guide to add match played
    public void printMatchPlayedGuide(){
        
        displayHeaders();
        String guideString = new StringBuilder()
                .append("To Add a match played \n")
                .append("Eg. Manchester United=2, Burnley=1, 01-02-2016").toString();
        System.out.println(guideString);
        displayFooters();
    }
    
    // Print guide for saveing to file
    public void printSaveFileGuide(){
        
        displayHeaders();
        String guideString = new StringBuilder()
                .append("1) To continue \n")
                .append("2) To cancel").toString();
        System.out.println(guideString);
        displayFooters();
    }
    
    // Print guide for resume from saved version
    public void printResumeSavedGuide(){
        
        displayHeaders();
        String guideString = new StringBuilder()
                .append("1) To resume \n")
                .append("2) To cancel").toString();
        System.out.println(guideString);
        displayFooters();
    }
}
