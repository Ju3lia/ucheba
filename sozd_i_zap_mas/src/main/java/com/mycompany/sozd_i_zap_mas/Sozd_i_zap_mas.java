/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Project/Maven2/JavaApp/src/main/java/${packagePath}/${mainClassName}.java to edit this template
 */

package com.mycompany.sozd_i_zap_mas;

/**
 *
 * @author Painkiller
 */
public class Sozd_i_zap_mas {
    public static int [][] CreatArr (int N, int M){
        int [][]arr = new int [N][M];
        return arr;
    }
            
    public static void FillArray(int []arr,int rangeA,int rangeB)
    {
       if(arr!=null)
        {
            for(int ix=0;ix<arr.length;ix++)
            {
                arr[ix] = rangeA + (int) (Math.random() * rangeB);
            }
        }
    }
     public static void PrintArrayToConsole(int []arr)
    {
        if(arr != null)
        {
            for(int ix = 0;ix < arr.length; ix++){
                
                System.out.print(arr[ix]+" ");
        }
        }
        else
        {
            System.out.print("Array is empty");
            
        }   
    }

    public static void main(String[] args)
    {
       int [][]Mx = CreatArr(10,10);
       
       
       for(int ix = 0;ix < Mx.length; ix++)
       {
           FillArray(Mx[ix],1,9 );
       }
        
        for(int ix = 0;ix < Mx.length; ix++)
       {
           PrintArrayToConsole(Mx[ix]);
           System.out.println();
       }
    }
}
   


