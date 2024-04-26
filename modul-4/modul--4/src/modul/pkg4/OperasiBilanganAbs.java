 /*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package modul.pkg4;
import java.util.Scanner;

abstract class OperasiBilanganAbs {
    protected double a, b, c;

    protected abstract void setA(double a);
    protected abstract void setB(double b);
    protected abstract void setC();
    protected abstract double getA();
    protected abstract double getB();
    protected abstract double getC();
    protected abstract void tampil();
}
