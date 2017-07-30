/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package RunForm;
import java.io.IOException;
import java.io.FileReader;
import java.io.BufferedReader;
/**
 *
 * @author dipstick
 */
public class CountLines {
    
    int readLines(String path) throws IOException {
        
       FileReader file_to_read = new FileReader(path);
       BufferedReader bf = new BufferedReader(file_to_read);
       
       String aLine;
       int numberOfLines =0;
       
       while ((aLine = bf.readLine()) != null){
           numberOfLines++;
       }
       bf.close();
       
       return numberOfLines;
            
    }
    
}
