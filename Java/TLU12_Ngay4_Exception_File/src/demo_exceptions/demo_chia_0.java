/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package demo_exceptions;

import java.util.InputMismatchException;
import java.util.Scanner;

/**
 *
 * @author Tran Manh Truong
 */
public class demo_chia_0 {
    public static void main(String[] args) {
        int a,b,thuong;
        Scanner sc = new Scanner(System.in);
        try{
            System.out.println("Mời nhập số nguyên a = ");
            a = sc.nextInt();
            System.out.println("Mời nhập số nguyên b = ");
            b = sc.nextInt();
            thuong = a/b;
            System.out.println("Thương = " + thuong);
        }
        catch(InputMismatchException e1){
            System.out.println("Lỗi:" + e1.getMessage());
            System.out.println("Nhập sai định dạng dữ liệu");
        }
        catch(ArithmeticException e2){
            System.out.println("Lỗi toán học: " + e2.getMessage());
        }
        catch(Exception e3){
            System.out.println("Có lỗi ngoại lệ xảy ra");
        }
        System.out.println("Kết thúc chương trình");
    }
}
