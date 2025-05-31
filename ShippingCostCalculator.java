package uap.interfaces;

/**
 * Interface untuk menghitung biaya kirim berdasarkan berat (per kilogram).
 */
public interface ShippingCostCalculator {
    static final int PRICE_PER_KG = 2000; // harga kirim per kilogram
    double calculateCost();               // mengembalikan biaya kirim
}