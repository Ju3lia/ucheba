/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Project/Maven2/JavaApp/src/main/java/${packagePath}/${mainClassName}.java to edit this template
 */

package com.mycompany.dz1;

/**
 *
 * @author Painkiller
 */

import java.util.Scanner;
import java.util.Arrays;

public class Dz1 {
    

    public static void main(String[] args) {
        
        Scanner in = new Scanner (System.in);      
        System.out.print("Input three numbers: ");
        int num1 = in.nextInt();
        int num2 = in.nextInt();
        int num3 = in.nextInt();
        
        int arr[] = {num1, num2, num3};
         Arrays.sort(arr);
         
        for (int values : arr){ 
            System.out.print(values + ", ");
          
    }
    }
}

