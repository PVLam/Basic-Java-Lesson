/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package demo_exceptions;

/**
 *
 * @author Tran Manh Truong
 */
public class demo_nhapso {
    public static void main(String[] args) {
        int n;
        System.out.println("Mời nhập số nguyên");
        n = Tienich.inputINT();
        System.out.println("Số đã nhập là: " + n);
        System.out.println("Nhập số nguyên từ 10 đến 100");
        n = Tienich.inputINT(10,100);//gọi hàm inputINT(int n1, int n2)
        System.out.println("Số đã nhập (từ 10 đến 100) là:" + n);
    }
}
