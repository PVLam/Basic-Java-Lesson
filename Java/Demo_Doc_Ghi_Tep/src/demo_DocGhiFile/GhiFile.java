/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package demo_DocGhiFile;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.Scanner;
import java.io.PrintWriter;
import java.util.logging.Level;
import java.util.logging.Logger;

public class GhiFile {
    public static void main(String[] args){
        String tentep;
        Scanner sc = new Scanner(System.in);
        System.out.println("Nhap duong dan: ");
        tentep = sc.nextLine();
        FileOutputStream fo = null;
        PrintWriter pw = null; 
        
        try {
            fo = new FileOutputStream(tentep, true);
            pw = new PrintWriter(fo);
            while(true){
            String str;
            System.out.println("Nhap chuoi(Enter de ke thuc): ");
            str = sc.nextLine();
            if(str.equals(""))
                break;
            else
                pw.println(str);
        }
        } catch (FileNotFoundException ex) {
            System.out.println("Sai duong dan tep");
            Logger.getLogger(GhiFile.class.getName()).log(Level.SEVERE, null, ex);
        }
        finally{
            if(pw!= null)
                pw.close();
            if(fo!= null)
                try {
                    fo.close();
            } catch (IOException ex) {
                Logger.getLogger(GhiFile.class.getName()).log(Level.SEVERE, null, ex);
            }
        }
    }
}    
