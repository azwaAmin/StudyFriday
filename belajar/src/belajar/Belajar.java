/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package belajar;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileOutputStream;
import java.io.FileReader;
import java.io.IOException;
import java.io.PrintWriter;

/**
 *
 * @author User
 */
public class Belajar {

   public void save(String g){
       File nama = new File("wan.txt");
       try{
           FileOutputStream out = new FileOutputStream(nama);
           PrintWriter out2 = new PrintWriter(out);
           out2.println(g);
           out2.close();
   }
       catch(IOException h){
           
       }
   }
   public String dapat(){
       try{
           File inFile = new File("wan.txt");
            FileReader fileReader = new FileReader(inFile);
      BufferedReader bufReader = new BufferedReader(fileReader);
      String huhu = bufReader.readLine();
      bufReader.close();
      return huhu;           
       }
       catch(IOException e){
           
       }
       return "grimace";
   }
    public static void main(String[] args) {
        // TODO code application logic here
    }
    
}
