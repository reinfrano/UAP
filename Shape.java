package uap.bases;

/**
 * Abstract class sebagai dasar bentuk geometris dengan nama dan metode printInfo().
 */
public abstract class Shape {
    protected String name; // nama bentuk

    public Shape() {}

    // Menetapkan nama bentuk
    public void setName(String inputName) {
        this.name = inputName;
    }

    // Mengambil nama bentuk
    public String getName() {
        return name;
    }

    // Method abstrak untuk mencetak informasi bentuk
    public abstract void printInfo();
}