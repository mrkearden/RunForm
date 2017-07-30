/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package RunForm;
import java.io.FileWriter;
import java.io.PrintWriter;
import java.io.IOException;
/**
 *
 * @author dipstick
 */
public class FileWrite {
       
    public void writeToFile( String textLine, String file_path, boolean append_value ) throws IOException {
        String path = file_path; 
        boolean append_to_file = append_value;
        System.out.println(path);
     FileWriter write = new FileWriter( path , append_to_file);
     PrintWriter print_line = new PrintWriter( write );
     print_line.printf("%s" + "%n" , textLine);
     print_line.close();
    
    }
}
