package com.DataFlair.FileHandling;
import java.io.File;  
public class FileInformation
{
      public static void main(String[] args) {   
        File finfo = new File("G:\\Internship\\File Handling\\NewFile.txt");  
        if (finfo.exists()) {  
             System.out.println("The name of the file is: " + finfo.getName());  
             System.out.println("The absolute path of the file is: " + finfo.getAbsolutePath());
             System.out.println("Is file writeable: " + finfo.canWrite());
             System.out.println("Is file readable: " + finfo.canRead());
             System.out.println("The size of the file is: " + finfo.length());
            } else {  
            System.out.println("The file does not exist.");  
        }  
    }  
}
