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
public class demo_arraylist2 {
    public static void main(String[] args) {
        //khai báo và xác định kiểu cụ thể cho các phần tử
        ArrayList<Sinhvien> arr = new ArrayList<Sinhvien>();
        Sinhvien sv1 = new Sinhvien("SV01","A",9);
        arr.add(sv1);
        arr.add(new Sinhvien("SV02", "B", 8.5));
        Sinhvien sv2 = arr.get(0);
        sv2.Hienthi();
        //System.out.println(sv2);//tương đương System.out.println(sv2.toString())
        for(int i=0; i<arr.size();i++){
            System.out.println(arr.get(i));
        }
        for(Sinhvien sv : arr){
            System.out.println(sv);
        }
    }
}
