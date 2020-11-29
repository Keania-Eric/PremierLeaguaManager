package leaguemanager.Console;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
import java.util.Scanner;
/**
 *
 * @author Keania
 */
public class ConsoleMenu {
    
    public ConsoleMenu(){
        startAppSession();
    }
    
    // start the application interaction session
    final void startAppSession(){
         
        System.out.println("Starting Application...");
        
        Scanner getInput = new Scanner(System.in);
        
        CMDParser parser = new CMDParser();
        
        // Continue running until user ends program
        while(true) {
            // Get user input
            String userInput = getInput.nextLine();
            
            parser.parse(userInput);
        }
        
    }
}
