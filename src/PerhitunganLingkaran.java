import java.util.Scanner;

/**
 *
 * @author
 * NAMA     : Arsy Opraza Akma
 * KELAS    : IF1
 * NIM      : 10119001
 * Deskripsi Program: Program ini menghitung keliling dan luas lignkaran
 * dimana inputannya berasal dari user
 */

public class PerhitunganLingkaran {
    public static void main(String[] args) {
        Scanner scanner;
        int diameter;
        double phi;
        int jariLingkaran,
                luasLingkaran,
                kelilingLingkaran;

        System.out.println("=====Perhitungan Lingkaran=====");
        scanner = new Scanner(System.in);

        while (true) {
            System.out.print("Masukkan nilai diameter lingkaran : ");
            try {
                diameter = Integer.parseInt(scanner.next());
                break;
            } catch (NumberFormatException ignore) {
                System.out.println("Nilai Diameter Tidak Sesuai");
            }
        }

        phi = 3.14;
        jariLingkaran = diameter / 2;
        luasLingkaran = (int) (phi * (jariLingkaran * jariLingkaran));
        kelilingLingkaran = (int) (phi * 2 * jariLingkaran);

        System.out.println("\n");
        System.out.println("=====Hasil Perhitungan Lingkaran=====");
        System.out.println("Jari-jari Lingkaran = " + jariLingkaran + " cm");
        System.out.println("Luas Lingkaran = " + luasLingkaran + " cm");
        System.out.println("Keliling Lingkaran = " + kelilingLingkaran + " cm");
    }
}
