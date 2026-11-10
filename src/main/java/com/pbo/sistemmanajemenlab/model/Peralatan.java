package com.pbo.sistemmanajemenlab.model;

/**
 * SUPERCLASS - Peralatan
 * Merupakan class induk yang merepresentasikan peralatan laboratorium secara umum.
 * 
 * Materi yang diterapkan:
 * - Class dan Object (Pert. 3): Struktur kode dipisahkan dalam bentuk Class
 * - Encapsulation (Pert. 4): Semua field bersifat private dengan Getter dan Setter
 * - Inheritance (Pert. 6): Class ini menjadi Superclass untuk PeralatanElektronik dan PeralatanKimia
 */
public class Peralatan {

    // ==================== ENCAPSULATION ====================
    // Semua atribut menggunakan access modifier PRIVATE
    private String idPeralatan;
    private String namaPeralatan;
    private String kondisi; // "Baik", "Rusak Ringan", "Rusak Berat"
    private boolean tersedia;

    // ==================== CONSTRUCTOR ====================
    public Peralatan(String idPeralatan, String namaPeralatan, String kondisi) {
        this.idPeralatan = idPeralatan;
        this.namaPeralatan = namaPeralatan;
        this.kondisi = kondisi;
        this.tersedia = true; // Default: peralatan tersedia
    }

    // ==================== GETTER & SETTER ====================

    public String getIdPeralatan() {
        return idPeralatan;
    }

    public void setIdPeralatan(String idPeralatan) {
        this.idPeralatan = idPeralatan;
    }

    public String getNamaPeralatan() {
        return namaPeralatan;
    }

    public void setNamaPeralatan(String namaPeralatan) {
        this.namaPeralatan = namaPeralatan;
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
     * Menampilkan informasi lengkap peralatan
     */
    public void tampilkanInfo() {
        System.out.println("  ID         : " + idPeralatan);
        System.out.println("  Nama       : " + namaPeralatan);
        System.out.println("  Kondisi    : " + kondisi);
        System.out.println("  Status     : " + (tersedia ? "Tersedia" : "Sedang Dipinjam"));
    }
}
