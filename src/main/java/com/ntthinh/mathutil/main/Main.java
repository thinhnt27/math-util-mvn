/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package com.ntthinh.mathutil.main;

import com.ntthinh.mathutil.core.MathUtility;

/**
 *
 * @author Ivor
 */
public class Main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        //Test case #1 - xem chi tiết mô tả ở dưới (case n = 0 | 0!)
        int n = 0;// tình huống kiểm tra 0!
        long expected = 1; // 0! hy vọng là 1, không cần lập trình cũng ra kq này
        long actual = MathUtility.getFactorial(n); // 0! thực tế là mấy
        
        //so sánh giữa expected == actual hay không?
        System.out.println("0! -> expected = " + expected +
                            " | actual = " + actual);
        
    }
    
    //TEST CASE #2: CHECK getFactorial(with n =1)
    //STEPS/PROCEDURES:
        //      1. Given n = 1;
        //      2. Invoke/call getFactorial(n = 1)
    
    //EXPECTED RESULT : the method returns 1 stands for 1! = 1
        //STATUS          : PASSED?? OR FALLED??=> to be update later, when finishing TEST RUN
    
    
        //DEV PHẢI TEST CODE CỦA MÌNH, CÓ 3 CÁCH
        //SAU ĐÂY LÀ CÁCH 1: IN KẾT QUẢ XỬ LÍ CỦA MÀNG HÌNH
        
        //NHẮC LẠI: CÔNG VIỆC VỦA QC BAO GỒM
        //THIẾT KẾ TEST CASE, RUN TEST CASE, GHI LẠI BUG NẾU CÓ
        //          TEST CASE TEST RUN          LOG BUG
        //Test case: nói ra bạn sẽ test app như thế nào
        //bằng cách đưa vào data, giá trị kì vọng, cách dùng app với bộ data đó
        
        //ĐỀ THI PE LUÔN Ở ĐÂY!! THIẾT KẾ TEST CASE
        //TA THIẾT KẾ TEST CASE DDERD TEST HÀM TÍNH GIAI THỪA TA VỪA VIẾT
        //TEST CODE THÌ ĐƯỢC GỌI LÀ UNIT TEST
        //TEST CASE CHO UNIT TEST THÌ GỌI LÀ "UNIT TEST" TEST CASE
        
        //TEST CASE #1: CHECK getFactorial() with n = 0 
        //STEPS/PROCEDURES:
        //      1. Given n = 0
        //      2. Invoke/call getFactorial(n = 0)
        //EXPECTED RESULT : the method returns 1 stands for 0! = 1
        //STATUS          : PASSED?? OR FALLED??=> lúc test hàm
                                                //mói biết kết quả, gọi là test run
                                                // cps thể test đi test lại nhiều lần
    
    
}
