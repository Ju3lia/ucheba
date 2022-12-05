/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.factory;

/**
 *
 * @author Painkiller
 */
public class LowBudgetMachine extends MashineFactory {
    public Processor getProcessor (){
    return CheapProcessor();
    }
    public Monitor getMonitor () {
    return LowResolutions ();
    }
    public HardDisk getHardDisk () {
        return SmallHD ();
    }   
}
