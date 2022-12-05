/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Project/Maven2/JavaApp/src/main/java/${packagePath}/${mainClassName}.java to edit this template
 */

package com.mycompany.udal_chet_chis;

import java.util.Scanner;

/**
 *
 * @author Painkiller
 */
public class Udal_chet_chis {

    public static void main(String[] args) {
        int num = 0; 
        int rez = 0; 
        int pow10 = 1; 
            Scanner myScnr = new Scanner(System.in);
            System.out.println("Введите начальное число:");
            num = myScnr.nextInt();
                while (num!=0)
                    {if (num % 2 != 0)
                    {rez = rez + num % 10 * pow10;
                     pow10 = pow10*10;   
                    }
                     num = num/10;
                    }
               
       System.out.println(rez);}
    }
        


