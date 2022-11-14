/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Project/Maven2/JavaApp/src/main/java/${packagePath}/${mainClassName}.java to edit this template
 */

package com.mycompany.whatisit;

/**
 *
 * @author Painkiller
 */
public class Whatisit {

    public static void main(String[] args) {
        int i=0;
        int[]arr={3,7,4,9,1,0,5};
        int x = 0;
        for (i=1; arr[i] > arr[i-1]; i++){
            
                arr [i] = x;
                arr [i] = arr [i+1];
            }
        
    
     for (i=0; i<arr.length; i++){
    System.out.printf ("%d ",arr[i]);
}
}
}