package uap.interfaces;

/**
 * Interface untuk konversi massa dari gram ke kilogram.
 */
public interface MassConverter {
    static final int DENOMINATOR = 1000; // konstanta untuk konversi gram ke kg
    double gramToKilogram();             // mengembalikan massa dalam kilogram
}