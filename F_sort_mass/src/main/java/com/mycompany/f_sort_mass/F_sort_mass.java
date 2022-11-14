/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Project/Maven2/JavaApp/src/main/java/${packagePath}/${mainClassName}.java to edit this template
 */

package com.mycompany.f_sort_mass;

/**
 *
 * @author Painkiller
 */
public class F_sort_mass {

    public static int Sort(int []Arr)
{
int i = 0;
int temp = 0;
int size = Arr.length;
int k = size;
    for (k=0;k < Arr.length-1;k++){
       for (i=0; i < Arr.length-1-k; i++){
           if (Arr[i] >= Arr[i+1])
           {
               temp=Arr[i];
               Arr [i] = Arr [i+1];
               Arr [i+1] = temp;
           }
       }
    }
    return Arr[i];
}
    
     public static void main(String[] args) {
        int []Arr = {7,3,4,1,9,0};
        int rez = Sort(Arr);
         for (int i=0; i<Arr.length; i++){
             Sort(Arr);
       System.out.printf ("%d ", Arr[i]);
    }
     }
        
     }