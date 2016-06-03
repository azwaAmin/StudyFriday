/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package belajar;

import java.io.File;
import java.io.FileOutputStream;
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
    public static void main(String[] args) {
        // TODO code application logic here
    }
    
}
