/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package textfile;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

/**
 *
 * @author chiaj
 */
public class second
{
    public static void main (String[] args) throws IOException
    {
    File f = new File ("C:\\Users\\chiaj\\OneDrive\\Documents\\NetBeansProjects\\Textfile\\src\\textfile\\tt2.txt");
    
    File f2= new File("C:\\Users\\chiaj\\OneDrive\\Documents\\NetBeansProjects\\Textfile\\src\\textfile\\tt3.txt");
    
    BufferedReader br = new BufferedReader(new FileReader(f));
    
    BufferedWriter bw = new BufferedWriter(new FileWriter(f2));
    String value;
    
    while((value = br.readLine())!=null)
    {
        System.out.println();
        
        bw.write(value);
        
        bw.newLine();
    }
    br.close();
    bw.close();
    }
    
    //copy file from tt2 to tt3
}
