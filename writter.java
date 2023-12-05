/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package textfile;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;

/**
 *
 * @author chiaj
 */
public class writter
{
    public static void main(String[] args) throws IOException
    {
     File f = new File ("C:\\Users\\chiaj\\OneDrive\\Documents\\NetBeansProjects\\Textfile\\src\\textfile\\tt2.txt");

     PrintWriter pw =new PrintWriter(new FileWriter(f) );
     
     for(int i=0; i<10; i++)
     {
     pw.print(i+" ");
     

     }
         
        pw.close();
          
          
    }
}
