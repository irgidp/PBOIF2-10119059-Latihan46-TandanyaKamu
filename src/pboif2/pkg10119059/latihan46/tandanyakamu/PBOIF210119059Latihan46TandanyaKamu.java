/* 
* @author
 * NAMA        : Irgi Dwiputra
 * KELAS       : IF-2
 * NIM         : 10119059
 * Deskripsi   : Program ini berisi menampilkan Tandanya Kamu
 */
package pboif2.pkg10119059.latihan46.tandanyakamu;
/**
 *
 * @author Corazon
 */
import java.util.Calendar;
import java.util.Scanner;

public class PBOIF210119059Latihan46TandanyaKamu {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        Age umur = new Age(Calendar.getInstance().get(Calendar.YEAR));
        
        System.out.print("Masukkan Tahun Lahir Anda : ");
        umur.setYearBirth(input.nextInt());
        System.out.println("");
        
        System.out.println("===== Hasil Perhitungan Umur =====");
        System.out.println("Tahun lahir anda : " +umur.getYearBirth());
        System.out.println("Hari ini tahun : " +umur.getYearNow());
        System.out.println("Umur kamu sampai hari ini adalah " +umur.hitungUmur() +" Tahun");
        System.out.println("Tandanya Kamu " +umur.tandanyaKamu(umur.hitungUmur()));
    }
    
}
