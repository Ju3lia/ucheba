/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.factory;

/**
 *
 * @author Painkiller
 */
public abstract class MashineFactory {
    public abstract Processor getProcessor ();
    public abstract Monitor getMonitor ();
    public abstract HardDisk getHardDisk ();
}
