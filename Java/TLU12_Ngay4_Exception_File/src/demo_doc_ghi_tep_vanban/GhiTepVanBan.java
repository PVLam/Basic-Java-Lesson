/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package demo_doc_ghi_tep_vanban;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.Scanner;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author Tran Manh Truong
 */
public class GhiTepVanBan {
    public static void main(String[] args) {
        //nhập đường dẫn tệp cần ghi dữ liệu
        String tentep;
        Scanner sc = new Scanner(System.in);
        System.out.println("Mời nhập đường dẫn tệp sẽ ghi dữ liệu:");
        tentep = sc.nextLine();
        //kỹ thuật tạo tệp văn bản và lưu các chuỗi văn bản lên tệp
        FileOutputStream fo = null;//đối tường dụng để mở và tạo tệp
        PrintWriter pw = null;//đôi tượng liên kết với fo và cung cấp các hàm ghi chuỗi ra tệp
        try {
            fo = new FileOutputStream(tentep, true);//mở nếu tồn tại hoặc tạo tệp mới và ghi thêm dữ liệu vào cuối tệp, nếu là false thì tệp đã tồn tại sẽ bị xóa và tạo mới
            pw = new PrintWriter(fo);//gán tệp đã mở cho đối tượng pw để ghi văn bản
            //nhập các chuỗi và ghi ra tệp, nếu chuỗi rỗng thì dừng
            while(true){
                String str;
                System.out.println("Mời nhập chuỗi (Enter để kết thúc):");
                str = sc.nextLine();
                if(str.equals(""))
                    break;
                else
                    pw.println(str);//ghi 1 dòng ra tệp văn bản
            }
        } catch (FileNotFoundException ex) {
            System.out.println("Sai đường dẫn tệp");
            Logger.getLogger(GhiTepVanBan.class.getName()).log(Level.SEVERE, null, ex);
        }
        finally{
            //đóng tệp để ghi dữ liệu an toàn
            if(pw!=null)
                pw.close();
            if(fo!=null)
                try {
                    fo.close();
            } catch (IOException ex) {
                Logger.getLogger(GhiTepVanBan.class.getName()).log(Level.SEVERE, null, ex);
            }
        }
    }
}
