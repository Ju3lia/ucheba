/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Project/Maven2/JavaApp/src/main/java/${packagePath}/${mainClassName}.java to edit this template
 */

package com.mycompany.sortsdvig;

/**
 *
 * @author Painkiller
 */
public class Sortsdvig {

    public static void main(String[] args) {
       int[]arr={3,7,4,9,1,0,5};
       for (int i=1; i<arr.length; i++){
           int x = arr[i];
           int j = i-1;
           while (j>=0&&arr[j]>x){
               arr [j+1] = arr [j];
               j--;
           }
           arr[j+1]=x;
           printArray(arr);
        }
       printArray(arr);
    }
    
    public static void printArray(int[] arr) {
        for (int i=0; i<arr.length; i++){
           System.out.printf ("%d ",arr[i]);
       }
        System.out.println();
    }
}