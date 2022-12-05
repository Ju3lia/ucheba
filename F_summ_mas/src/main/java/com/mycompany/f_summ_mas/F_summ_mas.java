/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Project/Maven2/JavaApp/src/main/java/${packagePath}/${mainClassName}.java to edit this template
 */

package com.mycompany.f_summ_mas;

/**
 *
 * @author Painkiller
 */
public class F_summ_mas {
    
    public static int summ (int[]arr){
        int sum = 0;
        for (int i=0; i<arr.length; i++){
            sum = sum + arr[i];
        }
        return sum;
    }

    public static void main(String[] args) {
        int []arr = {7,3,8,2,9};
        int rez = summ (arr);
        System.out.println (rez);
        
    }
}
