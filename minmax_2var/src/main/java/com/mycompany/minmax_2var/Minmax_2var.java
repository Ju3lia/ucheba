/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Project/Maven2/JavaApp/src/main/java/${packagePath}/${mainClassName}.java to edit this template
 */
package com.mycompany.minmax_2var;
import java.util.Scanner;
/**
 *
 * @author Painkiller
 */
public class Minmax_2var {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("Введите три любых целых числа:");
        int num1 = in.nextInt();
        int num2 = in.nextInt();
        int num3 = in.nextInt();

        int max = num1;
        if (num2 > max) {
            max = num2;
        }
        if (num3 > max) {
            max = num3;
        }

        int min = num1;
        if (num2 < min) {
            min = num2;
        }
        if (num3 < min) {
            min = num3;
        }

        max = max-2;
        min = min-2;

        System.out.printf("max = %d, min = %d", max, min);
    }
}
