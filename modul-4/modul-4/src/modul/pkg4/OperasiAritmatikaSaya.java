/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package modul.pkg4;

/**
 *
 * @author ASUS
 */
public class OperasiAritmatikaSaya extends OperasiAritmatika {
    public OperasiAritmatikaSaya(double a, double b) {
        super(a, b);
    }

    @Override
    public double penjumlahan() {
        return a + b;
    }

    @Override
    public double pengurangan() {
        return a - b;
    }

    @Override
    public double perkalian() {
        return a * b;
    }

    @Override
    public double pembagian() {
        return a / b;
    }
}

    

