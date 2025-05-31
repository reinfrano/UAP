package uap.interfaces;

/**
 * Interface untuk perhitungan massa berbasis luas permukaan, ketebalan, dan densitas.
 */
public interface MassCalculable {
    static final double DENSITY = 8.0;   // kerapatan stainless steel 304 dalam g/cm³
    static final double THICKNESS = 0.5; // ketebalan bahan dalam cm
    double getMass();                    // menghitung massa dalam gram
}