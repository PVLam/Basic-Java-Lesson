/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Model;

import java.util.Scanner;

/**
 *
 * @author Tran Manh Truong
 */
public class Sinhvien {
    String masv;
    String hoten;
    double diem;
    //xây dưng 2 hàm tạo (constructor)
    public Sinhvien(){
        masv="";
        hoten ="";
        diem=0;
    }
    public Sinhvien(String msv, String ht, double d){
        masv=msv;
        hoten =ht;
        diem=d;
    }
    //hàm nhập và hiển thị sinh vien
    public void Nhap()
    {
        Scanner sc = new Scanner(System.in);
        System.out.println("Mã sv:");
        masv = sc.nextLine();
        System.out.println("Họ tên:");
        hoten = sc.nextLine();
        System.out.println("Điểm:");
        diem = sc.nextDouble();
    }
    public void Hienthi()
    {
        System.out.println(masv + ", " + hoten +", " + diem);
    }

    @Override
    public String toString() {
        //return "Sinhvien{" + "masv=" + masv + ", hoten=" + hoten + ", diem=" + diem + '}';
        return masv + ", " + hoten + ", " + diem;
    }
    
}
