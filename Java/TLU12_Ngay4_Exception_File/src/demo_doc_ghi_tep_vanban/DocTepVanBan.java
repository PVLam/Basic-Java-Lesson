/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package demo_doc_ghi_tep_vanban;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.Scanner;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author Tran Manh Truong
 */
public class DocTepVanBan {
    public static void main(String[] args) {
        String tentep;
        Scanner sc = new Scanner(System.in);
        System.out.println("Mời nhập đường dẫn tên tệp cần đọc:");
        tentep = sc.nextLine();
        File f = new File(tentep);
        if(!f.exists() || f.isDirectory()){//nếu tệp không tồn tại hoặc nhập là thư mục
            System.out.println("Tệp không tồn tại hoặc không hợp lệ");
            System.exit(0);//thoát khỏi chương trình
        }
        //mở tệp để đọc ở chế độ văn bản
        FileReader fr = null;
        BufferedReader br = null;
        try {
            fr = new FileReader(tentep);
            br = new BufferedReader(fr);
            String str;//biến str lưu từng chuỗi đọc được từ file
            while((str = br.readLine())!=null){//lặp đọc từng dòng từ tệp 
                System.out.println(str);
            }
        } catch (FileNotFoundException ex) {
            Logger.getLogger(DocTepVanBan.class.getName()).log(Level.SEVERE, null, ex);
        }
        catch (IOException e2){
            System.out.println("Lỗi xảy ra khi đọc tệp");
        }
        finally{
            try{
                if(br!=null) br.close();
                if(fr!=null) fr.close();
            }
            catch(IOException e3){
            }
        }
    }
   
}