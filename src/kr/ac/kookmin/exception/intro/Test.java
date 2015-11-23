package kr.ac.kookmin.exception.intro;

import java.io.BufferedReader; 
import java.io.FileNotFoundException; 
import java.io.FileReader; 
import java.io.IOException; 

class AAA { 
	 
        public void readFile() { 
 			 
 	   try 
 	   { 
		   FileReader fileReader = new FileReader("a.txt"); 
		   BufferedReader reader = new BufferedReader(fileReader); 
		   String line = reader.readLine( ); 
	        
 		   while (line != null) { 
			   System.out.println(line); 
			   line = reader.readLine( ); 
			   reader.close(); 
	         } 
		}  
 	   catch(FileNotFoundException e) 
 	      { 
 	         System.out.println("Problem opening files."); 
 	      } 
	      catch(IOException e) 
 	      { 
 	         System.out.println("Error reading from original.txt."); 
 	      } 
     } 
} 
 
 
 	public class Test { 
 	    public static void main(String args[]) { 
 	    	AAA a = new AAA(); 
 	    	a.readFile(); 
 	    } 
}  
