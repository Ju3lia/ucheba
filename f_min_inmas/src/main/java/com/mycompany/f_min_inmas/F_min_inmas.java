/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Project/Maven2/JavaApp/src/main/java/${packagePath}/${mainClassName}.java to edit this template
 */

package com.mycompany.f_min_inmas;

/**
 *
 * @author Painkiller
 */
public class F_min_inmas {

    public static int findFirstMin(int[] array) {
if (array == null) return -1;
if (array.length == 0) return -1;

int index = 0;

for (int i =0; i < array.length; i++) {
if (array[i] < array[index]) {
index = i;
}
}

return index;
}

public static void main(String[] args) {
int[] array = new int[] {5, 3, 6, 2, 8, 9};
int index = findFirstMin(array);
System.out.println(index);
}
}
