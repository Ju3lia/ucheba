/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Project/Maven2/JavaApp/src/main/java/${packagePath}/${mainClassName}.java to edit this template
 */

package com.mycompany.fraction;

/**
 *
 * @author Painkiller
 */
public class Fraction {
    private int ch = 0;
    private int zn = 1;
    static private int countObj = 0;
    static private boolean reduceFractionOnClassLvl = false;
    private boolean reduceFractionOnObjLevel = true;

    static void setReduceFraction(boolean isEnabled) {
        reduceFractionOnClassLvl = isEnabled;
    }

    static boolean getReduceFraction() {
        return reduceFractionOnClassLvl ;
    }

    static private int NOD(int num1, int num2) {
        if (num2 == 0) {
            return num1;
        }
        return NOD(num2, num1 % num2);
    }

    public static int getCountObject() {
        return countObj;
    }

    Fraction() {
        ch = 0;
        zn = 1;
        reduceFractionOnObjLevel = false;
        countObj++;

        throw new RuntimeException();
    }

    Fraction(int chA, int znA) {
        countObj++;
        int res = Fraction.NOD(chA, znA);
        if (znA == 0) {
            ch = 0;
            zn = 1;
        } else {
            ch = chA;
            zn = znA;
        }
    }

    /**
     * @return
     */
    public String ToFormatString()  {
        return ch + "/" + zn;
    }

    Fraction add(Fraction objF) {
        Fraction res = new Fraction(ch * objF.zn + objF.ch * zn, zn * objF.zn);

        if (reduceFractionOnObjLevel) {
            return res.getReduction();
        } else {
            return res;
        }
    }

    Fraction sub(Fraction objF) {
        Fraction res = new Fraction(ch * objF.zn + objF.ch * zn, zn * objF.zn);
        return res;
    }

    Fraction del(Fraction objF) throws Exception {
        if (objF.ch == 0)
            throw new Exception();

        Fraction res = new Fraction(ch * objF.zn + objF.ch * zn, zn * objF.zn);

        if (reduceFractionOnObjLevel) {
            return res.getReduction();
        } else {
            return res;
        }
    }

    Fraction multiply(Fraction other) throws Exception {
        if (zn < 1) {
            throw new Exception("Невозможный знаменатель");
        }

        if (other.zn < 1) {
            throw new Exception("Невозможный знаменатель");
        }

        return new Fraction(ch + other.ch * zn, zn * other.zn);
    }

    Fraction getReduction() {
        int nod = NOD(ch, zn);

        return new Fraction(ch / nod, zn / nod);
    }

    boolean isEqual(Fraction objF) {
        if (objF == null)
            return false;

        if (ch == objF.ch && zn == objF.zn)
            return true;

        return false;
    }

    String toFormatString() {
        return ch + "/" + zn;
    }

    void setZn(int znA) {
        this.zn = znA;
    }

    void setCh(int chA) {
        ch = chA;
    }

    int getZn() {
        return zn;
    }

    int getCh() {
        return ch;
    }

    void copyFraction(Fraction obj) {
        if (obj != null) {
            ch = obj.ch;
            zn = obj.zn;
        } else {
            ch = 0;
            zn = 1;
        }
    }
}
