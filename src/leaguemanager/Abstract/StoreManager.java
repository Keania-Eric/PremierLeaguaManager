/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package leaguemanager.Abstract;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.util.ArrayList;
import leaguemanager.Match;

/**
 *
 * @author Keania
 */
public class StoreManager {
    
    protected ArrayList<?> items;
    
    public void store(ArrayList<?> items, String filename){
        try {
            FileOutputStream fos = new FileOutputStream(filename);
            ObjectOutputStream oos = new ObjectOutputStream(fos);
            oos.writeObject(items);
            oos.close();
        }catch(IOException e){
            System.out.println(e);
        }
        
    }
    
    // Retrieves all matches from the text file
    public ArrayList<?> getItems(String filename){
        
        try {
            FileInputStream fis = new FileInputStream(filename);
            ObjectInputStream ois = new ObjectInputStream(fis);
            items = (ArrayList<?>) ois.readObject();
            ois.close();
            
            
        }catch(IOException e){
            System.out.println(e);
        }catch(ClassNotFoundException e){
            System.out.println(e);
        }
        
        return items;
    }
}
