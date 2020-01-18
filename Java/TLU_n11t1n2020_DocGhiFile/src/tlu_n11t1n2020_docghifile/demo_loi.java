/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tlu_n11t1n2020_docghifile;

import java.util.Scanner;


public class demo_loi {
    public static void main(String[] args) {
        try{
            int a,b,thuong;
            Scanner sc = new Scanner(System.in);
            System.out.println("a = ");
            a = sc.nextInt();
            System.out.println("b = ");
            b = sc.nextInt();
            thuong = a/b;
            System.out.println("a/b = "+thuong);
        }
        catch(java.lang.ArithmeticException e1){
            System.out.println("Loi: "+e1.getMessage());
        }
        catch(java.util.InputMismatchException e2){
            System.out.println("Loi: "+e2.getMessage());
        }
        catch(Exception e3){
            System.out.println("Loi: "+e3.getMessage());
        }
        finally{
            System.out.println("End of process");
        }
    }
}

