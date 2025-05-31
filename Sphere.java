package uap.models;

import uap.bases.Shape;
import uap.interfaces.*;

/**
 * Kelas untuk bentuk bola (donat tanpa lubang).
 * Menghitung volume, luas permukaan, massa, konversi ke kg, dan biaya kirim.
 */
public class Sphere extends Shape implements ThreeDimensional, PiRequired, MassCalculable, MassConverter, ShippingCostCalculator {
    private double radius; // jari-jari bola

    // Konstruktor
    public Sphere(double radius) {
        this.radius = radius;
    }

    // Menghitung volume bola: V = 4/3 * π * r³
    @Override
    public double getVolume() {
        return 4.0 / 3.0 * PI * Math.pow(radius, 3);
    }

    // Menghitung luas permukaan: A = 4 * π * r²
    @Override
    public double getSurfaceArea() {
        return 4 * PI * radius * radius;
    }

    // Menghitung massa dalam gram
    @Override
    public double getMass() {
        return getSurfaceArea() * DENSITY * THICKNESS;
    }

    // Konversi gram ke kilogram
    @Override
    public double gramToKilogram() {
        return getMass() / DENOMINATOR;
    }

    // Menghitung biaya kirim dalam rupiah
    @Override
    public double calculateCost() {
        return Math.ceil(gramToKilogram()) * PRICE_PER_KG;
    }

    // Menampilkan semua informasi bentuk bola
    @Override
    public void printInfo() {
        System.out.printf("Volume            : %.2f\n", getVolume());
        System.out.printf("Luas permukaan    : %.2f\n", getSurfaceArea());
        System.out.printf("Massa             : %.2f\n", getMass());
        System.out.printf("Massa dalam kg    : %.2f\n", gramToKilogram());
        System.out.printf("Biaya kirim       : Rp%.0f\n", calculateCost());
    }
}