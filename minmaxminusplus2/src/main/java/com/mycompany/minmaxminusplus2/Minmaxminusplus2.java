/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Project/Maven2/JavaApp/src/main/java/${packagePath}/${mainClassName}.java to edit this template
 */
package com.mycompany.minmaxminusplus2;

import java.util.Scanner;

/**
 *
 * @author Painkiller
 */
public class Minmaxminusplus2 {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("Введите три любых целых числа:");
        int num1 = in.nextInt();
        int num2 = in.nextInt();
        int num3 = in.nextInt();
        if ((num1 < num2) && (num1 < num3) && (num2 > num3)) {
            System.out.println("" + (num1 + 2) + "" + (num2 - 2) + "" + num3);
        } 
        else
            if ((num2 < num1) && (num2 < num3) && (num1 > num3)) {
            System.out.println("" + (num2 + 2) + "" + (num1 - 2) + "" + num3);
        } 
        else
                if ((num3 < num1) && (num3 < num2) && (num1 > num2)) {
            System.out.println("" + (num3 + 2) + "" + (num1 - 2) + "" + num2);
        }
        else
                    if ((num1 < num2) && (num1 < num3) && (num3 > num2)) {
            System.out.println(""+(num1 + 2) +""+ (num3 - 2)+ "" + num2);
        } else
                        if ((num2 < num1) && (num2 < num3) && (num3 > num1)) {
            System.out.println(""+(num2 + 2) +""+ (num3 - 2)+ "" + num1);
        } 
               else             if ((num3 < num1) && (num3 < num2) && (num2 > num1)) {
            System.out.println(""+(num3 + 2) +""+ (num2 - 2) +""+ num1);
        }    
        else
            if ((num1==num2) && (num1<num3)){
                    System.out.println(""+(num1 + 2) +""+ (num2 + 2) +""+ (num3-2)+"");
                    } else
            if ((num1==num2) && (num1>num3)){
                    System.out.println(""+(num1 - 2) +""+ (num2 - 2) +""+ (num3+2)+"");
                    } else
            if ((num1==num3) && (num1<num2)){
                    System.out.println(""+(num1 + 2) +""+ (num3 + 2) +""+ (num2-2)+"");
                    } else
            if ((num1==num3) && (num1>num2)){
                    System.out.println(""+(num1 - 2) +""+ (num3 - 2) +""+ (num2+2)+"");
                    } else
            if ((num2==num3) && (num2<num1)){
                    System.out.println(""+(num3 + 2) +""+ (num2 + 2) +""+ (num1-2)+"");
                    } else
            if ((num2==num3) && (num2>num1)){
                    System.out.println(""+(num3 - 2) +""+ (num2 - 2) +""+ (num1+2)+"");
                    }   
       
                else {
            System.out.println("Все значения равны");
        }

    }
}
