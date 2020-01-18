/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Baitap_QSLV_MangDong;

import Model.Sinhvien;
import java.util.ArrayList;
import java.util.Scanner;

/**
 *
 * @author Tran Manh Truong
 */
public class QuanlySinhvien {
    public ArrayList<Sinhvien> ds;// = new ArrayList<Sinhvien>();
    public QuanlySinhvien(){
        ds = new ArrayList<Sinhvien>();
    }
    public void NhapDS(){
        Scanner sc = new Scanner(System.in);
        String traloi="";
        while(true){
            Sinhvien sv = new Sinhvien();//tạo sinh viên mới
            sv.Nhap();//nhập thông tin sinh viên
            ds.add(sv);//thêm sinh viên vào danh sách
            System.out.println("Tiếp tục không? (c/k):");
            traloi = sc.nextLine();
            if(traloi.equalsIgnoreCase("k"))
                break;
        }
    }
    public void HienthiDS(){
        for(Sinhvien sv : ds){
            sv.Hienthi();
        }
    }
}
