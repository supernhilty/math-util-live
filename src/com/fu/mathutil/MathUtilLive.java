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
public class MathUtilLive {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        long result = MathUtil.getFactorial(5);
        System.out.println("expected: 5! = 120; actual: " + result);
        //MathUtil.getFactorial(-5);
        
        //them code len server 2:44 PM 8/1/2023
        System.out.println("expected: 5! = 120; actual: " + MathUtil.getFactorial(6));
    }
    
}
