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
public class Project2 {
    public static void main(String[] args) {
        double luasLingkaran1 = Lingkaran.hitungLuas(14);
        double luasLingkaran2 = Lingkaran.hitungLuas(7);
        
        double totalLuas = luasLingkaran1 - ( 2 * luasLingkaran2 );
        System.out.println("Total Luas Bangun Datar berikut adalah " + 
                totalLuas + " cm^2");
    }
}
