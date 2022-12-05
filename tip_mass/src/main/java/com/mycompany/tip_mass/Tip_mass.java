/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Project/Maven2/JavaApp/src/main/java/${packagePath}/${mainClassName}.java to edit this template
 */

package com.mycompany.tip_mass;
/**
 *
 * @author Painkiller
 */
public class Tip_mass {
     public static void main(String[] args) 
    {
        
        int []arr= {7,12,15,19,20};
        int size = arr.length;
    boolean up  = false,
            down = false,
            equal = false;
    
    for(int i=0;i<size-1;i++){
        if(arr[i]<arr[i+1])
            up=true;
        else
            if(arr[i]>arr[i+1])
                down = true;
        else
                equal = true;        
    }
    
    if(up == true && down == true)
        System.out.println("Массив не упорядочен");
    else
        if(up == true && down ==false)
            System.out.println("Массив упорядочен по возрастанию");
    else
        if(up == false && down == true)
            System.out.println("Массив упорядочен по убыванию");
    else
        if(equal == true)
            System.out.println("Элементы в массиве равны");
    }
    
}
    