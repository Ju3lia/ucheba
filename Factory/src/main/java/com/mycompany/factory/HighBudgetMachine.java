/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.factory;

/**
 *
 * @author Painkiller
 */
public class HighBudgetMachine extends MashineFactory {
    public Processor getProcessor (){
    return new ExpensiveProcessor();
    }
    public Monitor getMonitor () {
    return new HighResolutions ();
    }
    public HardDisk getHardDisk () {
        return new BigHD ();
    }   
}
