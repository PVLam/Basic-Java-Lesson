/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package demo_DocGhiFile;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.Scanner;
import java.util.logging.Level;
import java.util.logging.Logger;


public class DocFile {
    public static void main(String[] args) {
        String tentep;
        Scanner sc = new Scanner(System.in);
        System.out.println("Nhap duong dan ten tep can doc: ");
        tentep = sc.nextLine();
        File f = new File(tentep);
        if(!f.exists() || f.isDirectory()){
            System.out.println("Ten tep khong ton tai hoac khong hop le");
            System.exit(0);
        }
        FileReader fr = null;
        BufferedReader br = null;
        try {
            fr = new FileReader(tentep);
            br = new BufferedReader(fr);
            String str;
            while((str=br.readLine()) != null){
                System.out.println(str);
            }
        } catch (FileNotFoundException ex) {
            Logger.getLogger(DocFile.class.getName()).log(Level.SEVERE, null, ex);
        }
        catch(IOException e2){
            System.out.println("Loi doc tep");
        }
        finally{
            try {
                if(br!=null)
                    br.close();
                if(fr!=null)
                    fr.close();
            } catch (IOException e3) {
            
            }
        }
    }
}
