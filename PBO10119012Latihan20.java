package pbo10119012latihan20;

import java.util.Locale;

/**
 *
 * @author damai
 * NAMA   : DAMAI SAPUTRA LAOLI
 * KELAS  : IF-1
 * NIM    : 10119012
 */
public class PBO10119012Latihan20 {

    
    public static void main(String[] args) {
        double saldo_awal = 3500000;
        double i = 0;
        do {
            i += 1;
            saldo_awal += Math.floor(saldo_awal * 0.08);
            System.out.printf(Locale.ITALY, "Saldo di bulan ke-%1$.0f Rp. %2$,.0f%n" , i , saldo_awal);
        } while (saldo_awal<6000000);
    }
}