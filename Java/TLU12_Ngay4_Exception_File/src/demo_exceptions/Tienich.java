/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package demo_exceptions;

import java.util.Scanner;

/**
 *
 * @author Tran Manh Truong
 */
public class Tienich {
    //kiểm tra 1 chuỗi ở dạng số nguyên hay không?
    public static boolean isINT(String s){
        try{
            int n = Integer.parseInt(s);//chuyển chuỗi các con số về dạng số int
            return true;
        }
        catch(Exception e){
            return false;//nếu có lỗi thì chuỗi không phải là số nguyên
        }
    }
    //nhập số nguyên và trả về số đã nhập
    public static int inputINT(){
        Scanner sc = new Scanner(System.in);
        while(true){
            String s = sc.nextLine();
            if(isINT(s))
                return Integer.parseInt(s);//chuyển chuỗi thành số int và trả về
            else
                System.out.println("Bạn phải nhập số nguyên hợp lệ!");
        }
    }
    //nạp chồng (overload) thêm một số hàm inputINT()
    //nhập 1 số nguyên trong khoảng từ n1 đến n2
    public static int inputINT(int n1, int n2){
        Scanner sc = new Scanner(System.in);
        while(true){
            String s = sc.nextLine();
            if(isINT(s))
            {
                int n = Integer.parseInt(s);//chuyển chuỗi thành số int và trả về
                if(n>=n1 && n<=n2)
                   return n;
                else
                    System.out.println("Bạn phải nhập số nguyên trong khoảng từ " 
                        + n1 + " đến " + n2);
            }
            else
                System.out.println("Bạn phải nhập số nguyên!");
        }
    }
    //kiểm tra 1 chuỗi ở dạng số (cả số thực hoặc số nguyên)?
    public static boolean isNumeric(String s){
        try{
            double n = Double.parseDouble(s);//chuyển chuỗi các con số về dạng số
            return true;
        }
        catch(Exception e){
            return false;//nếu có lỗi thì chuỗi không phải là số nguyên
        }
    }
    //nhập số bất kỳ và trả về số đã nhập dang số thực
    public static double inputNumber(){
        Scanner sc = new Scanner(System.in);
        while(true){
            String s = sc.nextLine();
            if(isNumeric(s))
                return Double.parseDouble(s);//chuyển chuỗi thành số double và trả về
            else
                System.out.println("Bạn phải nhập số hợp lệ!");
        }
    }
}
