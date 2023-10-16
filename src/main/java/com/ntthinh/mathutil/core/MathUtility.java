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
            return 1;   //NEEYS N ĐẶC BIỆT TA RETURN SỚM HƠN
        return n * getFactorial(n-1);
        //tối ưu code, thay ruột của hàm để chạy ngon hơn chẳn hạn, nhanh hơn nếu muốn hoặc code viết đẹp hơn hoặc fix bug thì sửa code
        //DÙ BẠN SỬA CODE GVIF LÍ DO GÌ THÌ CODE PHẢI ĐƯỢC TEST LẠI VÀ TEST LẠI ĐỂ ĐẢM BẢO RẰNG NÓ VẪN XANH NHƯ LẦN TRC
        //NẾU TA VIẾT CODE ĐI KÈM TEST SCRIPT THÌ VIỆC TEST HÀM LẠI
        //CÁI HÀM SẼ CỰC NHANH, KHÔNG CẦN DÙNG MẮT ĐỂ ĐO TỪNG DÒNG LỆNH ĐÚNG
        //SAI, MÀ CHỈ NHÌN MÀU XANH LÀ ĐỦ - VIFHAMF TRẢ VỀ NHƯ EXPECTED
        //TEST LẠI NHỮNG GÌ ĐÃ TỪNG TEST -> REGRESSION TEST KIỂM THỬ HỒI QUY
        //KIỂM THỬ LẠI HÀM LÚC NÀY CỰC NHANH, VÌ GUTHUB ACTIONS LO GIÙM
        //TA CHỈ CẦN MÀU XANH, HOẶC NHẬN EMAIL CHỬI VÌ CODE ĐỎ
        
        //N! = N X (N-1)! -> ĐỆ QUY XUẤT HIỆN
        //ĐỆ QUY - RECURSION - GỌI LẠI CHÍNH MÌNH VỚI QUY MÔ NHỎ HƠN

    }
    
//    public static long getFactorial(int n){
//        if(n < 0 || n > 20)
//            throw new IllegalArgumentException("Invalid n. n must be 0..20");
//        if(n == 0 || n == 1)
//            return 1;
//        long result = 1; //sống sót đến lệnh này , sure n= 2..20
//        for (int i = 2; i <= n; i++) 
//            result *= i;
//        
//        return result;
//    }
}
