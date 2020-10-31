/*
 *
 * @author
 * NAMA     :   Adam Firdaus D
 * KELAS    :   IF2
 * NIM      :   10119078
 * DESKRIPSI:   Berisi codingan untuk menampilkan variabel
 *
 */
package pboif2.pkg10119078.latihan20.targetsaldotabungan;

import java.util.Scanner;

/**
 *
 * @author ryzen
 */
public class PBOIF210119078Latihan20TargetSaldoTabungan {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        int saldoAwal , besarBunga, saldoTarget;
        double bunga;
        
        Scanner scanner = new Scanner (System.in);
        System.out.printf("Saldo Awal: Rp. ");
        saldoAwal = scanner.nextInt();
        
        System.out.printf("Bunga/Bulan : ");
        besarBunga = scanner.nextInt();
        
        System.out.printf("Saldo Target: ");
        saldoTarget = scanner.nextInt();
        

        for (int i = 1; saldoAwal <= saldoTarget; i++ ){
            bunga = ((saldoAwal * besarBunga) / 100 );
            saldoAwal += bunga;
        
            System.out.println("Saldo di bulan ke-"+ i + " Rp. " + saldoAwal);
        }
    }
    
}
