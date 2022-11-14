/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Project/Maven2/JavaApp/src/main/java/${packagePath}/${mainClassName}.java to edit this template
 */

package com.mycompany.massum;

/**
 *
 * @author Painkiller
 */
public class Massum {

    public static void main(String[] args) {
       int sum = 0;
       int [][] Mas = {{1,1,1,1,1},{1,1,1,1,1},{1,1,1,1,1},{1,1,1,1,1},{1,1,1,1,1}};
       int row = Mas.length;
       for (int i = 0; i<row; i++){
           for (int j=0; j<row; j++){
               sum = sum + Mas[i][j];
           }
       }
       System.out.println ( "Сумма равна = " + sum);
    }
    
}
