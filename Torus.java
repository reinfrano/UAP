package uap.models;

import uap.bases.Shape;
import uap.interfaces.*;

/**
 * Kelas untuk bentuk torus (donat dengan lubang).
 * Menghitung volume, luas permukaan, massa, konversi ke kilogram, dan biaya kirim.
 */
public class Torus extends Shape implements ThreeDimensional, PiRequired, MassCalculable, MassConverter, ShippingCostCalculator {
    private double majorRadius; // jari-jari utama (besar)
    private double minorRadius; // jari-jari kecil (lubang)

    // Konstruktor
    public Torus(double majorRadius, double minorRadius) {
        this.majorRadius = majorRadius;
        this.minorRadius = minorRadius;
    }

    // Menghitung volume torus: V = 2 * π² * R * r²
    @Override
    public double getVolume() {
        return 2 * PI * PI * majorRadius * minorRadius * minorRadius;
    }

    // Menghitung luas permukaan torus: A = 4 * π² * R * r
    @Override
    public double getSurfaceArea() {
        return 4 * PI * PI * majorRadius * minorRadius;
    }

    // Menghitung massa = luas permukaan * densitas * ketebalan
    @Override
    public double getMass() {
        return getSurfaceArea() * DENSITY * THICKNESS;
    }

    // Konversi gram ke kilogram
    @Override
    public double gramToKilogram() {
        return getMass() / DENOMINATOR;
    }

    // Menghitung biaya kirim dalam rupiah, dibulatkan ke atas per kg
    @Override
    public double calculateCost() {
        return Math.ceil(gramToKilogram()) * PRICE_PER_KG;
    }

    // Menampilkan semua informasi perhitungan
    @Override
    public void printInfo() {
        System.out.printf("Volume            : %.2f\n", getVolume());
        System.out.printf("Luas permukaan    : %.2f\n", getSurfaceArea());
        System.out.printf("Massa             : %.2f\n", getMass());
        System.out.printf("Massa dalam kg    : %.2f\n", gramToKilogram());
        System.out.printf("Biaya kirim       : Rp%.0f\n", calculateCost());
    }
}