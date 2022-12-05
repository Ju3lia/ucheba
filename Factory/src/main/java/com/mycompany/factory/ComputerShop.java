/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.factory;

/**
 *
 * @author Painkiller
 */
public class ComputerShop {
     MashineFactory category;
    public ComputerShop (MashineFactory category){
       this.category = category;
    }   
    public void AssembleMashine (){
Processor processor = category.getProcessor();
HardDisk hdd = category.getHardDisk();
Monitor monitor = category.getMonitor();
processor.PerformOperation();
hdd.StoreData();
monitor.DisplayPicture();
}
}
