/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.fu.mathutil;

/**
 *
 * @author leyen
 */
//class cung caps tien ich cho noi khac sai
//khi ta cung cap tien ich cho noi khac xai, do la luc ta khong can nho 
//cai gi cho rieeng ta, ham static lam dieu nay
public class MathUtil {
    public static long getFactorial(int n) {
        //0! = 1! = 1
        //neu dua vao am, >21 kh tinh(21! qua dai voi kieu long)
        //nem ra exception
        if (n < 0 || n > 20)
            throw new IllegalArgumentException("Invalid arguement. n must be between 0..20");
        if (n == 0 || n ==1)
            return 1;
        long product = 1;
        for (int i = 2; i <= n; i++) {
            product *= i;
        }
        return product;
    }
}
