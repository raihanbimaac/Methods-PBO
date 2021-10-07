/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package projectluasbangunkompleks;

/**
 *
 * @author TOSHIBA
 */
public class Project1 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        double luasLingkaran = Lingkaran.hitungLuas(21);
        double luasPersegi = Persegi.hitungLuas(42);
        
        double totalLuas = ( 2 * luasLingkaran ) + luasPersegi;
        System.out.println("Total Luas Bangun Datar berikut adalah " + 
                totalLuas + " cm^2");
    }
    
}
