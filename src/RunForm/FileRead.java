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
public class FileRead {
    
    String path;
    
    public void ReadFile( String file_path) {
        path = file_path;
        System.out.println(path);
    }
    
    public String[] OpenFile(String file_path) throws IOException {
        
       path = file_path;
       FileReader fr = new FileReader(path);
       BufferedReader textReader = new BufferedReader(fr);
       
       CountLines count = new CountLines();
       int numberOfLines = count.readLines(path);
       
       String[] textData = new String[numberOfLines];
               
       int i;

        for (i=0; i < numberOfLines; i++) {
        textData[ i ] = textReader.readLine();  
              
                }
        textReader.close( );
        return textData;     
 }
}
