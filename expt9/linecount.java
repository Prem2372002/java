package exp_9;

import java.io.*;


public class linecount {


  
          
   public static void main(String[] args) {
      
      if (args.length == 0) {
           
          System.out.println("Usage:   java LineCounts <file-names>");
          return;
      }
      
       for (String arg : args) {
           System.out.print(arg + ":  ");
           countLines(arg);
       }
      
   }  
   
   
   
   private static void countLines(String fileName) {
          
      BufferedReader in;  
      int lineCount;     
      
      try {
          in = new BufferedReader( new FileReader(fileName) );
      }
      catch (FileNotFoundException e) {
          System.out.println("Error.  Can't open file.");
          return;
      }
      
      lineCount = 0;
      
      try {
         String line = in.readLine();   
         while (line != null) {
             lineCount++;              
             line = in.readLine();      
         }
      }
      catch (IOException e) {
         System.out.println("Error.   Problem with reading from file.");
         return;
      }
      
      System.out.println(lineCount + " lines");
   
   }  
   

} 
