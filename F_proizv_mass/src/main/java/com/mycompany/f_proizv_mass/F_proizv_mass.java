/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Project/Maven2/JavaApp/src/main/java/${packagePath}/${mainClassName}.java to edit this template
 */

package com.mycompany.f_proizv_mass;

/**
 *
 * @author Painkiller
 */
public class F_proizv_mass {

    public static int PeremnojMas(int [][]Mx)
{
        int comp = 1;
        int row = Mx.length;
        int column = Mx[0].length;

            for(int i = 0;i<row;i++)
        {  
                for(int j = 0;j<column;j++)
            { 
                comp = comp * Mx[i][j];
                
            }    
        }
    return comp; 
}

     public static void main(String[] args) {
        int [][]Mx = 
    {
        {2,2,2,2},
        {2,2,2,2},
        {2,2,2,2},
        {2,2,2,2},
            
    };
        int i=0;
        int j=0;
        int rez = PeremnojMas(Mx);
        for(i=0; i<Mx.length; i++){
            PeremnojMas(Mx);
        } 
        System.out.println("Произведение равно = " + rez);
    }
}
