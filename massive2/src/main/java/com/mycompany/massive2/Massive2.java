/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Project/Maven2/JavaApp/src/main/java/${packagePath}/${mainClassName}.java to edit this template
 */

package com.mycompany.massive2;
import java.util.Scanner;
/**
 *
 * @author Painkiller
 */
public class Massive2 {

    public static void main(String[] args) 
    {
        Scanner in = new Scanner (System.in);
        int[]arr={10};
        int[]arr2={10, 20, 30, 40, 50, 60, 70, 80, 90, 100};
        int[]arr3={10, 20, 80, 90, 100};
         
        System.out.println("Введите x ");
        
        int x= in.nextInt();
        
        check(arr, x);
        check(arr2, x);
        check(arr3, x);
    }
    
    public static void check(int[] arr, int x) {
        int i = -1;
        int l = 0;
        int r = arr.length;
        
        for (;l<=r&&l<arr.length;){
            int middle = (l+r)/2;
            if (arr[middle]<x){
                l = middle+1;
            } else {
                if (arr[middle]>x){
                    r=middle-1;
                } else {
                    if (arr[middle]==x) {
                        i=middle;
                        break;
                    }
                }
            } 
                
                
        }
        System.out.println(i);
    }
       
}


