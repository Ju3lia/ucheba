/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Project/Maven2/JavaApp/src/main/java/${packagePath}/${mainClassName}.java to edit this template
 */

package com.mycompany.f_sum_gld;

/**
 *
 * @author Painkiller
 */
public class F_sum_gld {
    
    public static int Summ(int [][]Mx)
{
        int sum = 0;
        int row = Mx.length;
        int column = Mx[0].length;

            for(int i = 0;i<row;i++)
        {  
                for(int j = 0;j<=i;j++)
            { 
                sum = sum + Mx[i][j];
            }    
        }
    return sum; 
}

    public static void main(String[] args) {
        int [][]Mx = 
    {
        {1,1,1,1,1},
        {1,1,1,1,1},
        {1,1,1,1,1},
        {1,1,1,1,1},
        {1,1,1,1,1},
            
    };
        int i=0;
        int j=0;
        int rez = Summ(Mx);
        for(i=0; i<Mx.length; i++){
            Summ(Mx);
        } 
        System.out.println("Сумма равна = " + rez);
    }
}
