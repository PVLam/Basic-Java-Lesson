/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package demo_strings;

/**
 *
 * @author Tran Manh Truong
 */
public class Timkiem_Chuoi {
    public static void main(String[] args) {
        String s1;
        s1 = "abc xyz ab";
        int i1 = s1.indexOf("xy");
        System.out.println("i1 = " + i1);
        int i2 = s1.indexOf("ab");
        System.out.println("i2 = " + i2);
        int i3 = s1.indexOf("cd");
        System.out.println("i3 = " + i3);
        int i4 = s1.lastIndexOf("ab");
        System.out.println("i4 = " + i4);
        String str = "100";
        int n = Integer.parseInt(str);//chuyển chuỗi kiểu dữ liệu int
        String str2 = Integer.toString(n);//chuyển số int về dạng chuỗi String
        String str3 = String.valueOf(n);//chuyển số int về dạng chuỗi String
    }
}
