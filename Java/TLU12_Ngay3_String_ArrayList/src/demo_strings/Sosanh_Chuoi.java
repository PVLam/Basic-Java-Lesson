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
public class Sosanh_Chuoi {
    public static void main(String[] args) {
        String s1,s2,s3;
        s1 = "abc";
        s2 = "Acde";
        int n1;
        //so sánh nội dung 2 chuỗi theo ký tự có phân biệt chữ hoa chữ thường
        n1 = s1.compareTo(s2);
        System.out.println("so sánh có phân biện hoa/thường,n1 = " + n1);
        if(n1<0)
            System.out.println("Chuỗi: " + s1 + " nhỏ hơn chuỗi: " +s2);
        else if(n1==0)
            System.out.println("Chuỗi: " + s1 + " bằng chuỗi: " +s2);
        else
            System.out.println("Chuỗi: " + s1 + " lớn hơn chuỗi: " +s2);
        //so sánh không phân biệt chữ hoa chữ thường
        int n2;
        n2 = s1.compareToIgnoreCase(s2);
        System.out.println("so sánh có phân biện hoa/thường,n2 = " + n2);
        if(n2<0)
            System.out.println("Chuỗi: " + s1 + " nhỏ hơn chuỗi: " +s2);
        else if(n2==0)
            System.out.println("Chuỗi: " + s1 + " bằng chuỗi: " +s2);
        else
            System.out.println("Chuỗi: " + s1 + " lớn hơn chuỗi: " +s2);
        //so sánh độ dài 2 chuỗi
        if(s1.length()<s2.length())
            System.out.println("Độ dài s1 nhỏ hơn độ dài s2");
        else if(s1.length()==s2.length())
            System.out.println("Độ dài s1 bằng s2");
        else
            System.out.println("Độ dài s1 lớ hơn s2");
        //nếu chỉ kiểm tra chuỗi bằng/khác nhau
        boolean b1;
        b1 = s1.equals("Abc");
        System.out.println("b1 = " + b1);
        boolean b2;
        b2 = s1.equalsIgnoreCase("Abc");
        System.out.println("b2 = " + b2);
    }
}
