/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package demo_collection;

import java.util.TreeMap;

/**
 *
 * @author Tran Manh Truong
 */
public class demo_map {
    public static void main(String[] args) {
        TreeMap tm = new TreeMap();//tạo đối tượng TreeMap
        //thêm các phần tử (cặp key,value) vào TreeMap
        tm.put("cat", "Con mèo");
        tm.put("home", "ngôi nhà");
        tm.put("ball", "quả bóng");
        tm.put("ball", "bóng");//khi thêm phần tử mới trùng key, sẽ đè lên value của phần tử cũ có key tương ứng
        int n = tm.size();//lấy số phần tử của treemap
        System.out.println("size = " + n);
        //duyệt qua các phần tử của TreeMap
        for(Object k : tm.keySet())//hàm keySet() trả lạp tập hợp các key của treemap
        {
            Object v = tm.get(k);//lấy value của phần tử có key k
            System.out.println(k + " : " + v);
        }
    }
}
