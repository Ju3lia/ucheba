/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Project/Maven2/JavaApp/src/main/java/${packagePath}/${mainClassName}.java to edit this template
 */

package com.mycompany.factory;

/**
 *
 * @author Painkiller
 */
public class Factory {

    public static void main(String[] args) {
       Factory Computer = new Factory();
    }
}
public class ComputerShop { 
    MashineFactory category;
    public ComputerShop (MashineFactory category){
        category = category;
    }   
};
public void AssembleMashine (){
Processor processor = category.getProcessor();
HardDisk hdd = category.getHardDisk();
Monitor monitor = category.getMonitor();
processor.PerformOperation();
hdd.StoreData();
monitor.DisplayPicture();
}}
