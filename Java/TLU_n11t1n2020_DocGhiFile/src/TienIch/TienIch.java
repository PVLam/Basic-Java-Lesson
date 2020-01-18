package TienIch;

import java.util.Scanner;

public class TienIch {
    public boolean isINT(String s){
    try{
        int n = Integer.parseInt(s);
        return true;
    }catch(Exception e){
        System.out.println("Is not an Integer");
        return false;
        }
    }
    public static int inputINT(){
        Scanner sc = new Scanner(System.in);
        while(true){
            String s = sc.nextLine();
            if(isINT(s)==true)
                System.out.println("Nhap lai so nguyen: ");
            else
                return Integer.parseInt(s);
        }
    }
}
