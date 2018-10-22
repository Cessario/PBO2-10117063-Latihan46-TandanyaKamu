/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pbo2.pkg10117063.latihan46.tandanyakamu;

import java.util.Scanner;

/*
    Nama : Cessario Shevs Lakita Purwa Adidjaya
    Kelas : IF-2
    Nim : 10117063
    Definisi Program : tandanya kamu
 */
public class PBO210117063Latihan46TandanyaKamu {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
      
        Scanner sc = new Scanner (System.in);
        
         Age ag = new Age(2018);
        System.out.print("Masukkan tahun lahir anda : ");
        ag.setYearBirth(sc.nextInt());
        System.out.println("");
        System.out.print("=====Hasil Perhitungan Umur=====");
        System.out.print("\nTahun lahir anda : "+ag.getYearBirth());
        System.out.print("\nHari ini Tahun : "+ag.getYearNow());
        System.out.print("\nUmur kamu sampai hari ini adalah "+ ag.hitungUmur()+ " Tahun");
        ag.tandayaKamu(ag.hitungUmur());
    }
    
}
