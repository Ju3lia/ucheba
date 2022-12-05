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
    return new CheapProcessor();
    }
    public Monitor getMonitor () {
    return new LowResolutions ();
    }
    public HardDisk getHardDisk () {
        return new SmallHD ();
    }   
}
