/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Project/Maven2/JavaApp/src/main/java/${packagePath}/${mainClassName}.java to edit this template
 */

package com.mycompany.massumd;

/**
 *
 * @author Painkiller
 */
public class Massumd {

    public static void main(String[] args) {
        int [][]Mx = 
    {
        {2,1,1,1,1},
        {1,2,1,1,1},
        {1,1,2,1,1},
        {1,1,1,2,1},
        {1,1,1,1,2},
     };
     
    int i=0;
    int j=0;
    int row = 0;
    int column=0;
    
    row = Mx.length;
    column =Mx[0].length;
      
    for(i=0; i< row;i++)
    {
        for(j = 0;j <= i;j++)
        {
            System.out.print(Mx[i][j]+ " ");
            
        }
    
        System.out.println();   
    }      
}
}
