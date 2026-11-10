package com.pbo.sistemmanajemenlab.model;

/**
 * SUBCLASS - Proyektor (extends Alat)
 * Merepresentasikan unit Proyektor inventaris Laboratorium Komputer.
 * 
 * Materi yang diterapkan:
 * - Inheritance (Pert. 6): Mewarisi atribut dan method dari Superclass Alat
 * - Encapsulation (Pert. 4): Atribut spesifik bersifat private dengan Getter dan Setter
 */
public class Proyektor extends Alat {

    // ==================== ENCAPSULATION (Pert. 4) ====================
    // Atribut spesifik proyektor lab (PRIVATE)
    private String resolusi;
    private int kecerahanLumens;

    // ==================== CONSTRUCTOR ====================
    public Proyektor(String idAlat, String namaAlat, String kondisi, 
                     String resolusi, int kecerahanLumens) {
        // Memanggil constructor Superclass (Alat) menggunakan keyword super()
        super(idAlat, namaAlat, kondisi);
        this.resolusi = resolusi;
        this.kecerahanLumens = kecerahanLumens;
    }

    // ==================== GETTER & SETTER ====================
    public String getResolusi() {
        return resolusi;
    }

    public void setResolusi(String resolusi) {
        this.resolusi = resolusi;
    }

    public int getKecerahanLumens() {
        return kecerahanLumens;
    }

    public void setKecerahanLumens(int kecerahanLumens) {
        this.kecerahanLumens = kecerahanLumens;
    }

    // ==================== OVERRIDE METHOD ====================
    /**
     * Override method tampilkanInfo() dari Superclass Alat
     * untuk menambahkan spesifikasi teknis proyektor laboratorium.
     */
    @Override
    public void tampilkanInfo() {
        System.out.println("  [Kategori: Proyektor Lab]");
        super.tampilkanInfo(); // Memanggil method milik Superclass
        System.out.println("  Resolusi   : " + resolusi);
        System.out.println("  Kecerahan  : " + kecerahanLumens + " Lumens");
    }
}
