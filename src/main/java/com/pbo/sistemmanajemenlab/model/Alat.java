package com.pbo.sistemmanajemenlab.model;

/**
 * SUPERCLASS - Alat
 * Merepresentasikan peralatan umum inventaris Laboratorium Komputer.
 * 
 * Materi yang diterapkan:
 * - Class dan Object (Pert. 3): Struktur kode dipisahkan dalam bentuk Class
 * - Encapsulation (Pert. 4): Semua atribut bersifat private dan diakses lewat Getter & Setter
 * - Inheritance (Pert. 6): Menjadi Superclass bagi Komputer dan Proyektor
 */
public class Alat {

    // ==================== ENCAPSULATION (Pert. 4) ====================
    // Atribut dideklarasikan dengan access modifier PRIVATE
    private String idAlat;
    private String namaAlat;
    private String kondisi; // "Baik", "Rusak Ringan", "Rusak Berat"
    private boolean tersedia;

    // ==================== CONSTRUCTOR ====================
    public Alat(String idAlat, String namaAlat, String kondisi) {
        this.idAlat = idAlat;
        this.namaAlat = namaAlat;
        this.kondisi = kondisi;
        this.tersedia = true; // Default: alat tersedia di lab
    }

    // ==================== GETTER & SETTER ====================
    public String getIdAlat() {
        return idAlat;
    }

    public void setIdAlat(String idAlat) {
        this.idAlat = idAlat;
    }

    public String getNamaAlat() {
        return namaAlat;
    }

    public void setNamaAlat(String namaAlat) {
        this.namaAlat = namaAlat;
    }

    public String getKondisi() {
        return kondisi;
    }

    public void setKondisi(String kondisi) {
        this.kondisi = kondisi;
    }

    public boolean isTersedia() {
        return tersedia;
    }

    public void setTersedia(boolean tersedia) {
        this.tersedia = tersedia;
    }

    // ==================== METHOD ====================
    /**
     * Menampilkan informasi umum alat laboratorium komputer.
     */
    public void tampilkanInfo() {
        System.out.println("  ID Alat    : " + idAlat);
        System.out.println("  Nama Alat  : " + namaAlat);
        System.out.println("  Kondisi    : " + kondisi);
        System.out.println("  Status     : " + (tersedia ? "Tersedia di Lab" : "Sedang Dipinjam"));
    }
}
