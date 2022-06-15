/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.thienpvt.mathutil.core;

/**
 *
 * @author maclife
 */
public class MathUtil {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
    }
    
//    public static long getFactory(int n){
//        if(n < 0 || n > 20){
//            throw new IllegalArgumentException("Invalid argument must be between 0 and 20");
//        }
//        
//        if(n == 0 || n == 1) return 1;
//        
//        long product = 1;
//        
//        for (int i = 2; i <= n; i++) {
//            product *= i;
//        }
//        
//        return product;
//    }
    
    //recursion
    //Hiện tượng gọi chính mình vs quy mô khác
    
    public static long getFactorial(int n){
        if(n == 0 || n == 1) return 1;
        
        if(n < 0){
            throw new IllegalArgumentException("The number must be smaller than 0");
        }
        
        return n * getFactorial(n - 1);
         
    }
}
