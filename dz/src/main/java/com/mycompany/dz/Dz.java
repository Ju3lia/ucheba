/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Project/Maven2/JavaApp/src/main/java/${packagePath}/${mainClassName}.java to edit this template
 */

package com.mycompany.dz;

/**
 *
 * @author Painkiller
 */
import java.util.Scanner;

public class Dz {

    public static void main(String[] args) {
        
    Scanner in = new Scanner (System.in);
    System.out.print ("Введите три любых целых числа:");
    int num1 = in.nextInt();
    int num2 = in.nextInt();
    int num3 = in.nextInt();
    
        int array[] = new int[]{num1, num2, num3};
 
    int max = getMax(array);
    System.out.println((max-2));
 
    int min = getMin(array);
    System.out.println((min+2));
  }
  public static int getMax(int[] inputArray){ 
    int maxValue = inputArray[0]; 
    for(int i=1;i < inputArray.length;i++){ if(inputArray[i] > maxValue){ 
         maxValue = inputArray[i]; 
      } 
    } 
    return maxValue; 
  }
  public static int getMin(int[] inputArray){ 
    int minValue = inputArray[0]; 
    for(int i=1;i<inputArray.length;i++){ 
      if(inputArray[i] < minValue){ 
        minValue = inputArray[i]; 
      } 
    } 
    return minValue; 
    }
}
