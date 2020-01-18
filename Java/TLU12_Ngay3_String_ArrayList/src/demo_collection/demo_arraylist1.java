/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package demo_collection;


import Model.Sinhvien;
import java.util.ArrayList;

/**
 *
 * @author Tran Manh Truong
 */
public class demo_arraylist1 {
    public static void main(String[] args) {
        ArrayList arr =  new ArrayList();//tạo đối tượng mảng động
        String s = "ABC";
        Integer i = 10;
        Sinhvien sv = new Sinhvien("SV01", "Nguyen van A", 9);
        //thêm các phần tử vào mảng
        arr.add(s);
        arr.add(i);
        arr.add(sv);
        //lấy ra
        String str = (String)arr.get(0);
        Sinhvien a = (Sinhvien)arr.get(2);
    }
}
