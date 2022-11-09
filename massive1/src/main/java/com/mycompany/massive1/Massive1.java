/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Project/Maven2/JavaApp/src/main/java/${packagePath}/${mainClassName}.java to edit this template
 */

package com.mycompany.massive1;

import java.util.Scanner;

/**
 *
 * @author Painkiller
 */
public class Massive1 {

    public static void main(String[] args) { 
        int[]arr={10,20,30,40,50,60,70,80,90,100};
        int i = 0;
           for (i=0; i< arr.length && arr[i]<arr[i+1]; i++)
           {}
           if (i == arr.length)
           {
                System.out.println ("Упорядоченный по возрастанию");
           }
           else
           {
               System.out.println ("Неупорядоченный по возрастанию" );
           }
}
}