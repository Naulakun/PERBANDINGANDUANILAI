/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package soal8;

/**
 *
 * @author
 * NAMA         : AYIP NANDANG MAULANA
 * NIM          : 23215032
 * KELAS        : PBO 1 REG.SORE
 * DESKRIPSI    : PERBANDINGAN DUA BUAH NILAI
 */
import java.util.Scanner;

public class SOAL8 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String ulangi;

        do {
            System.out.println("=== Program Perbandingan Nilai === ");
            
            // Meminta input dua nilai dari pengguna
            System.out.print("Masukkan nilai pertama: ");
            int nilai1 = scanner.nextInt();

            System.out.print("Masukkan nilai kedua: ");
            int nilai2 = scanner.nextInt();

            // Membandingkan kedua nilai
            if (nilai1 == nilai2) {
                System.out.println("Hasil: NILAI SAMA");
            } else if (nilai1 > nilai2) {
                System.out.println("Hasil: " + nilai1 + " Lebih Besar dari " + nilai2);
            } else {
                System.out.println("Hasil: " + nilai1 + " ebih Kecil dari " + nilai2);
            }

            // Menanyakan apakah pengguna ingin mengulangi
            System.out.print("Ingin mengulangi aktivitas? (Ya/Tidak): ");
            ulangi = scanner.next();
            
        } while (ulangi.equalsIgnoreCase("Ya"));

        // Menutup scanner
        scanner.close();
        System.out.println("Program selesai.");
    }
}
