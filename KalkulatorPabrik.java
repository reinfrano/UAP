package uap.mains;

import java.util.Scanner;
import uap.models.*;

/**
 * Program utama yang digunakan oleh pengguna untuk menghitung cetakan donat rumah.
 * Menampilkan hasil perhitungan volume, massa, dan biaya kirim untuk torus dan bola.
 */
public class KalkulatorPabrik {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Header
        System.out.println("=============================================");
        System.out.println("Kalkulator Pabrik Cetakan Donat Rumahan");
        System.out.print("NAMA LENGKAP : ");
        String nama = scanner.nextLine();
        System.out.print("NIM          : ");
        String nim = scanner.nextLine();
        System.out.println("=============================================");

        // Input dan proses torus (donat berlubang)
        System.out.println("Donat dengan lubang");
        System.out.println("=============================================");
        System.out.print("Isikan Radius Utama : ");
        double R = scanner.nextDouble();
        System.out.print("Isikan Radius Kecil : ");
        double r = scanner.nextDouble();
        Torus torus = new Torus(R, r);
        torus.setName("Donat Lubang");
        System.out.println("=============================================");
        torus.printInfo();

        // Input dan proses bola (donat tanpa lubang)
        System.out.println("=============================================");
        System.out.println("Donat tanpa lubang");
        System.out.println("=============================================");
        System.out.print("Isikan Radius : ");
        double r2 = scanner.nextDouble();
        Sphere sphere = new Sphere(r2);
        sphere.setName("Donat Tanpa Lubang");
        System.out.println("=============================================");
        sphere.printInfo();
        System.out.println("=============================================");

        scanner.close(); 
    }
}