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
         int sum = 0;
         int [][] Mas = {{0,1,1,1},{0,0,1,1},{0,0,0,1},{0,0,0,0}};
         Mas = new int [4][4];
         int row = Mas.length;
         int column = Mas[0].length;
         for (int i = 0; i<row; i++){
             for (int j=0; j = ; j++){
                 sum = sum + Mas[i][j];
             }  
         }
         System.out.println ( "Сумма равна = " + sum);
    }
}
