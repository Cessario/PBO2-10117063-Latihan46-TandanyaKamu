/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pbo2.pkg10117063.latihan46.tandanyakamu;

/*
    Nama : Cessario Shevs Lakita Purwa Adidjaya
    Kelas : IF-2
    Nim : 10117063
    Definisi Program : tandanya kamu
 */
public class Age {

    private int yearBirth;
    private int yearNow;
    private final String red = "\u001B[31m";

    public int getYearBirth() {
        return yearBirth;
    }

    public void setYearBirth(int yearBirth) {
        this.yearBirth = yearBirth;
    }

    public int getYearNow() {
        return yearNow;
    }

    public Age(int yearNow) {
        this.yearNow = yearNow;
    }

    public int hitungUmur() {
        return yearNow - yearBirth;
    }

    public String tandayaKamu(int umur) {
        if (umur >= 0 && umur <= 5) {
            System.out.println("\nTandanya Kamu"+red + "LAGI LUCU-LUCUNYA");
        } else if (umur > 5 && umur <= 10) {
            System.out.println("\nTandanya Kamu"+red+" MASIH ANK-ANAK");
        } else if (umur > 10 && umur <= 13) {
            System.out.println("\nTandanya Kamu"+red+" CHAOS");
        } else if (umur > 13 && umur <= 19) {
            System.out.println("\nTandanya Kamu"+red+" BOCAH BARBAR");
        }else if (umur > 19 && umur <= 29){
            System.out.println("\nTandanya Kamu"+red+" LAGI GALAU NYARI JODOH");
        }else if (umur > 29 && umur <= 35 ){
            System.out.println("\nTandanya Kamu"+red+ "LAGI SIBUK NYARI UANG");
        }else if (umur > 35 && umur <= 150){
            System.out.println("\nTandanya Kamu"+red+" SUDAH TUA");
        }else if (umur < 0 || umur > 150){
            System.out.println("\nTandanya Kamu"+red+"TIDAK TERDETEKSI DI KEHIDUPAN");
                    
        }

        return red;
    }

}
