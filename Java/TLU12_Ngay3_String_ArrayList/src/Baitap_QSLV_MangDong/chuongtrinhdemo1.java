/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Baitap_QSLV_MangDong;

/**
 *
 * @author Tran Manh Truong
 */
public class chuongtrinhdemo1 {
    public static void main(String[] args) {
        QuanlySinhvien qlsv = new QuanlySinhvien();
        System.out.println("Nhập các sinh viên:");
        qlsv.NhapDS();
        System.out.println("Danh sách sinh viên đã nhập:");
        qlsv.HienthiDS();
    }
}
