package com.pbo.sistemmanajemenlab.model;

public class Alat {

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
    public String getInfo() {
        return "Alat: " + namaAlat + " [ID: " + idAlat + "] | Kondisi: " + kondisi + " | Status: " + (tersedia ? "Tersedia" : "Dipinjam");
    }

    public void tampilkanInfo() {
        System.out.println("  ID Alat    : " + idAlat);
        System.out.println("  Nama Alat  : " + namaAlat);
        System.out.println("  Kondisi    : " + kondisi);
        System.out.println("  Status     : " + (tersedia ? "Tersedia di Lab" : "Sedang Dipinjam"));
    }
}
