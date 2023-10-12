/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/UnitTests/JUnit5TestClass.java to edit this template
 */
package com.ntthinh.mathutil.core;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
 *
 * @author Ivor
 */
public class MathUtilityTest {
    
    
    //TEST CASE TEMPLATE/ STRUCTURE:
    //ID | DESCRISPTION | STEPS/PROCEDURES | EXPECTED RESULT | STATUS (PASSED/FAILD)
    
    //Test case #1: Verify the getFactorial() function with n = 0
    //Steps/Procedures:
    //      1. Given n = 0
    //      2. Call/Invoke getFactorial(int n)
    //Expected Result
    //      The method getFactorial(n = 0) must return 1
    //                       as the result of 0! == 1
    //Status: PASSED | FAILED ĐOÁN XEM KHI CHẠY APP/HÀM/METHOD
    @Test //dính dáng đến Thuật ngữ framework
    public void verifyFactorialGivenRightArgument0ReturnOk(){
        assertEquals(1, MathUtility.getFactorial(0));
    }
    
    //Test case #2: Verify the getFactorial() function with n = 1
    //Steps/Procedures:
    //      1. Given n = 1
    //      2. Call/Invoke getFactorial(int n)
    //Expected Result
    //      The method getFactorial(n = 1) must return 1
    //                       as the result of 1! == 1
    //Status: PASSED | FAILED ĐOÁN XEM KHI CHẠY APP/HÀM/METHOD
    @Test //dính dáng đến Thuật ngữ framework
    public void verifyFactorialGivenRightArgument1ReturnOk(){
        assertEquals(1, MathUtility.getFactorial(1));
    }
    
    //Test case #2: Verify the getFactorial() function with n = 6
    //Steps/Procedures:
    //      1. Given n = 6
    //      2. Call/Invoke getFactorial(int n)
    //Expected Result
    //      The method getFactorial(n = 6) must return 720
    //                       as the result of 6! == 720
    //Status: PASSED | FAILED ĐOÁN XEM KHI CHẠY APP/HÀM/METHOD
    @Test //dính dáng đến Thuật ngữ framework
    public void verifyFactorialGivenRightArgument6ReturnOk(){
        assertEquals(720, MathUtility.getFactorial(6));
    }
    
}
