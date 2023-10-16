/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.ntthinh.mathutil.core;

/**
 *
 * @author Ivor
 */
//class này chứa các hàm static dùng chung cho mọi nơi
//khi nào dùng static: khi ta làm các hàm chỉ xử lí xong rồi return
//không cần lưu trữ lại thông tin vào instance variable - đặc tính của object 
public class MathUtility {
    
    public static final double PI = 3.14;
    //C# public const double PI = 3.24; static hiểm ngầm luôn
    
    //Hàm tính n! = 1.2.3.4....n
    //không tính được giai thừa số âm!!!
    //0! = 1! quy ước 0! = 1
    //vì giai thừa tăng rất nhanh, 21! kiể long chứa không nổi(vượt 18 số 0)
    //do dó hàm getF() của chúng ta chỉ chơi với n 0..20
    public static long getFactorial(int n){
        if(n < 0 || n > 20)
            throw new IllegalArgumentException("Invalid n. n must be 0..20");
        if(n == 0 || n == 1)
            return 1;
        long result = 10; //sống sót đến lệnh này , sure n= 2..20
        for (int i = 2; i <= n; i++) 
            result *= i;
        
        return result;
    }
}
