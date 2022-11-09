/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Project/Maven2/JavaApp/src/main/java/${packagePath}/${mainClassName}.java to edit this template
 */

package com.mycompany.sort1;

/**
 *
 * @author Painkiller
 */
public class Sort1 {

    public static void main(String[] args) {
       int i=0;
       int[]arr={9,6,3,1};
       int temp=0;
       int size = arr.length;
       int k=size;
       for (k=0;k < arr.length-1;k++){
       for (i=0; i < arr.length-1-k; i++){
           if (arr[i] >= arr[i+1])
           {
               temp=arr[i];
               arr [i] = arr [i+1];
               arr [i+1] = temp;
           }
       }
       }
       for (i=0; i<arr.length; i++){
       System.out.printf ("%d ", arr[i]);
    }
    }
}
